package com.xask00.study.lld.parkinglot;

import java.util.List;
import java.util.Optional;

public interface ParkingStrategy {
    /**
     * Parks the given vehicle in one of the parking floors according to the strategy.
     * Returns a ParkingTicket if successful, or Optional.empty() if no space is available.
     */
    Optional<ParkingTicket> park(Vehicle vehicle, List<ParkingFloor> floors);

    /**
     * Checks if parking is available for the given vehicle type.
     */
    boolean isParkingAvailable(VehicleType type, List<ParkingFloor> floors);
}
