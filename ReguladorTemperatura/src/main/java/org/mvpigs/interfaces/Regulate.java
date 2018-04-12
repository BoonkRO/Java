package org.mvpigs.interfaces;

import org.mvpigs.types.RegulatorDisplayCodes;
import org.mvpigs.types.RoomTemperature;
import org.mvpigs.interfaces.Thermometer;

public interface Regulate {
    public void regulate(Thermometer t, Heater h, double minTemp, double maxTemp, RoomTemperature temperature);
    public void message(RegulatorDisplayCodes code, RoomTemperature temperature);

}
