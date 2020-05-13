package com.rakib.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VehicleShowRoomService {

    private void addVehicle() {
        goToMainMenu();
    }

    private void removeVehicle() {
        goToMainMenu();
    }

    private void listOfVehicleWithExpectedVisitor() {
        goToMainMenu();
    }

    private void listOfVehicleWithDetails() {
        goToMainMenu();
    }

    public void goToMainMenu() {
        System.out.println("Do you want to go main menu ?(y/n)");
        Scanner scanner = new Scanner(System.in);
        if (scanner.next().equalsIgnoreCase("y")) {
            showCommand();
        }
        System.exit(0);
    }

    public void showCommand() {
        System.out.println("Please press the number what you want to do ?");
        Map<Integer, String> command = new HashMap<>();
        command.put(1, "Do you want to Add vehicle ?");
        command.put(2, "Do you want to Remove vehicle ?");
        command.put(3, "Can you show the list of vehicles with current expected visitor ?");
        command.put(4, "Can you show the list of vehicles with details ?");
        command.put(5, "Do you want to exist ?");
        command.forEach((key, value) -> {
            System.out.println(key + ". " + value);
        });

        Scanner scanner = new Scanner(System.in);
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
}
