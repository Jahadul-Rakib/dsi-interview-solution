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

        if (engineType.equals(EngineType.DIESEL) || engineType.equals(EngineType.OIL) || engineType.equals(EngineType.GAS)) {
            this.engineType = engineType;
        } else {
            System.out.println("Only Support Given Enum String");
        }
    }

    @Override
    public String toString() {
        return "NormalVehicle{" + super.toString().concat(" engineType=" + engineType) + '}';
    }
}
