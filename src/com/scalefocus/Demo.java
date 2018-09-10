package com.scalefocus;

import com.scalefocus.common.Color;
import com.scalefocus.common.EngineType;
import com.scalefocus.domain.Car;

public class Demo {

    public static void main(String[] args) {
	    Car dieselCar = new Car(EngineType.DIESEL, 1600, 90, Color.YELLOW);
        System.out.println("Firstly created diesel car: " + dieselCar);

        dieselCar.engineType = EngineType.ELECTRICS;

        System.out.println("Car after modify: " + dieselCar);
    }
}
