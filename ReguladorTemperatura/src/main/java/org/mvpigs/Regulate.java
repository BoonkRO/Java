package org.mvpigs;

interface Regulate {
    public void regulate(Thermometer t, Heater h, double minTemp, double maxTemp, RoomTemperature temperature);
    public void message(RegulatorDisplayCodes code, RoomTemperature temperature);

}
