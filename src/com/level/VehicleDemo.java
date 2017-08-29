package com.level;

class Vehicle {
    int passengers, fuelcap, mpg;
}

class VehicleDemo {
    public static void main(String[] arr) {
        Vehicle minivan = new Vehicle();
        int range;
        minivan.fuelcap = 16;
        minivan.passengers = 7;
        minivan.mpg = 21;
    }
}
