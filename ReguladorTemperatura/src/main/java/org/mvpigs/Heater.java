package org.mvpigs;

import org.mvpigs.RoomTemperature;

interface Heater {

    public void engage(RoomTemperature temperature);
    public void disengage(RoomTemperature temperature);
}
