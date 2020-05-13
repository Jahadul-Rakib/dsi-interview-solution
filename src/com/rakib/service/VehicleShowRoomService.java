package com.rakib.service;

import com.rakib.enums.EngineType;
import com.rakib.model.HeavyVehicle;
import com.rakib.model.NormalVehicle;
import com.rakib.model.SportsVehicle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class VehicleShowRoomService {

    Scanner scanner = new Scanner(System.in);
    List<NormalVehicle> normalVehicles = new ArrayList<>();
    List<SportsVehicle> sportsVehicles = new ArrayList<>();
    List<HeavyVehicle> heavyVehicles = new ArrayList<>();
    int totalVehicles = 0;
    int totalVisitor = 30;

    private void addVehicle() throws Exception {
        print("What Kind of vehicle you want to add ?");
        Map<Integer, String> vehicleType = new HashMap<>();
        vehicleType.put(1, "Normal");
        vehicleType.put(2, "Sports");
        vehicleType.put(3, "Heavy");
        vehicleType.forEach((key, value) -> {
            print(key + ". " + value);
        });
        int chosenValue = Integer.parseInt(scanner.next());
        if (chosenValue == 1) {
            normalVehicleAdd();
        } else if (chosenValue == 2) {
            sportsVehicles();
        } else if (chosenValue == 3) {
            heavyVehicle();
        } else {
            goToMainMenu();
        }
    }

    private void heavyVehicle() throws Exception {
        HeavyVehicle heavyVehicle = new HeavyVehicle();
        heavyVehicle.setVehicleId();
        heavyVehicle.setEngineType();
        print("Car Model Number ?");
        heavyVehicle.setModelNumber(scanner.next());


        print("Car Engine Power ? (Number)");
        String engPower = scanner.next();
        boolean checkInt = isInt(engPower);
        if (checkInt) {
            heavyVehicle.setEnginePower(Integer.parseInt(engPower));
        }

        print("Car Tire Size? (Number)");
        String TyreSize = scanner.next();
        boolean checkIntOfSize = isInt(engPower);
        if (checkIntOfSize) {
            heavyVehicle.setTireSize(Integer.parseInt(TyreSize));
        }

        print("Car Weight ? (Number)");
        String carWeight = scanner.next();
        boolean checkIntOfWeight = isInt(engPower);
        if (checkIntOfWeight) {
            heavyVehicle.setWeight(Integer.parseInt(carWeight));
        }

        heavyVehicles.add(heavyVehicle);
        print("ADD Success!!!");
        goToMainMenu();
    }

    private void sportsVehicles() throws Exception {
        SportsVehicle sportsVehicle = new SportsVehicle();
        sportsVehicle.setVehicleId();
        sportsVehicle.setEngineType();
        print("Car Model Number ?");
        sportsVehicle.setModelNumber(scanner.next());


        print("Car Engine Power ? (Number)");
        String engPower = scanner.next();
        boolean checkInt = isInt(engPower);
        if (checkInt) {
            sportsVehicle.setEnginePower(Integer.parseInt(engPower));
        }

        print("Car Tire Size? (Number)");
        String TireSize = scanner.next();
        boolean anIntOfTire = isInt(TireSize);
        if (anIntOfTire) {
            sportsVehicle.setTireSize(Integer.parseInt(TireSize));
        }

        print("Car Turbo ?");
        sportsVehicle.setTurbo(scanner.next());

        sportsVehicles.add(sportsVehicle);
        totalVisitor = totalVisitor + 20;
        print("ADD Success!!!");
        goToMainMenu();
    }

    private void normalVehicleAdd() throws Exception {
        NormalVehicle normalVehicle = new NormalVehicle();
        normalVehicle.setVehicleId();
        print("Car Model Number ?");
        normalVehicle.setModelNumber(scanner.next());
        print("Car Engine Type (OIL/GAS/DIESEL) ?");
        normalVehicle.setEngineType(EngineType.valueOf(scanner.next()));
        print("Car Engine Power ? (Number)");
        String engPower = scanner.next();
        boolean checkInt = isInt(engPower);
        if (checkInt) {
            normalVehicle.setEnginePower(Integer.parseInt(engPower));
        }

        print("Car Tire Size? (Number)");
        String TyreSize = scanner.next();
        boolean checkIntOfTire = isInt(TyreSize);
        if (checkIntOfTire) {
            normalVehicle.setTireSize(Integer.parseInt(TyreSize));
        }

        normalVehicles.add(normalVehicle);
        print("ADD Success!!!");
        goToMainMenu();
    }

    private void removeVehicle() throws Exception {
        print("Please Insert Vehicles Id");
        String vehicleId = scanner.next();
        boolean removeNormal = normalVehicles.removeIf(o -> vehicleId.equals(vehicleId));
        if (!removeNormal) {
            boolean removeSports = sportsVehicles.removeIf(o -> vehicleId.equals(vehicleId));
            totalVisitor = totalVisitor - 20;
            if (!removeSports) {
                boolean removeHeavy = heavyVehicles.removeIf(o -> vehicleId.equals(vehicleId));
                print("Remove Successfully");
                if (!removeHeavy) {
                    print("This Vehicle Id is Not Exist !!!");
                } else print("Remove Successfully.");
            } else print("Remove Successfully.");
        } else print("Remove Successfully.");
        goToMainMenu();
    }

    private void listOfVehicleWithExpectedVisitor() throws Exception {
        print("Total Normal Vehicle: " + normalVehicles.size());
        print("Total Sports Vehicle: " + sportsVehicles.size());
        print("Total Heavy Vehicle: " + heavyVehicles.size());
        totalVehicles = normalVehicles.size() + sportsVehicles.size() + heavyVehicles.size();
        print("Total Vehicle: " + totalVehicles);
        print("Total Expected Visitors: " + totalVisitor);
        goToMainMenu();
    }

    private void listOfVehicleWithDetails() throws Exception {
        print("Total Normal Vehicles: " + normalVehicles);
        print("Total Sports Vehicles: " + sportsVehicles);
        print("Total Heavy Vehicles: " + heavyVehicles);
        int total = normalVehicles.size() + sportsVehicles.size() + heavyVehicles.size();
        print("Total Vehicles: " + total);
        print("Total Expected Visitors: " + totalVisitor);

        goToMainMenu();
    }


    public void goToMainMenu() throws Exception {
        print("Do you want to go main menu ?(y/n)");

        if (scanner.next().equalsIgnoreCase("y")) {
            showCommand();
        }
        System.exit(0);
    }

    public void showCommand() throws Exception {
        print("Please press the number what you want to do ?");
        Map<Integer, String> command = new HashMap<>();
        command.put(1, "Do you want to Add vehicle ?");
        command.put(2, "Do you want to Remove vehicle ?");
        command.put(3, "Can you show the list of vehicles with current expected visitor ?");
        command.put(4, "Can you show the list of vehicles with details ?");
        command.put(5, "Do you want to exist ?");
        command.forEach((key, value) -> {
            print(key + ". " + value);
        });

        int commandValue = Integer.parseInt(scanner.next());

        switch (commandValue) {
            case 1:
                addVehicle();
            case 2:
                removeVehicle();
            case 3:
                listOfVehicleWithExpectedVisitor();
            case 4:
                listOfVehicleWithDetails();
            case 5:
                System.exit(0);
        }
    }

    public void print(String message) {
        System.out.println(message);
    }

    public boolean isInt(String s) throws Exception {
        try {
            int i = Integer.parseInt(s);
            return true;
        } catch (NumberFormatException er) {
            print("Value Must Be A Number...!!!");
            showCommand();
            return false;
        }
    }

}
