package com.company;

public class Nazemnyj extends Transport {
    private int numofwheels;
    private double fuelconsump;


    public Nazemnyj(double power, double maxspeed, double weight, String brand, int numofwheels, double fuelconsump) {
        super(power, maxspeed, weight, brand);
        this.numofwheels = numofwheels;
        this.fuelconsump = fuelconsump;

    }

    public int getNumofwheels() {
        return numofwheels;
    }

    public double getFuelconsump() {
        return fuelconsump;
    }
}
