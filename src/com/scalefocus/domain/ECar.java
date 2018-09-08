package com.scalefocus.domain;

import com.scalefocus.common.Color;
import com.scalefocus.common.EngineType;

public class ECar extends Car {
    public ECar(){
        super(EngineType.ELECTRICS);
    }

    public ECar(int engineVolume, int horsePowers, Color color) {
        super(EngineType.ELECTRICS, engineVolume, horsePowers, color);
    }

    @Override
    public void refuel() {
        System.out.print("Welcome to the Gas station ---> ");
        System.out.println("Battery recharging successfully!!!");
    }
}
