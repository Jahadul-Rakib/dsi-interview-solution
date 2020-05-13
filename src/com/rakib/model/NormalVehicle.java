package com.rakib.model;

import com.rakib.enums.EngineType;

public class NormalVehicle extends Vehicle {
    private EngineType engineType;

    public NormalVehicle() {
    }

    public NormalVehicle(String modelNumber, Integer enginePower, Integer tireSize, EngineType engineType) {
        super(modelNumber, enginePower, tireSize);
        this.engineType = engineType;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }
}
