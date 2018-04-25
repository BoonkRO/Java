package org.mvpigs;

public abstract class FactoryLavadora {

    public Lavadora  crearLavadora() {
        Lavadora lavadora = crearLavadoraTipo();
        lavadora.ponerMandos();
        lavadora.ponerTambor();
        return lavadora;
    }

    protected abstract Lavadora crearLavadoraTipo();

}
