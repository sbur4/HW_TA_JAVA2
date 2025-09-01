package com.epam.core.model;

import java.util.Objects;
import java.util.StringJoiner;

public class Parking {

    private final Integer maxCapacity;

    public Parking(Integer maxCapacity) {
        if (Objects.isNull(maxCapacity) || maxCapacity <= 0) {
            this.maxCapacity = 10;
        } else {
            this.maxCapacity = maxCapacity;
        }
    }

    public Integer getMaxCapacity() {
        return maxCapacity;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Parking.class.getSimpleName() + "[", "]")
            .add("maxCapacity=" + maxCapacity)
            .toString();
    }
}
