package com.scalefocus.domain;

import com.scalefocus.common.Color;
import com.scalefocus.common.EngineType;

public class DieselCar extends Car {
    public DieselCar(){
        super(EngineType.DIESEL);
    }

    public DieselCar(int engineVolume, int horsePowers, Color color) {
        super(EngineType.DIESEL, engineVolume, horsePowers, color);
    }

    @Override
    public void refuel() {
        System.out.print("Welcome to the Gas station ---> ");
        System.out.println("Full tank DIESEL!!!");
    }
}
