package com.epam.Third;

import java.util.ArrayList;
import java.util.List;

public class MethodReference {

    public static void main(String[] args) {

        final Mechanic mechanic = new Mechanic();
        Car car = new Car();

        // Using an anonymous class
        execute(car, new Consumer<Car>() {
            public void accept(Car c) {
                mechanic.fix(c);
            }
        });

        //lambda expression
        execute(car, c -> mechanic.fix(c));

        //  method reference
        execute(car, mechanic::fix);

    }
}
