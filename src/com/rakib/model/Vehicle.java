package com.rakib.model;

import com.rakib.enums.EngineType;


public class Vehicle {
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
        this.enginePower = enginePower;
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
                "modelNumber='" + modelNumber + '\'' +
                ", enginePower=" + enginePower +
                ", tireSize=" + tireSize +
                '}';
    }
}
