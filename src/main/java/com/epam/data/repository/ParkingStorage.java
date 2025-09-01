package com.epam.data.repository;

import com.epam.data.entity.Vehicle;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class ParkingStorage {

    private final Map<Long, Vehicle> parkingStorage;
    private final Set<Long> bookedSpots;

    public ParkingStorage(Integer maxCapacity) {
        this.parkingStorage = new HashMap<>(maxCapacity);
        this.bookedSpots = LongStream.range(1, maxCapacity)
            .boxed()
            .collect(Collectors.toSet());
    }

    public Map<Long, Vehicle> findAll() {
        return new HashMap<>(parkingStorage);
    }

    public long save(Vehicle newVehicle) {
        long actualId = findFreeSpot();
        if (actualId != 0) {
            parkingStorage.put(actualId, newVehicle);
            bookedSpots.add(actualId);
            return actualId;
        }
        return 0;
    }

    public void deleteById(long id) {
        parkingStorage.remove(id);
        bookedSpots.remove(id);
    }

    public Optional<Vehicle> findById(long id) {
        return Optional.ofNullable(parkingStorage.get(id));
    }

    private long findFreeSpot() {
        Set<Long> freePots = findFreeSpots();
        return freePots.stream()
            .findFirst()
            .orElse(0L);
    }

    private Set<Long> findFreeSpots() {
        Set<Long> usedPots = parkingStorage.keySet().stream()
            .mapToLong(Long::longValue)
            .boxed()
            .collect(Collectors.toSet());
        usedPots.removeAll(bookedSpots);

        return usedPots;
    }
}
