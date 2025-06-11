package com.xask00.study.lld.parkinglot;

import lombok.Getter;


public abstract class Vehicle {
    
    @Getter
    private final String registrationNumber;

    @Getter
    private final VehicleType vehicleType;

    protected Vehicle(String registrationNumber, VehicleType vehicleType) {
        this.registrationNumber = registrationNumber;
        this.vehicleType = vehicleType;
    }
}
