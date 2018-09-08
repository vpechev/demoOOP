package com.scalefocus.domain;

import com.scalefocus.common.Color;
import com.scalefocus.common.EngineType;

public class LpgCar extends GasolineCar {
    public LpgCar(){
        super();
        this.setEngineType(EngineType.LPG);
    }

    public LpgCar(int engineVolume, int horsePowers, Color color) {
        super(engineVolume, horsePowers, color);
        this.setEngineType(EngineType.LPG);
    }

    @Override
    public void refuel() {
        System.out.print("Welcome to the Gas station ---> ");
        System.out.println("Full tank LPG!!!");
    }
}
