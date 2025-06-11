package com.xask00.study.lld.parkinglot;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Getter
@RequiredArgsConstructor
public class ParkingTicket {
    private final String registrationNumber;
    private final int floorNumber;
    private final VehicleType vehicleType;
    private final LocalDateTime issuedAt;
}