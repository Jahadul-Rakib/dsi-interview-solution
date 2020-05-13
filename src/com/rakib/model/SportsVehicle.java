package com.rakib.model;

import com.rakib.enums.EngineType;

import java.util.UUID;

public class SportsVehicle extends Vehicle {
    private UUID vehicleId;
    private String turbo;
    private EngineType engineType;

    public SportsVehicle() {
    }

    public SportsVehicle(String modelNumber, EngineType engineType, Integer enginePower, Integer tireSize, String turbo) {
        super(modelNumber, enginePower, tireSize);
        this.turbo = turbo;
        this.engineType = engineType;

    }

    public UUID getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(UUID vehicleId) {
        UUID generatedId = UUID.randomUUID();
        if (vehicleId != null) {
            this.vehicleId = vehicleId;
        }
        this.vehicleId = generatedId;
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
