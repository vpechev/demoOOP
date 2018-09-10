package com.scalefocus;

import com.scalefocus.common.Color;
import com.scalefocus.common.EngineType;
import com.scalefocus.domain.Car;

public class Demo {

    public static void main(String[] args) {
        Car dieselCar = new Car(EngineType.DIESEL, 1600, 90, Color.YELLOW);
        System.out.println("Firstly created diesel car: " + dieselCar);

        // Already it's impossible to access the property directly.
        //dieselCar.engineType = EngineType.ELECTRICS;

        dieselCar.setEngineType(EngineType.ELECTRICS);

        System.out.println("Car after modify: " + dieselCar);
    }
}
