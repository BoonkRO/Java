package jar;

import jar.Bicicleta;
import jar.TarjetaUsuario;
import jdk.nashorn.internal.runtime.BitVector;


public class Estacion {

    private int id;
    private String direccion;
    private int numeroAnclajes;
    private Bicicleta[] anclajes = null;


    /* Constructores */
    public Estacion(int id, String direccion, int anclajes) {
        this.id = id;
        this.direccion = direccion;
        this.numeroAnclajes = anclajes;
        this.anclajes = new Bicicleta[anclajes];
    }

    /* Encapsulacion */
    public int getId() {
        return id;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getNumeroAnclajes() {
        return numeroAnclajes;
    }

    /* Logica */
    public void consultarEstacion() {
        System.out.println("id:" + getId());
        System.out.println("direccion:" + getDireccion());
        System.out.println("anclaje:" + getNumeroAnclajes());
    }

    public int anclajesLibres() {
        int anclajLibres = 0;
        for ( Bicicleta anclaje: this.anclajes ){
            if (anclaje == null) {
                anclajLibres++;
            }
        }
        return anclajLibres;
    }

    public void consultarAnclajes() {

        for (Bicicleta anclaje: this.anclajes){
            if (anclaje == null){
                System.out.println("FREE!");
            }else {
                System.out.println(anclaje.getId());
            }
        }
    }

    public void anclarBicicleta(Bicicleta bicicleta){
        int posicion = 0;
        boolean anclajeLibre = true;
        while(posicion<numeroAnclajes && anclajeLibre){
            if(anclajes[posicion] == null){
                anclajes[posicion] = bicicleta;
                anclajeLibre = false;
                mostrarAnclaje(bicicleta, posicion);
            }else{
                posicion++;
            }
        }
    }

    private void mostrarAnclaje(Bicicleta bicicleta, int posicion) {
        System.out.println("Bicicleta nº " + bicicleta.getId() + " anclada en anclaje " + posicion);
    }

    public boolean leerTarjetaUsuario(TarjetaUsuario tarjetaUsuario){
        return tarjetaUsuario.getActivada();
    }

    public void mostrarBicicleta(Bicicleta bicicleta, int posicion){
        System.out.println("La bicicleta con ID " + bicicleta.getId() + " estaba en el anclaje " + posicion);

    }

}