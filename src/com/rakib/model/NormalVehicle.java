package com.rakib.model;

import com.rakib.enums.EngineType;

import java.util.UUID;

public class NormalVehicle extends Vehicle {
    private UUID vehicleId;
    private EngineType engineType;

    public NormalVehicle() {
    }

    public NormalVehicle(String modelNumber, Integer enginePower, Integer tireSize, EngineType engineType) {
        super(modelNumber, enginePower, tireSize);
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

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }
}
