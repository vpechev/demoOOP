package com.scalefocus;

import com.scalefocus.common.Color;
import com.scalefocus.domain.Car;
import com.scalefocus.domain.DieselCar;
import com.scalefocus.domain.GasolineCar;
import com.scalefocus.domain.ICar;

import java.util.Arrays;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        // Declare car objects
        ICar dieselCar = new DieselCar(1600, 90, Color.YELLOW);
        ICar gasolineCar = new GasolineCar(1800, 90, Color.YELLOW);

        // wrap declared objects in array
        List<ICar> cars = Arrays.asList(dieselCar, gasolineCar);

        //executeTaskOverItemsOfArray(cars, x -> x.refuel());
        cars.stream().forEach(y-> modifyAndPrintCar((Car)y));
        cars.stream().forEach(y-> y.refuel());
    }

    /**
     * Change the color of a car to White.
     * The car is printed before and after the modification.
     * @param car - the input parameter which is going to be manipulated.
     */
    private static void modifyAndPrintCar(Car car){
        System.out.println("Firstly created diesel car: " + car);
        car.setColor(Color.WHITE);
        System.out.println("Car after modify: " + car);
    }

//    /**
//     * Iterates an array of ICar objects and execute a passed task over every particular object
//     * @param cars - array of passed objects
//     * @param task - a task which is going to be executed over the passed ICar objects
//     */
//    private static void executeTaskOverItemsOfArray(List<ICar> cars, Consumer<ICar> task){
//        cars.stream().forEach(x-> task.accept(x));
//    }
}
