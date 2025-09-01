package com.epam.data.entity;

import com.epam.core.util.CarTypeUtil;

import java.time.Year;
import java.util.Objects;
import java.util.StringJoiner;

public class Car extends Vehicle {

    private String brand;
    private String model;
    private Year yearOfManufacture;
    private CarTypeUtil carType;

    public Car(String name, String brand, String model, Year yearOfManufacture, CarTypeUtil carType) {
        super(name);
        this.brand = brand;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.carType = carType;
    }

    public Car(String name, String color, String brand, String model, Year yearOfManufacture, CarTypeUtil carType) {
        super(name, color);
        this.brand = brand;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.carType = carType;
    }

    public Car(Long id, String name, String brand, String model, Year yearOfManufacture, CarTypeUtil carType) {
        super(id, name);
        this.brand = brand;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.carType = carType;
    }

    public Car(Long id, String name, String color, String brand, String model, Year yearOfManufacture, CarTypeUtil carType) {
        super(id, name, color);
        this.brand = brand;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.carType = carType;
    }

    public Car(Long id, String name, String brand, String model, CarTypeUtil carType) {
        super(id, name);
        this.brand = brand;
        this.model = model;
        this.yearOfManufacture = Year.now();
        this.carType = carType;
    }

    public Car(Long id, String name, String color, String brand, String model, CarTypeUtil carType) {
        super(id, name, color);
        this.brand = brand;
        this.model = model;
        this.yearOfManufacture = Year.now();
        this.carType = carType;
    }

    public String getBrand() {
        return brand;
    }

    public Car setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public String getModel() {
        return model;
    }

    public Car setModel(String model) {
        this.model = model;
        return this;
    }

    public Year getYearOfManufacture() {
        return yearOfManufacture;
    }

    public Car setYearOfManufacture(Year yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
        return this;
    }

    public CarTypeUtil getCarType() {
        return carType;
    }

    public Car setCarType(CarTypeUtil carType) {
        this.carType = carType;
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

        Car car = (Car) o;
        return Objects.equals(getBrand(), car.getBrand()) && Objects.equals(getModel(), car.getModel())
            && Objects.equals(getYearOfManufacture(), car.getYearOfManufacture())
            && Objects.equals(getCarType(), car.getCarType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), brand, model, yearOfManufacture, carType);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Car.class.getSimpleName() + "[", "]")
            .add("brand='" + brand + "'")
            .add("model='" + model + "'")
            .add("yearOfManufacture=" + yearOfManufacture)
            .add("carType=" + carType)
            .add("id=" + id)
            .add("name='" + name + "'")
            .add("color='" + color + "'")
            .toString();
    }
}
