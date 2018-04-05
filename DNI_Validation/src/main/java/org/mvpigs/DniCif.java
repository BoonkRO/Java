package org.mvpigs;


import java.io.IOException;

public class DniCif {

    private String dni  = null;
    private Boolean numero = false;
    private Boolean letra 	= false;
    private Boolean dniCif  = false;
    private TablaAsignacion tabla = new TablaAsignacion();

    /* Constructores */

    public DniCif(String dni) {
        this.dni = dni;
    }

    /* Encapsulacion */

    public void setDni(String cadena){
        this.dni = cadena;
    }

    public String getDni(){
        return this.dni;
    }

    private void setNumero(Boolean valor){
        this.numero = valor;
    }

    public Boolean getNumero(){
        return this.numero;
    }

    private void setLetra(Boolean valor){
        this.letra = valor;
    }

    public Boolean getLetra(){
        return this.letra;
    }

    public void setDniCif(Boolean valor){
        this.dniCif = valor;
    }

    public Boolean getDniCif(){
        return this.dniCif;
    }



    public Boolean checkCIF(){
        setDniCif( checkDni() && checkLetra() );
        return getDniCif();
    }

    public Boolean checkDni(){
        setNumero( checkLongitud() && stringEsNumero( getParteNumericaDni() ) );
        return getNumero();
    }

    public Boolean checkLetra(){
        if (getNumero() ) {
            setLetra ( Character.isUpperCase(getParteAlfabeticaDni()) && checkLetraValida() );
            return getLetra();
        }
        else {
            return false;
        }
    }

    public Character obtenerLetra() throws IOException{
        if ( getNumero() ){
            return this.tabla.calcularLetra( getParteNumericaDni() );
        }
        else
            throw new IOException("Parte numérica del DNI no está correcta");
    }


    public Boolean checkLongitud() {
        return getDni().length() == 9;
    }

    public Boolean stringEsNumero(String cadena){
        for( int i=0; i < cadena.length(); i++ ){
            if ( ! Character.isDigit(cadena.charAt(i)) ){
                return false;
            }
            else;
        }
        return true;
    }

    public String getParteNumericaDni() {
        return (String) dni.substring(0, dni.length() - 1);
    }

    public Character getParteAlfabeticaDni() {
        return dni.charAt(dni.length() - 1);
    }

    public Boolean checkLetraValida() {
        try {
            return getParteAlfabeticaDni() == obtenerLetra();
        }
        catch(IOException ioexcepcion){
            return false;
        }

    }

}