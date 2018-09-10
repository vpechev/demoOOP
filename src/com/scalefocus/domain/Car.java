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
    public Car(){}

    public Car(EngineType engineType, int engineVolume, int horsePowers, Color color){
        this.engineType = engineType;
        this.engineVolume = engineVolume;
        this.horsePowers = horsePowers;
        this.color = color;
    }
    // ############## END CONSTRUCTORS ##############

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
