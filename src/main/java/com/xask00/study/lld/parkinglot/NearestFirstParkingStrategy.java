package com.xask00.study.lld.parkinglot;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public class NearestFirstParkingStrategy implements ParkingStrategy {

    @Override
    public Optional<ParkingTicket> park(Vehicle vehicle, List<ParkingFloor> floors) {
        for (ParkingFloor floor : floors) {
            if (floor.isParkingAvailable(vehicle.getVehicleType())) {
                boolean occupied = floor.occupyLot(vehicle.getVehicleType());
                if (occupied) {
                    ParkingTicket ticket = new ParkingTicket(
                        vehicle.getRegistrationNumber(),
                        floor.getFloorNumber(),
                        vehicle.getVehicleType(),
                        LocalDateTime.now()
                    );
                    return Optional.of(ticket);
                }
            }
        }
        return Optional.empty();
    }

    @Override
    public boolean isParkingAvailable(VehicleType type, List<ParkingFloor> floors) {
        return floors.stream().anyMatch(floor -> floor.isParkingAvailable(type));
    }
}