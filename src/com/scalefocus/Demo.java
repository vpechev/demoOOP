package com.scalefocus;

import com.scalefocus.common.Color;
import com.scalefocus.domain.DieselCar;

public class Demo {

    public static void main(String[] args) {
        DieselCar dieselCar = new DieselCar(1600, 90, Color.YELLOW);
        System.out.println("Firstly created diesel car: " + dieselCar);

        // Already it's impossible to access the property directly.
        //dieselCar.engineType = EngineType.ELECTRICS;

        // Already it's impossible to access such property though setter method, because there isn't such field at all.
        //dieselCar.setEngineType(EngineType.ELECTRICS);

        dieselCar.setColor(Color.WHITE);

        System.out.println("Car after modify: " + dieselCar);
    }
}
