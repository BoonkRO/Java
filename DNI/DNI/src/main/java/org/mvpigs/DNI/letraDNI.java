package main.java.org.mvpigs.DNI;

public class letrasDNI{
    
    private char letra;
    private String dni;
    private char[] tabla = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};


    /*Constructores*/
    public letrasDNI(){
        this.dni = dni;
        calcularLetra(dni);
    }


    /* Getters y Setters */
    public char getLetra(){
        return this.letra;
    }

    public void setLetra(String dni){
        this.dni = dni;
    }

    public String getDNI(){
        return dni;
    }

    public void setDNI(String dni){
        this.dni = dni;
    }


    /* Privates */
    private void calcularLetra(String dni){
        if(isNumeric(dni)){
            int number = Integer.parseInt(dni);
            this.letra = letras[calcularResto(number)];
        }else{
            System.out.print("error");
            this.letra = "o";
        }
    }

    private int calcularResto(int suma){
        return suma % (letras.length);
    }

    private static boolean isNumeric(String caracter){
        try{
            Integer.parseInt(caracter);
            return true;
        } catch (NumberFormatException nfe){
            return false;
        }
    }
}


