package org.mvpigs.main;

import org.mvpigs.otherstuff.Jedi;
import org.mvpigs.types.RoomTemperature;
import org.mvpigs.hardware.GasHeater;
import org.mvpigs.hardware.Regulator;
import org.mvpigs.hardware.RemoteCommandSensor;
import org.mvpigs.interfaces.Heater;
import org.mvpigs.interfaces.Thermometer;

public class App
{
    public static void main( String[] args )
    {
        final double minTemp = 15.0;
        final double maxTemp = 21.0;

        //RoomTemperature temperature = new RoomTemperature(15);
        Heater heater = new GasHeater();
        Thermometer thermometer = new RemoteCommandSensor();

        Regulator regulator = new Regulator(thermometer, heater, minTemp, maxTemp, RoomTemperature.getInstance());

        System.out.println( "Arrancando..." );
        regulator.regulate();

        Jedi yoda = new Jedi();
        System.out.println( "\nArrancando a Yoda: " );
        regulator.regulate();
        yoda.speak();
    }
}