package jar;

public class Estacion{
    private int id = 0;
    private String direccion = null;
    private int numeroAnclajes = 0;

    /* Constructores */
    public Estacion(int id, String direccion, int anclajes){
        this.id = id;
        this.direccion = direccion;
        this.numeroAnclajes = anclajes;
    }

    /* Encapsulacion */
    public int getId(){
        return id;
    }

    public String getDireccion(){
        return direccion;
    }

    public int getNumeroAnclajes(){
        return numeroAnclajes;
    }

    /* Logica */
    public void consultarEstacion() {
        System.out.println("id:" + getId());
        System.out.println("direccion:" + getDireccion());
        System.out.println("anclaje:" + getNumeroAnclajes());
    }

    public void anclajesLibres(){

    }



}