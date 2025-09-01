package com.epam.data.entity;

import com.epam.core.util.CarTypeUtil;
import com.epam.core.util.FuelTypeUtil;

import java.time.Year;
import java.util.Objects;
import java.util.StringJoiner;

public class FuelCar extends Car {

    private FuelTypeUtil fuelType;
    private Short tankVolume;

    public FuelCar(String name, String brand, String model, Year yearOfManufacture, CarTypeUtil carType,
                   FuelTypeUtil fuelType, Short tankVolume) {
        super(name, brand, model, yearOfManufacture, carType);
        this.fuelType = fuelType;
        this.tankVolume = tankVolume;
    }

    public FuelCar(String name, String color, String brand, String model, Year yearOfManufacture, CarTypeUtil carType,
                   FuelTypeUtil fuelType, Short tankVolume) {
        super(name, color, brand, model, yearOfManufacture, carType);
        this.fuelType = fuelType;
        this.tankVolume = tankVolume;
    }

    public FuelCar(Long id, String name, String brand, String model, Year yearOfManufacture, CarTypeUtil carType,
                   FuelTypeUtil fuelType, Short tankVolume) {
        super(id, name, brand, model, yearOfManufacture, carType);
        this.fuelType = fuelType;
        this.tankVolume = tankVolume;
    }

    public FuelCar(Long id, String name, String color, String brand, String model, Year yearOfManufacture, CarTypeUtil carType,
                   FuelTypeUtil fuelType, Short tankVolume) {
        super(id, name, color, brand, model, yearOfManufacture, carType);
        this.fuelType = fuelType;
        this.tankVolume = tankVolume;
    }

    public FuelCar(Long id, String name, String brand, String model, CarTypeUtil carType, FuelTypeUtil fuelType,
                   Short tankVolume) {
        super(id, name, brand, model, carType);
        this.fuelType = fuelType;
        this.tankVolume = tankVolume;
    }

    public FuelCar(Long id, String name, String color, String brand, String model, CarTypeUtil carType, FuelTypeUtil fuelType,
                   Short tankVolume) {
        super(id, name, color, brand, model, carType);
        this.fuelType = fuelType;
        this.tankVolume = tankVolume;
    }

    public FuelTypeUtil getFuelType() {
        return fuelType;
    }

    public FuelCar setFuelType(FuelTypeUtil fuelType) {
        this.fuelType = fuelType;
        return this;
    }

    public Short getTankVolume() {
        return tankVolume;
    }

    public FuelCar setTankVolume(Short tankVolume) {
        this.tankVolume = tankVolume;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }

        FuelCar fuelCar = (FuelCar) o;
        return getFuelType() == fuelCar.getFuelType() && Objects.equals(getTankVolume(), fuelCar.getTankVolume());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), fuelType, tankVolume);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", FuelCar.class.getSimpleName() + "[", "]")
            .add("fuelType=" + fuelType)
            .add("tankVolume=" + tankVolume)
            .add("brand='" + getModel() + "'")
            .add("model='" + getModel() + "'")
            .add("yearOfManufacture=" + getYearOfManufacture())
            .add("carType=" + getCarType())
            .add("id=" + id)
            .add("name='" + name + "'")
            .add("color='" + color + "'")
            .toString();
    }
}
