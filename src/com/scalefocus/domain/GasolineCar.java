package com.scalefocus.domain;

import com.scalefocus.common.Color;
import com.scalefocus.common.EngineType;

public class GasolineCar extends Car {
    public GasolineCar(){
        super(EngineType.GASOLINE);
    }

    public GasolineCar(int engineVolume, int horsePowers, Color color) {
        super(EngineType.GASOLINE, engineVolume, horsePowers, color);
    }
}
