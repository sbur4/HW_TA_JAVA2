package com.epam.First;

import java.util.ArrayList;

/**
 * @author sburch
 * @mentor Roman Mysiuk
 */

/*
 * 1. Create console menu using enums with loop (use method values(), valueOf …
 * to show all possible options, options: add/remove/show/sort cars, use
 * ArrayList , Set or Map to collect all cars).
 */

public class Parking {

    enum Options {
        ADD, REMOVE, SHOW, SORT
    }

    enum Car {
        CHEVROLET, CITROEN, FORD, RANGEROVER, PORDCHE, HUINDAY
    }

    public static void main(String[] args) {

        for (Options o : Options.values()) {
            System.out.println(o);
        }

        System.out.println("\n");

        Car[] cars = Car.values();
        ArrayList<Car> allCars = new ArrayList<Car>();
        for (Car c : cars) {
            System.out.println(c);
        }
    }

}
