package com.epam.core.service;

import com.epam.data.entity.Vehicle;

import java.util.Map;

public interface ParkingService {

    Map<Long, Vehicle> findAll();

    long save(Vehicle newVehicle);

    boolean deleteById(long id);

    Vehicle findById(long id);
}
