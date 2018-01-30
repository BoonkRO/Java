
public class Estacion(){
    private int id = 0;
    private String direccion = null;
    private int numeroAnclajes = 0;
    private Bicicletas[] anclajes = null;

    /* Constructores */
    public Estacion(int id, String direccion, int anclajes){
        this.id = id;
        this.direccion = direccion;
        this.numeroAnclajes = anclajes;
    }

    public int getId(){
        return id;
    }

    public String getDireccion(){
        return direccion;
    }

    public int getNumeroAnclajes(){
        return numeroAnclajes;
    }

    




}