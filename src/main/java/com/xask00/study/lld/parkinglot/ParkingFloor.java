package com.xask00.study.lld.parkinglot;

import java.util.EnumMap;
import java.util.Map;

import lombok.Getter;

public class ParkingFloor {
    @Getter
    private final int floorNumber;

    @Getter
    private final Map<VehicleType, Integer> totalLotsPerType;

    @Getter
    private final Map<VehicleType, Integer> emptyLotsPerType;

    public ParkingFloor(int floorNumber, Map<VehicleType, Integer> totalLotsPerType) {
        this.floorNumber = floorNumber;
        this.totalLotsPerType = new EnumMap<>(totalLotsPerType);
        this.emptyLotsPerType = new EnumMap<>(VehicleType.class);
        for (VehicleType type : totalLotsPerType.keySet()) {
            emptyLotsPerType.put(type, totalLotsPerType.get(type));
        }
    }

    // Reserve a lot for a vehicle type, returns true if successful
    public boolean occupyLot(VehicleType type) {
        int empty = emptyLotsPerType.getOrDefault(type, 0);
        if (empty > 0) {
            emptyLotsPerType.put(type, empty - 1);
            return true;
        }
        return false;
    }

    // Free a lot for a vehicle type
    public void freeLot(VehicleType type) {
        int empty = emptyLotsPerType.getOrDefault(type, 0);
        int total = totalLotsPerType.getOrDefault(type, 0);
        if (empty < total) {
            emptyLotsPerType.put(type, empty + 1);
        }
    }

    // Check if parking is available for a vehicle type
    public boolean isParkingAvailable(VehicleType type) {
        return emptyLotsPerType.getOrDefault(type, 0) > 0;
    }
}
