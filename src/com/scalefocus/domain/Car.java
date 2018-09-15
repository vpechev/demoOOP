package com.scalefocus.domain;

import com.scalefocus.common.Color;
import com.scalefocus.common.EngineCharacteristics;
import com.scalefocus.common.EngineType;

public abstract class Car implements ICar{
    // ############## BEGIN PROPERTIES ##############
    private EngineType engineType;
    private EngineCharacteristics engineCharacteristics;
    private Color color;
    // ############## END PROPERTIES ##############

    // ############## Begin CONSTRUCTORS ##############
    public Car(EngineType engineType){
        this.engineType = engineType;
    }

    protected Car(EngineType engineType, EngineCharacteristics engineCharacteristics, Color color){
        this(engineType);

        this.engineCharacteristics = engineCharacteristics;
        this.color = color;
    }
    // ############## END CONSTRUCTORS ##############

    public void accelerate() {
        System.out.print("SPEED UP ---> ");
        System.out.println("Bruuuum: 20 -> 40 -> 80 -> 110 -> 150");
    }

    public void stop() {
        System.out.print("SPEED DOWN ---> ");
        System.out.println("Psssst: ABS ON!!!");
    }

    // ############## BEGIN GETTERS & SETTERS ##############
    public EngineType getEgineType() {
        return engineType;
    }

    protected void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public EngineCharacteristics getEngineCharacteristics() {
        return engineCharacteristics;
    }

    public void setEngineCharacteristics(EngineCharacteristics engineCharacteristics) {
        this.engineCharacteristics = engineCharacteristics;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    // ############## END GETTERS & SETTERS ##############

    @Override
    public String toString() {
        return "\nCar{\n\t" +
                getClass().getName() + "@" + Integer.toHexString(hashCode()) + "\n\t" +
                "engineType=" + engineType + "\n\t" +
                "engineCharacteristics=" + engineCharacteristics + "\n\t" +
                "color=" + color + "\n" +
                "}\n";
    }
}
