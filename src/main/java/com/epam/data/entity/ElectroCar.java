package com.epam.data.entity;

import com.epam.core.util.CarTypeUtil;
import com.epam.core.util.ElectricMotorTypeUtil;

import java.time.Year;
import java.util.Objects;
import java.util.StringJoiner;

public class ElectroCar extends Car{

    private Integer electricRange; // distance in km
    private Integer batteryChargingTime;
    private ElectricMotorTypeUtil electricMotorType;

    public ElectroCar(String name, String brand, String model, Year yearOfManufacture, CarTypeUtil carType,
                      Integer electricRange, Integer batteryChargingTime, ElectricMotorTypeUtil electricMotorType) {
        super(name, brand, model, yearOfManufacture, carType);
        this.electricRange = electricRange;
        this.batteryChargingTime = batteryChargingTime;
        this.electricMotorType = electricMotorType;
    }

    public ElectroCar(String name, String color, String brand, String model, Year yearOfManufacture, CarTypeUtil carType,
                      Integer electricRange, Integer batteryChargingTime, ElectricMotorTypeUtil electricMotorType) {
        super(name, color, brand, model, yearOfManufacture, carType);
        this.electricRange = electricRange;
        this.batteryChargingTime = batteryChargingTime;
        this.electricMotorType = electricMotorType;
    }

    public ElectroCar(Long id, String name, String brand, String model, Year yearOfManufacture, CarTypeUtil carType,
                      Integer electricRange, Integer batteryChargingTime, ElectricMotorTypeUtil electricMotorType) {
        super(id, name, brand, model, yearOfManufacture, carType);
        this.electricRange = electricRange;
        this.batteryChargingTime = batteryChargingTime;
        this.electricMotorType = electricMotorType;
    }

    public ElectroCar(Long id, String name, String color, String brand, String model, Year yearOfManufacture,
                      CarTypeUtil carType, Integer electricRange, Integer batteryChargingTime, ElectricMotorTypeUtil electricMotorType) {
        super(id, name, color, brand, model, yearOfManufacture, carType);
        this.electricRange = electricRange;
        this.batteryChargingTime = batteryChargingTime;
        this.electricMotorType = electricMotorType;
    }

    public ElectroCar(Long id, String name, String brand, String model, CarTypeUtil carType, Integer electricRange,
                      Integer batteryChargingTime, ElectricMotorTypeUtil electricMotorType) {
        super(id, name, brand, model, carType);
        this.electricRange = electricRange;
        this.batteryChargingTime = batteryChargingTime;
        this.electricMotorType = electricMotorType;
    }

    public ElectroCar(Long id, String name, String color, String brand, String model, CarTypeUtil carType,
                      Integer electricRange, Integer batteryChargingTime, ElectricMotorTypeUtil electricMotorType) {
        super(id, name, color, brand, model, carType);
        this.electricRange = electricRange;
        this.batteryChargingTime = batteryChargingTime;
        this.electricMotorType = electricMotorType;
    }

    public Integer getElectricRange() {
        return electricRange;
    }

    public ElectroCar setElectricRange(Integer electricRange) {
        this.electricRange = electricRange;
        return this;
    }

    public Integer getBatteryChargingTime() {
        return batteryChargingTime;
    }

    public ElectroCar setBatteryChargingTime(Integer batteryChargingTime) {
        this.batteryChargingTime = batteryChargingTime;
        return this;
    }

    public ElectricMotorTypeUtil getElectricMotorType() {
        return electricMotorType;
    }

    public ElectroCar setElectricMotorType(ElectricMotorTypeUtil electricMotorType) {
        this.electricMotorType = electricMotorType;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {return false;}
        if (!super.equals(o)) {return false;}

        ElectroCar that = (ElectroCar) o;
        return Objects.equals(getElectricRange(), that.getElectricRange())
            && Objects.equals(getBatteryChargingTime(), that.getBatteryChargingTime())
            && getElectricMotorType() == that.getElectricMotorType();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), electricMotorType, batteryChargingTime, electricRange);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", ElectroCar.class.getSimpleName() + "[", "]")
            .add("electricMotorType=" + electricMotorType)
            .add("batteryChargingTime=" + batteryChargingTime)
            .add("electricRange=" + electricRange)
            .add("brand='" + getBrand() + "'")
            .add("model='" + getModel() + "'")
            .add("yearOfManufacture=" + getYearOfManufacture())
            .add("carType=" + getCarType())
            .add("id=" + id)
            .add("name='" + name + "'")
            .add("color='" + color + "'")
            .toString();
    }
}
