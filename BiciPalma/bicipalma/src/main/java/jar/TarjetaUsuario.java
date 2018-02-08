package jar;

public class TarjetaUsuario {
    private int id;
    private boolean activada;

    /* Constructores */

    public TarjetaUsuario(int id, boolean activada){
        this.id = id;
        this.activada = activada;
    }

    /* Encapsulacion */

    public int getId(){
        return id;
    }

    public void setId(int id){
        String stringID = Integer.toString(id);
    }

    public String getStringID(String stringID){
        return stringID;
    }


}
