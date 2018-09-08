package com.scalefocus.domain;

import com.scalefocus.common.Color;
import com.scalefocus.common.EngineType;

public class Car {
    // ############## BEGIN PROPERTIES ##############
    private EngineType engineType;
    private int engineVolume;
    private int horsePowers;
    private Color color;
    // ############## END PROPERTIES ##############

    // ############## Begin CONSTRUCTORS ##############
    public Car(){}

    public Car(EngineType engineType, int engineVolume, int horsePowers, Color color){
        this.engineType = engineType;
        this.engineVolume = engineVolume;
        this.horsePowers = horsePowers;
        this.color = color;
    }
    // ############## END CONSTRUCTORS ##############

    // ############## Begin GETTERS & SETTERS ##############
    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
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
        return "Car{" +
                "engineType=" + engineType +
                ", engineVolume=" + engineVolume +
                ", horsePowers=" + horsePowers +
                ", color=" + color +
                '}';
    }
}
