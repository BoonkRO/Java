package org.mvpigs.pulpo;


import java.util.Arrays;

public class App
{
    public static void main( String[] args )
    {
        String[] datos = {"trabajar", "tocar un árbol", "hamburguesa", "correr", "twitter"};
        REGISTRO registro = new REGISTRO( datos, false);

        System.out.println("Test Registro: ");
        registro.mostrarRegistro();
        System.out.println(".");
        System.out.println("La longitud es 5 --> " + registro.getEventos().length);
        System.out.println("El valor de pulpo es false --> " + registro.getPulpo());
        System.out.println("Existe el valor hamburguesa y pizza no existe --> " + Arrays.toString(registro.getEventos()).substring(1).replace("]", ""));








    }
}
