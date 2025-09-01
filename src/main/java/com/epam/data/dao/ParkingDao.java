package com.epam.data.dao;

import com.epam.data.entity.Vehicle;

import java.util.Map;
import java.util.Optional;

public interface ParkingDao {

    Map<Long, Vehicle> findAll();

    long save(Vehicle newVehicle);

    void deleteById(long id);

    Optional<Vehicle> findById(long id);
}
