package jar;

public class TarjetaUsuario {
    private String id;
    private boolean activada;

    /* Constructores */

    public TarjetaUsuario(String id, boolean activada){
        this.id = id;
        this.activada = activada;
    }

    /* Encapsulacion */
    public boolean getActivada(){
        return this.activada;
    }

    public void setActivada(boolean activada){
        this.activada = activada;
    }
}
