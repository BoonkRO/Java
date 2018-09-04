package org.mvpigs.pulpo;

import java.awt.*;
import java.util.Arrays;

public class DIARIO {

    private REGISTRO[] registros = null;


    public DIARIO(){
    }

    public DIARIO(REGISTRO[] registros){
        this.registros = registros;
    }

    public REGISTRO[] getRegistros() {
        return registros;
    }

    public void incluirRegistro(REGISTRO registro){
        int posicion = 0;
        for (REGISTRO elem: registros){
            registros[posicion] = registro;
        }
    }

    public void mostrarDiario(){
        System.out.println(Arrays.toString(getRegistros()));
    }
}

