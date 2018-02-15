package org.mvpigs;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.locks.Condition;

public class PoolConductores {
    private ArrayList<Conductor> poolConductores = new ArrayList<Conductor>();


    public PoolConductores(ArrayList<Conductor> poolConductores){
        this.poolConductores =  poolConductores;
    }

    public ArrayList<Conductor> getPoolConductores() {
        return poolConductores;
    }

    public Conductor asignarConductor(){
        Conductor conductor = new Conductor();
        Random aleatorio = new Random();
        boolean asignado = false;

        while (!asignado){
            int index = aleatorio.nextInt(getPoolConductores().size());
            conductor = getPoolConductores().get(index);
            if (!conductor.isOcupado()){
                conductor.setOcupado(true);
                asignado = true;
            }
        }
        return conductor;
    }

}
