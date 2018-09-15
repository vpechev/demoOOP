package com.scalefocus.common;

public class EngineCharacteristics {
    private int engineVolume;
    private int horsePowers;

    public EngineCharacteristics(int engineVolume, int horsePowers) {
        this.engineVolume = engineVolume;
        this.horsePowers = horsePowers;
    }

    public int getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(int engineVolume) {
        this.engineVolume = engineVolume;
    }

    public int getHorsePowers() {
        return horsePowers;
    }

    public void setHorsePowers(int horsePowers) {
        this.horsePowers = horsePowers;
    }

    @Override
    public String toString() {
        return "EngineCharacteristics{" +
                "engineVolume=" + engineVolume +
                ", horsePowers=" + horsePowers +
                '}';
    }
}
