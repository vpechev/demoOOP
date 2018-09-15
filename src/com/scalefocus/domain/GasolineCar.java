package com.scalefocus.domain;

import com.scalefocus.common.Color;
import com.scalefocus.common.EngineCharacteristics;
import com.scalefocus.common.EngineType;

public class GasolineCar extends Car {
    public GasolineCar(){
        super(EngineType.GASOLINE);
    }

    public GasolineCar(EngineCharacteristics engineCharacteristics, Color color) {
        super(EngineType.GASOLINE, engineCharacteristics, color);
    }
}
