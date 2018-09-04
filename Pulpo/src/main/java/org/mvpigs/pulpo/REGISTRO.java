package org.mvpigs.pulpo;


import java.util.Arrays;

public class REGISTRO {
    private String[] eventos = null;
    private boolean pulpo = false;

    public REGISTRO(){
    }

    public REGISTRO(String[] eventos, boolean pulpo){
        this.eventos = eventos;
        this.pulpo = pulpo;
    }

    public String[] getEventos() {
        return eventos;
    }

    public boolean getPulpo() {
        return pulpo;
    }

    public void contieneEvento(String evento, String[] eventos){
        int posicion = 0;
        int posRegistro = 0;
        for (String accion: eventos){
            if (evento == eventos[posicion]){
                pulpo = true;
                eventos[posRegistro] = evento;
                posRegistro++;
                posicion++;
            }else{
                posicion++;
            }
        }
        mostrarRegistro();
    }


    public void mostrarRegistro(){
        System.out.println("eventos: " + Arrays.toString(getEventos()).substring(1).replace("]", ""));
        System.out.println("pulpo: " + getPulpo());
    }



}
