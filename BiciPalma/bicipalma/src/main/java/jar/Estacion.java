package jar;

import jar.Bicicleta;
import jar.TarjetaUsuario;

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

//    public String consultarAnclajes() {
//
//        for (Bicicleta anclaje: this.anclajes){
//            if (anclaje == null){
//                return "Está libre";
//            }else{
//
//            }
//            System.out.println(this.getId());
//
//        }
//        return "holi";
//    }




}