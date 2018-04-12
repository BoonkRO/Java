package org.mvpigs;

import org.mvpigs.Heater;
import org.mvpigs.RoomTemperature;

public class GasHeater implements Heater {

    public void engage(RoomTemperature temperature){
        temperature.incrementTemperature(1);
    }

    public void disengage(RoomTemperature temperature){
        temperature.incrementTemperature(-1);
    }
}