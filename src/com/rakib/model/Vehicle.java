package com.rakib.model;

import java.util.Random;
import java.util.UUID;


public class Vehicle {
    private UUID vehicleId;
    private String modelNumber;
    private Integer enginePower;
    private Integer tireSize;

    public Vehicle() {

    }

    public Vehicle(String modelNumber, Integer enginePower, Integer tireSize) {
        this.modelNumber = modelNumber;
        this.enginePower = enginePower;
        this.tireSize = tireSize;

    }

    public UUID getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId() {
        this.vehicleId = UUID.randomUUID();
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public Integer getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(Integer enginePower) {
        this.enginePower =  enginePower;
    }

    public Integer getTireSize() {
        return tireSize;
    }

    public void setTireSize(Integer tireSize) {
        this.tireSize = tireSize;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleId=" + vehicleId +
                ", modelNumber='" + modelNumber + '\'' +
                ", enginePower=" + enginePower +
                ", tireSize=" + tireSize +
                ',';
    }
}
