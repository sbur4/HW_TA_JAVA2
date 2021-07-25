package com.epam.Second;

/**
 * @author sburch
 * @mentor Roman Mysiuk
 */

public class BaM {
    static String brand;
    static String model;

    public class BMW {
    }

    public class Mercedes {
    }

    public static String getBrand() {
        return brand;
    }

    public static void setBrand(String brand) {
        BaM.brand = brand;
    }

    public static String getModel() {
        return model;
    }

    public static void setModel(String model) {
        BaM.model = model;
    }

    public interface Alarm {

        public static String turnAlarmOn() {
            return "Turn Alarm On";
        }

        public static String turnAlarmOff() {
            return "Turn Alarm Off";
        }

    }

    public interface Vehicle {

        public void getBrand();
        public void speedUp();
        public void speedDown();
    }

}
