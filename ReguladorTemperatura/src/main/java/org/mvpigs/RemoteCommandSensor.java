package org.mvpigs;

import org.mvpigs.Thermometer;
import org.mvpigs.RoomTemperature;

public class RemoteCommandSensor implements Thermometer {

    public double read(RoomTemperature temperature) {
        return temperature.getTemperature();
    }

}