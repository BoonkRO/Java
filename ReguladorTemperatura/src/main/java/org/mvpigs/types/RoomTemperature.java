package org.mvpigs.types;

public class RoomTemperature {

    private double temperature = 15;

    private static RoomTemperature instance = new RoomTemperature();

    private RoomTemperature(){
    }

    public static RoomTemperature getInstance(){
        if (instance == null){
            instance = new RoomTemperature();
        }
        return instance;
    }

    public RoomTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperature() {

        return this.temperature;
    }

    public void setTemperature(double temperature) {

        this.temperature = temperature;
    }

    public void incrementTemperature(double increment) {
        this.temperature += increment;
    }

}
