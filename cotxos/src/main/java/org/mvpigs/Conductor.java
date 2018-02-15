package org.mvpigs;

import java.util.ArrayList;

public class Conductor {
    public String nombre;
    public String modelo;
    public String matricula;
    private double valoracionMedia;
    private ArrayList<Byte> valoraciones = new ArrayList<Byte>();
    public boolean ocupado;

    public Conductor(){
    }

    public Conductor(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getValoracion() {
        return this.valoracionMedia;
    }

    public void setValoracion(byte valoracion) {
        this.valoraciones.add(valoracion);
        this.calcularValoracionMedia();
    }

    private double calcularValoracionMedia(){
        int valoracionTotal = 0;
        for (byte valoracion: this.valoraciones){
            valoracionTotal += valoracion;
        }
        this.valoracionMedia = valoracionTotal / this.valoraciones.size();
        return this.valoracionMedia;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public boolean isOcupado() {
        return ocupado;
    }
}
