package com.rakib.model;

import com.rakib.enums.EngineType;

public class HeavyVehicle extends Vehicle {
    private Long weight;
    private EngineType engineType;

    public HeavyVehicle() {
    }

    public HeavyVehicle(String modelNumber, Integer enginePower, Integer tireSize, Long weight, EngineType engineType) {
        super(modelNumber, enginePower, tireSize);
        this.weight = weight;
        this.engineType = engineType;
    }

    public Long getWeight() {
        return weight;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }

    @Override
    public EngineType getEngineType() {
        return engineType;
    }

    @Override
    public void setEngineType(EngineType engineType) {
        if (engineType.equals(EngineType.DIESEL)) {
            this.engineType = engineType;
        } else {
            System.err.println("Heavy Car Engine Type Support Diesel Only.");
        }

    }
}
