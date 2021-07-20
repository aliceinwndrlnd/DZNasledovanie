package com.company;

public class Transport {
    private double power;
    private double maxspeed;
    private double weight;
    private String brand;

    public Transport(double power, double maxspeed, double weight, String brand) {
        this.power = power;
        this.maxspeed = maxspeed;
        this.weight = weight;
        this.brand = brand;
    }

    public double getPower() {
        return power;
    }


    public double getMaxspeed() {
        return maxspeed;
    }


    public double getWeight() {
        return weight;
    }

    public String getBrand() {
        return brand;
    }

}
