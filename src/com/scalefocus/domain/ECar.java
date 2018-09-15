package com.scalefocus.domain;

import com.scalefocus.common.Color;
import com.scalefocus.common.EngineCharacteristics;
import com.scalefocus.common.EngineType;

public class ECar extends Car {
    public ECar(){
        super(EngineType.ELECTRICS);
    }

    public ECar(Color color) {
        super(EngineType.ELECTRICS, null, color);
    }
}
