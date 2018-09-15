package com.scalefocus.domain;

import com.scalefocus.common.Color;
import com.scalefocus.common.EngineCharacteristics;
import com.scalefocus.common.EngineType;

public class LpgCar extends GasolineCar {
    public LpgCar(){
        super();
        this.setEngineType(EngineType.LPG);
    }

    public LpgCar(EngineCharacteristics engineCharacteristics, Color color) {
        super(engineCharacteristics, color);
        this.setEngineType(EngineType.LPG);
    }
}
