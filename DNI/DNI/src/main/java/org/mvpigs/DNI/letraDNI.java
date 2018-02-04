package org.mvpigs.DNI;

public class letraDNI {

    private char letra;
    private String dni;
    private char[] tabla = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V',
            'H', 'L', 'C', 'K', 'E' };

    /*Constructores*/
    public letraDNI(String dni) {
        this.dni = dni;
        calcularLetra(dni);
    }

    /* Getters y Setters */
    public char getLetra() {
        return this.letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public String getDNI() {
        return dni;
    }

    public void setDNI(String dni) {
        this.dni = dni;
    }

    /* Privates */
    private void calcularLetra(String dni) {
        if (isNumeric(dni)) {
            int number = Integer.parseInt(dni);
            this.letra = tabla[calcularResto(number)];
        } else {
            System.out.print("error");
            this.letra = 'o';
        }
    }

    private int calcularResto(int suma) {
        return suma % (tabla.length);
    }

    private static boolean isNumeric(String caracter) {
        try {
            Integer.parseInt(caracter);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
}
