/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fleetmanagementsystem;

/**
 *
 * @author light tech
 */

class Vehicle {
    private String licensePlate;
    private int currentSpeed;
    private int fuelLevel;
    private int mileage;
    private int engineTemperature;
    private int fuelEfficiency;

    public Vehicle(String licensePlate, int fuelLevel, int mileage, int engineTemperature, int fuelEfficiency) {
        this.licensePlate = licensePlate;
        this.currentSpeed = 0; 
        this.fuelLevel = fuelLevel;
        this.mileage = mileage;
        this.engineTemperature = engineTemperature;
        this.fuelEfficiency = fuelEfficiency;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public int getMileage() {
        return mileage;
    }

    public int getEngineTemperature() {
        return engineTemperature;
    }

    public int getFuelEfficiency() {
        return fuelEfficiency;
    }

    public void start() {
        System.out.println(licensePlate + " started.");
    }

    public void stop() {
        System.out.println(licensePlate + " stopped.");
        currentSpeed = 0;
    }

    public void accelerate(int amount) {
        currentSpeed += amount;
        if (currentSpeed > 120) {
            System.out.println("Warning: Speed limit exceeded!");
        }
        System.out.println(licensePlate + " accelerated to " + currentSpeed + " km/h.");
    }

    public void decelerate(int amount) {
        currentSpeed -= amount;
        if (currentSpeed < 0) {
            currentSpeed = 0;
        }
        System.out.println(licensePlate + " decelerated to " + currentSpeed + " km/h.");
    }
}


class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String licensePlate, int fuelLevel, int mileage, int engineTemperature, int fuelEfficiency, int numberOfDoors) {
        super(licensePlate, fuelLevel, mileage, engineTemperature, fuelEfficiency);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }
}


class Truck extends Vehicle {
    private int loadCapacity;

    public Truck(String licensePlate, int fuelLevel, int mileage, int engineTemperature, int fuelEfficiency, int loadCapacity) {
        super(licensePlate, fuelLevel, mileage, engineTemperature, fuelEfficiency);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }
}


class Dispatcher {
    public void manageVehicle(Vehicle vehicle) {
        // Sample management actions
        vehicle.start();
        vehicle.accelerate(50);
        vehicle.accelerate(80);
        vehicle.decelerate(30);
        vehicle.stop();
    }
}


public class FleetManagementSystem {
    public static void main(String[] args) {
        Car car = new Car("ABC123", 50, 12000, 90, 15, 4);
        Truck truck = new Truck("XYZ789", 70, 25000, 95, 8, 5000);

        Dispatcher dispatcher = new Dispatcher();

        dispatcher.manageVehicle(car);
        dispatcher.manageVehicle(truck);
    }
}
