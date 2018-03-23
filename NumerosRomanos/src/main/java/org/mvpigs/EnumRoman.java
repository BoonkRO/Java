package org.mvpigs;

import java.util.EnumSet;

public enum EnumRoman {

    I(1), V(5), X(10), L(50), C(100), D(500), M(1000);

    private int valorDecimal;

    EnumRoman(int valor){
        this.valorDecimal = valorDecimal;
    }

    public int getValorDecimal(){
        return this.valorDecimal;
    }

}
