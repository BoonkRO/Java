package org.mvpigs.interfaces;

import org.mvpigs.types.RegulatorDisplayCodes;
import org.mvpigs.types.RoomTemperature;
import org.mvpigs.interfaces.Thermometer;

public interface Regulate {
    public void regulate();
    public void message();

}
