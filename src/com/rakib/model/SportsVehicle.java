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

    @Override
    public EngineType getEngineType() {
        return engineType;
    }

    @Override
    public void setEngineType(EngineType engineType) {
        if (engineType.equals(EngineType.OIL)) {
            this.engineType = engineType;
        } else {
            System.err.println("Sports Car Engine Type Support Oil Only.");
        }
    }

    @Override
    public String toString() {
        return "SportsVehicle{" +
                "turbo='" + turbo + '\'' +
                ", engineType=" + engineType +
                '}';
    }
}
