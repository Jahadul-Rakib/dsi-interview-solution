package com.rakib.model;

import com.rakib.enums.EngineType;

import java.util.UUID;

public class HeavyVehicle extends Vehicle {
    private UUID vehicleId;
    private Long weight;
    private EngineType engineType;

    public HeavyVehicle() {
    }

    public HeavyVehicle(String modelNumber, Integer enginePower, Integer tireSize, Long weight, EngineType engineType) {
        super(modelNumber, enginePower, tireSize);
        this.weight = weight;
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

    public Long getWeight() {
        return weight;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }


    public EngineType getEngineType() {
        return engineType;
    }


    public void setEngineType(EngineType engineType) {
        if (engineType.equals(EngineType.DIESEL)) {
            this.engineType = engineType;
        } else {
            System.err.println("Heavy Car Engine Type Support Diesel Only.");
        }

    }
}
