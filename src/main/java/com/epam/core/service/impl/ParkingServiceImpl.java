package com.epam.core.service.impl;

import com.epam.core.service.ParkingService;
import com.epam.data.dao.impl.ParkingStorageDaoImpl;
import com.epam.data.entity.Vehicle;

import java.util.Map;
import java.util.Objects;

public class ParkingServiceImpl implements ParkingService {

    private final ParkingStorageDaoImpl parkingDao;

    public ParkingServiceImpl(ParkingStorageDaoImpl parkingDao) {
        this.parkingDao = parkingDao;
    }

    @Override
    public Map<Long, Vehicle> findAll() {
        return parkingDao.findAll();
    }

    @Override
    public long save(final Vehicle newVehicle) {
        return parkingDao.save(newVehicle);
    }

    @Override
    public boolean deleteById(final long id) {
        Vehicle vehicle = findById(id);
        if (Objects.nonNull(vehicle)) {
            parkingDao.deleteById(id);
            return true;
        }

        return false;
    }

    @Override
    public Vehicle findById(final long id) {
        return parkingDao.findById(id).orElse(null);
    }
}
