package org.mvpigs;

public abstract class Lavadora {

    protected boolean tieneTambor = false;
    protected boolean tieneMandos = false;
    protected String  tipoCarga = null;

    public void ponerTambor() {

        this.tieneTambor = true;
    }

    public void ponerMandos() {

        this.tieneMandos = true;
    }

}