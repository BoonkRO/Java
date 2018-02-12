package org.mvpigs;

import org.mvpigs.MySQL.dbConnection;

import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.Scanner;



//Conexion a Base de Datos
public class MainBD {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String args[]) throws ClassNotFoundException {

        try {
            String menu = "Opciones a realizar:" + "\n" +
                    "1. Lista Empleados." + "\n" +
                    "2. Nuevo Empleado" + "\n" +
                    "3. Borrar Empleado" + "\n" +
                    "4. Empleados de cada empresa" + "\n" +
                    "5. Media de sueldo por empresa" + "\n";

            System.out.println(menu);
            String input = keyboard.nextLine();
            int reader = Integer.parseInt(input);

            switch (reader) {
                case 1:
                    mostarListaEmpleados();
                    break;
                case 2:
                    crearNuevoEmpleado();
                    break;
                case 3:
                    eliminarEmpleado();
                    break;
                case 4:
                    consultarEmpleadosEmpresa();
                    break;
                case 5:
                    sueldoMedioTodasEmpresas();
                    break;
            }
        } catch (Exception ex) {
            System.out.println("¡ERROR!");
        }
    }

    private static void sueldoMedioTodasEmpresas() throws SQLException {
        String query = "SELECT DISTINCT empresa.nombre AS NombreEmpresa, seccion.nombre AS Seccion, AVG(nomina.sueldo) AS SueldoMedio FROM nomina JOIN empleados ON nomina.idNomina = empleados.Nomina_idNomina JOIN empresa_tiene_empleados ON empleados.idEmpleados = empresa_tiene_empleados.Empleados_idEmpleados JOIN empresa ON empresa_tiene_empleados.Empresa_idEmpresa = empresa.idEmpresa JOIN seccion ON empresa.Seccion_idSeccion = seccion.idSeccion GROUP BY NombreEmpresa";
        ResultSet rs = dbConnection.executeQueryRS(query);
        while (rs.next())    {
            System.out.println("Nombre Empresa: " + rs.getString("NombreEmpresa"));
            System.out.println("Seccion: " + rs.getString("Seccion"));
            System.out.println("Sueldo Medio: " + rs.getString("SueldoMedio"));
        }
    }

    private static void consultarEmpleadosEmpresa() throws SQLException {
        String query = "SELECT DISTINCT empresa.nombre, COUNT(empresa_tiene_empleados.Empleados_idEmpleados) AS totalEmpleados FROM empresa JOIN empresa_tiene_empleados ON empresa.idEmpresa = empresa_tiene_empleados.Empresa_idEmpresa GROUP BY empresa.nombre";
        ResultSet rs = dbConnection.executeQueryRS(query);
        while (rs.next()){
            System.out.println("Nombre Empleado: " + rs.getString("empresa.nombre"));
            System.out.println("Total Empleados: " + rs.getString("totalEmpleados"));
        }
    }

    private static boolean eliminarEmpleado() throws SQLException {
        String query = "SELECT * FROM Empleados";
        ResultSet rs = dbConnection.executeQueryRS(query);
        while (rs.next()){
            System.out.println("ID Empleado: " + rs.getString("idEmpleados"));
            System.out.println("Nombre: " + rs.getString("nombre"));
            System.out.println("Apellido: " + rs.getString("apellido"));
            System.out.println("DNI: " + rs.getString("DNI"));
            System.out.println("Telefono: " + rs.getString("telefono"));
        }

        System.out.println("¿Qué empleado deseas eliminar? Introduce su ID." + "\n");
        String input = keyboard.nextLine();
        int reader = Integer.parseInt(input);

        String queryUpdate = "DELETE FROM Empleados WHERE idEmpleados = '" + reader + "'";
        int resultInt = dbConnection.executeUpdate(queryUpdate);

        if (resultInt != -1) {
            System.out.println("Empleado eliminado.");
        } else {
            System.out.println("ERROR, operación cancelada.");
        }
        return resultInt != -1;
    }

    private static boolean crearNuevoEmpleado() {

        System.out.println("Nombre: " + "\n" + "Apellido: " + "\n" + "DNI: " + "\n" + "Telefono: " + "\n" + "ID Nomina: ");
        String Nombre = keyboard.nextLine();
        String Apellido = keyboard.nextLine();
        int DNI = Integer.parseInt(keyboard.nextLine());
        int Telefono = Integer.parseInt(keyboard.nextLine());
        int Nomina = Integer.parseInt(keyboard.nextLine());


        String queryUpdate = "INSERT INTO empresa.empleados (nombre, apellido, DNI, telefono, Nomina_idNomina)"
                + " VALUES ('" + Nombre + "'," + "'" + Apellido + "'," + DNI + "," + Telefono + "," + Nomina + ")";
        System.out.println(queryUpdate);
        int resultInt = dbConnection.executeUpdate(queryUpdate);

        if (resultInt != -1) {
            System.out.println("Empleado añadido.");
        } else {
            System.out.println("ERROR, operación cancelada.");
        }
        return resultInt != -1;

    }

    private static void mostarListaEmpleados() throws SQLException {
        String query = "Select idEmpleados, nombre, apellido, DNI, telefono from Empleados";
        ResultSet rs = dbConnection.executeQueryRS(query);
        while (rs.next()){
            System.out.println("ID Empleado: " + rs.getString("idEmpleados"));
            System.out.println("Nombre: " + rs.getString("nombre"));
            System.out.println("Apellido: " + rs.getString("apellido"));
            System.out.println("DNI: " + rs.getString("DNI"));
            System.out.println("Telefono: " + rs.getString("telefono"));
        }

    }

}
