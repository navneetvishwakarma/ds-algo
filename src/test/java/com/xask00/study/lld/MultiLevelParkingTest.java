package com.xask00.study.lld;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.xask00.study.lld.parkinglot.MultiLevelParking;
import com.xask00.study.lld.parkinglot.NearestFirstParkingStrategy;
import com.xask00.study.lld.parkinglot.ParkingFloor;
import com.xask00.study.lld.parkinglot.ParkingTicket;
import com.xask00.study.lld.parkinglot.Vehicle;
import com.xask00.study.lld.parkinglot.VehicleFactory;
import com.xask00.study.lld.parkinglot.VehicleType;

public class MultiLevelParkingTest {
    private MultiLevelParking parkingApp;
    
    @Before
    public void setUp() {
        List<ParkingFloor> floors = List.of(
            new ParkingFloor(1, Map.of(VehicleType.CAR, 2, VehicleType.EV, 1, VehicleType.MOTORCYCLE, 1)),
            new ParkingFloor(2, Map.of(VehicleType.CAR, 2, VehicleType.EV, 1, VehicleType.MOTORCYCLE, 1)),
            new ParkingFloor(3, Map.of(VehicleType.CAR, 2, VehicleType.EV, 1, VehicleType.MOTORCYCLE, 1))
        );
        parkingApp = new MultiLevelParking(floors, new NearestFirstParkingStrategy());
    }

    @Test
    public void testParkingCar() {
        Vehicle car = VehicleFactory.createVehicle("ABC123", VehicleType.CAR);
        Optional<ParkingTicket> ticket = parkingApp.park(car);
        Assert.assertNotNull(ticket);
        int availableCarSpots = parkingApp.getAvailableParkingSpots(VehicleType.CAR);
        Assert.assertEquals(5, availableCarSpots); // 6 total - 1 parked
    }

    @Test
    public void testParkingFull() {
        Vehicle car = VehicleFactory.createVehicle("ABC123", VehicleType.EV);
        Vehicle ev2 = VehicleFactory.createVehicle("XYZ789", VehicleType.EV);
        Vehicle ev3 = VehicleFactory.createVehicle("LMN456", VehicleType.EV);
        parkingApp.park(car);
        parkingApp.park(ev2);
        parkingApp.park(ev3);

        int availableCarSpots = parkingApp.getAvailableParkingSpots(VehicleType.EV);
        Assert.assertEquals(0, availableCarSpots); // 3 total - 3 parked
    }

    @Test
    public void testParkingOverloaded() {
        Vehicle car = VehicleFactory.createVehicle("ABC123", VehicleType.EV);
        Vehicle ev2 = VehicleFactory.createVehicle("XYZ789", VehicleType.EV);
        Vehicle ev3 = VehicleFactory.createVehicle("LMN456", VehicleType.EV);
        Vehicle ev4 = VehicleFactory.createVehicle("OPQ012", VehicleType.EV);

        parkingApp.park(car);
        parkingApp.park(ev2);
        parkingApp.park(ev3);
        Optional<ParkingTicket> ticket = parkingApp.park(ev4);
        Assert.assertFalse(ticket.isPresent()); // Should not park, no space available
    }

}
