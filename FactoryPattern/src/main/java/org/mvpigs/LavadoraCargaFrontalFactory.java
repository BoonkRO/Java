package org.mvpigs;

public class LavadoraCargaFrontalFactory extends FactoryLavadora {

    @Override
    public Lavadora crearLavadoraTipo(){
        return new LavadoraCargaFrontal();
    }

}
