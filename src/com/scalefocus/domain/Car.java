package com.scalefocus.domain;

import com.scalefocus.common.Color;
import com.scalefocus.common.EngineType;

public class Car {
    // ############## BEGIN PROPERTIES ##############
    public EngineType carType;
    public int engineVolume;
    public int horsePowers;
    public Color color;
    // ############## END PROPERTIES ##############

    // ############## Begin CONSTRUCTORS ##############
    public Car(){}

    public Car(EngineType carType, int engineVolume, int horsePowers, Color color){
        this.carType = carType;
        this.engineVolume = engineVolume;
        this.horsePowers = horsePowers;
        this.color = color;
    }
    // ############## END CONSTRUCTORS ##############
}
