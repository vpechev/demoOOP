package com.scalefocus.domain;

import com.scalefocus.common.Color;
import com.scalefocus.common.EngineType;

public class Car {
    // ############## BEGIN PROPERTIES ##############
    public EngineType engineType;
    public int engineVolume;
    public int horsePowers;
    public Color color;
    // ############## END PROPERTIES ##############

    // ############## Begin CONSTRUCTORS ##############
    public Car(EngineType engineType){
        this.engineType = engineType;
    }

    protected Car(EngineType engineType, int engineVolume, int horsePowers, Color color){
        this(engineType);

        this.engineVolume = engineVolume;
        this.horsePowers = horsePowers;
        this.color = color;
    }
    // ############## END CONSTRUCTORS ##############

    // ############## BEGIN GETTERS & SETTERS ##############
    public EngineType getEgineType() {
        return engineType;
    }

    protected void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    public int getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(int engineVolume) {
        this.engineVolume = engineVolume;
    }

    public int getHorsePowers() {
        return horsePowers;
    }

    public void setHorsePowers(int horsePowers) {
        this.horsePowers = horsePowers;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    // ############## END GETTERS & SETTERS ##############

    @Override
    public String toString() {
        return "\nCar{\n\t" +
                getClass().getName() + "@" + Integer.toHexString(hashCode()) + "\n\t" +
                "engineType=" + engineType + "\n\t" +
                "engineVolume=" + engineVolume + "\n\t" +
                "horsePowers=" + horsePowers + "\n\t" +
                "color=" + color + "\n" +
                "}\n";
    }
}
