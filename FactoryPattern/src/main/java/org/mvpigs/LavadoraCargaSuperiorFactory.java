package org.mvpigs;

public class LavadoraCargaSuperiorFactory extends FactoryLavadora {

    @Override
    public Lavadora crearLavadoraTipo() {
        return new LavadoraCargaSuperior();
    }
}
