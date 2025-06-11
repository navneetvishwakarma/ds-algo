package com.xask00.study.lld.parkinglot;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import lombok.Getter;

public class MultiLevelParking {
    
    @Getter
    private final List<ParkingFloor> floors;

    private final ParkingStrategy parkingStrategy;
    // Maps registration number to ParkingTicket
    private final Map<String, ParkingTicket> activeTickets = new HashMap<>();

    public MultiLevelParking(List<ParkingFloor> floors, ParkingStrategy parkingStrategy) {
        this.floors = floors;
        this.parkingStrategy = parkingStrategy;
    }

    // Parks a vehicle using the configured strategy
    public Optional<ParkingTicket> park(Vehicle vehicle) {
        if (activeTickets.containsKey(vehicle.getRegistrationNumber())) {
            return Optional.empty(); // Already parked
        }
        Optional<ParkingTicket> ticketOpt = parkingStrategy.park(vehicle, floors);
        ticketOpt.ifPresent(ticket -> activeTickets.put(vehicle.getRegistrationNumber(), ticket));
        return ticketOpt;
    }

    // Unparks a vehicle by registration number
    public boolean unpark(String registrationNumber) {
        ParkingTicket ticket = activeTickets.remove(registrationNumber);
        if (ticket == null) return false;
        // Find the floor and free the lot
        for (ParkingFloor floor : floors) {
            if (floor.getFloorNumber() == ticket.getFloorNumber()) {
                floor.freeLot(ticket.getVehicleType());
                return true;
            }
        }
        return false;
    }

    // Checks if a vehicle is currently parked
    public boolean isParked(String registrationNumber) {
        return activeTickets.containsKey(registrationNumber);
    }

    // Checks if parking is available for a given vehicle type
    public boolean isParkingAvailable(VehicleType type) {
        return floors.stream().anyMatch(floor -> floor.isParkingAvailable(type));
    }

    public int getAvailableParkingSpots(VehicleType type) {
        return floors.stream()
                .mapToInt(floor -> floor.getEmptyLotsPerType().getOrDefault(type, 0))
                .sum();
    }
}
