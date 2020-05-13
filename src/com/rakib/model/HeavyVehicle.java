package com.rakib.model;

import com.rakib.enums.EngineType;

public class HeavyVehicle extends Vehicle {

    private Integer weight;
    private EngineType engineType;

    public HeavyVehicle() {
    }

    public HeavyVehicle(String modelNumber, Integer enginePower, Integer tireSize, Integer weight, EngineType engineType) {
        super(modelNumber, enginePower, tireSize);
        this.weight = weight;
        this.engineType = engineType;
    }


    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }


    public EngineType getEngineType() {
        return engineType;
    }


    public void setEngineType() {
        this.engineType = EngineType.DIESEL;
    }

    @Override
    public String toString() {
        return "HeavyVehicle{" + super.toString().concat(" weight=" + weight + ", engineType=" + engineType) + '}';
    }
}
