package com.epam.data.entity;

import java.util.Objects;
import java.util.StringJoiner;

public abstract class Vehicle {

    private final String BLACK_COLOR = "black";

    protected Long id;
    protected String name;
    protected String color;

    public Vehicle(String name) {
        this.name = name;
        this.color = BLACK_COLOR;
    }

    public Vehicle(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Vehicle(Long id, String name) {
        this.id = id;
        this.name = name;
        this.color = BLACK_COLOR;
    }

    public Vehicle(Long id, String name, String color) {
        this.id = id;
        this.name = name;
        this.color = color;
    }

    public Long getId() {
        return id;
    }

    public Vehicle setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Vehicle setName(String name) {
        this.name = name;
        return this;
    }

    public String getColor() {
        return color;
    }

    public Vehicle setColor(String color) {
        this.color = color;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Vehicle vehicle = (Vehicle) o;
        return Objects.equals(getId(), vehicle.getId()) && Objects.equals(getName(), vehicle.getName())
            && Objects.equals(getColor(), vehicle.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, name, color);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Vehicle.class.getSimpleName() + "[", "]")
            .add("id=" + id)
            .add("name='" + name + "'")
            .add("color='" + color + "'")
            .toString();
    }
}
