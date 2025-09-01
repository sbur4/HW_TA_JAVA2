package com.epam.data.dao.impl;

import com.epam.data.dao.ParkingDao;
import com.epam.data.entity.Vehicle;
import com.epam.data.repository.ParkingStorage;

import java.util.Map;
import java.util.Optional;

public class ParkingStorageDaoImpl implements ParkingDao {

    private final ParkingStorage parkingStorage;

    public ParkingStorageDaoImpl(ParkingStorage parkingStorage) {
        this.parkingStorage = parkingStorage;
    }

    @Override
    public Map<Long, Vehicle> findAll() {
        return parkingStorage.findAll();
    }

    @Override
    public long save(Vehicle newVehicle) {
        return parkingStorage.save(newVehicle);
    }

    @Override
    public void deleteById(long id) {
        parkingStorage.deleteById(id);
    }

    @Override
    public Optional<Vehicle> findById(long id) {
        return parkingStorage.findById(id);
    }
}
