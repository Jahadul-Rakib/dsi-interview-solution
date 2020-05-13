package com.rakib.model;

import com.rakib.enums.EngineType;

public class SportsVehicle extends Vehicle {
    private String turbo;
    private EngineType engineType;

    public SportsVehicle() {
    }

    public SportsVehicle(String modelNumber, EngineType engineType, Integer enginePower, Integer tireSize, String turbo) {
        super(modelNumber, enginePower, tireSize);
        this.turbo = turbo;
        this.engineType = engineType;
    }

    public String getTurbo() {
        return turbo;
    }

    public void setTurbo(String turbo) {
        this.turbo = turbo;
    }


    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType() {
        this.engineType = EngineType.OIL;
    }

    @Override
    public String toString() {
        return "SportsVehicle{" + super.toString().concat(" turbo='" + turbo + '\'' + ", engineType=" + engineType) + '}';
    }
}
