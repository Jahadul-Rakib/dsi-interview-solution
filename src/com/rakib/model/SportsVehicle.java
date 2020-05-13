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

    public void setEngineType(EngineType engineType) throws Exception {

        if (engineType.equals(EngineType.DIESEL) || engineType.equals(EngineType.OIL) || engineType.equals(EngineType.GAS)) {
            if (engineType.equals(EngineType.OIL)) {
                this.engineType = engineType;
            } else {
                System.err.println("Sports Car Engine Type Support Oil Only.");
            }
        } else {
            System.out.println("Only Support Given Enum String");
        }
    }

    @Override
    public String toString() {
        return "SportsVehicle{" + super.toString().concat(" turbo='" + turbo + '\'' + ", engineType=" + engineType) + '}';
    }
}
