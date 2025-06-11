package com.xask00.study.lld.parkinglot;

public class VehicleFactory {
    public static Vehicle createVehicle(String registrationNumber, VehicleType type) {
        switch (type) {
            case CAR:
                return new Car(registrationNumber);
            case MOTORCYCLE:
                return new Bike(registrationNumber);
            case EV:
                return new ElectricCar(registrationNumber);
            // Add more cases as needed
            default:
                throw new IllegalArgumentException("Unknown vehicle type: " + type);
        }
    }
}
