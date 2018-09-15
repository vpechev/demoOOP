package com.scalefocus.domain;

import com.scalefocus.common.Color;
import com.scalefocus.common.EngineCharacteristics;
import com.scalefocus.common.EngineType;

public class DieselCar extends Car {
    public DieselCar(){
        super(EngineType.DIESEL);
    }

    public DieselCar(EngineCharacteristics engineCharacteristics, Color color) {
        super(EngineType.DIESEL, engineCharacteristics, color);
    }

    @Override
    public void refuel() {
        System.out.print("Welcome to the Gas station ---> ");
        System.out.println("Full tank DIESEL!!!");
    }
}
