package org.mvpigs;

import org.mvpigs.GasHeater;
import org.mvpigs.Regulator;
import org.mvpigs.RemoteCommandSensor;
import org.mvpigs.Heater;
import org.mvpigs.Thermometer;
import org.mvpigs.Jedi;
import org.mvpigs.RoomTemperature;

public class App
{
    public static void main( String[] args )
    {
        final double minTemp = 15.0;
        final double maxTemp = 21.0;

        RoomTemperature temperature = new RoomTemperature(15);
        Heater heater = new GasHeater();
        Thermometer thermometer = new RemoteCommandSensor();

        Regulator regulator = new Regulator();

        System.out.println( "Arrancando..." );
        regulator.regulate(thermometer, heater, minTemp, maxTemp, temperature);

        Jedi yoda = new Jedi();
        System.out.println( "\nArrancando a Yoda: " );
        regulator.regulate(thermometer, yoda, minTemp, maxTemp, temperature);
        yoda.speak();
    }
}