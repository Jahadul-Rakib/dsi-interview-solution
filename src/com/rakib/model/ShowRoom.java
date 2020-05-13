package com.rakib.model;

import java.util.List;

public class ShowRoom {
    private Integer expectedVisitor;
    private List<Object> totalVehicles;
    private List<NormalVehicle> totalNormalVehicleList;
    private List<SportsVehicle> totalSportsVehicleList;
    private List<HeavyVehicle> totalHeavyVehicleList;

    public Integer getExpectedVisitor() {
        return expectedVisitor;
    }

    public void setExpectedVisitor(Integer expectedVisitor) {
        this.expectedVisitor = expectedVisitor;
    }

    public List<Object> getTotalVehicles() {
        return totalVehicles;
    }

    public void setTotalVehicles(List<Object> totalVehicles) {
        this.totalVehicles = totalVehicles;
    }

    public List<NormalVehicle> getTotalNormalVehicleList() {
        return totalNormalVehicleList;
    }

    public void setTotalNormalVehicleList(List<NormalVehicle> totalNormalVehicleList) {
        this.totalNormalVehicleList = totalNormalVehicleList;
    }

    public List<SportsVehicle> getTotalSportsVehicleList() {
        return totalSportsVehicleList;
    }

    public void setTotalSportsVehicleList(List<SportsVehicle> totalSportsVehicleList) {
        this.totalSportsVehicleList = totalSportsVehicleList;
    }

    public List<HeavyVehicle> getTotalHeavyVehicleList() {
        return totalHeavyVehicleList;
    }

    public void setTotalHeavyVehicleList(List<HeavyVehicle> totalHeavyVehicleList) {
        this.totalHeavyVehicleList = totalHeavyVehicleList;
    }

    @Override
    public String toString() {
        return "ShowRoom{" +
                "expectedVisitor=" + expectedVisitor +
                ", totalVehicles=" + totalVehicles +
                ", totalNormalVehicleList=" + totalNormalVehicleList +
                ", totalSportsVehicleList=" + totalSportsVehicleList +
                ", totalHeavyVehicleList=" + totalHeavyVehicleList +
                '}';
    }
}
