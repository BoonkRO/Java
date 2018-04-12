package org.mvpigs;

import org.mvpigs.Heater;
import org.mvpigs.Thermometer;
import org.mvpigs.RegulatorDisplayCodes;
import org.mvpigs.RoomTemperature;

public class Regulator implements Regulate{
    public void regulate(Thermometer t, Heater h, double minTemp, double maxTemp, RoomTemperature temperature) {
        RegulatorDisplayCodes code;
        while (t.read(temperature) < maxTemp) {
            code = RegulatorDisplayCodes.HEATING;
            h.engage(temperature);
            message(code, temperature);
        }
        while (t.read(temperature) > minTemp) {
            code = RegulatorDisplayCodes.WAITING;
            h.disengage(temperature);
            message(code, temperature);
        }
    }

    public void message(RegulatorDisplayCodes code, RoomTemperature temperature) {
        switch (code) {
            case HEATING:
                System.out.println("Calentando => temperatura " + temperature.getTemperature());
                break;
            case WAITING:
                System.out.println("Apagado => temperatura " + temperature.getTemperature());
                break;
            default:
                System.out.println("Algo raro sucede...");
                break;
        }
    }
}
