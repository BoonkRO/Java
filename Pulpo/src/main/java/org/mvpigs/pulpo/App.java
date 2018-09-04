package org.mvpigs.pulpo;


import java.awt.*;
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
        System.out.println("Existe el valor hamburguesa --> " + Arrays.toString(registro.getEventos()).substring(1).replace("]", "").contains("hamburguesa"));
        System.out.println("Existe el valor pizza --> " + Arrays.toString(registro.getEventos()).substring(1).replace("]", "").contains("pizza"));


        String[] reg1 = {"trabajar", "tocar un árbol", "hamburguesa", "correr", "twitter"};
        REGISTRO registro1 = new REGISTRO(reg1, false);
        String[] reg2 = {"trabajar", "helado", "coliflor", "lasaña", "tocar un árbol", "lavarse los dientes"};
        REGISTRO registro2 = new REGISTRO(reg2, false);
        String[] reg3 = {"finde", "bicicleta", "descansar", "cacahuetes", "cerveza"};
        REGISTRO registro3 = new REGISTRO(reg3, true);

        // NO HE CONSEGUIDO AVERIGUAR COMO PASARLE LOS EJEMPLOS EN FORMA DE ARRAY (YA QUE TIENEN QUE SER ARRAYS DE REGISTRO)
        // DIARIO diario = new DIARIO(registro1, registro2, registro3);
        


    }
}
