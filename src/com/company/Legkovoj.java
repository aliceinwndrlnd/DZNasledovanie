package com.company;


public class Legkovoj extends Nazemnyj {
    private String bodytype;
    private int numofpassengers;
    private double pow;
    private double time;
    private double distance;
    private double consumption;


    public Legkovoj(double power, double maxspeed, double weight, String brand, int numofwheels, double fuelconsump, String bodytype, int numofpassengers) {
        super(power, maxspeed, weight, brand, numofwheels, fuelconsump);
        this.bodytype = bodytype;
        this.numofpassengers = numofpassengers;

    }

    public void pow() {
        pow = getPower() * 0.74;
    }

    public double getPow() {
        return pow;
    }

    public void distance() {
        distance = time * getMaxspeed();
        consumption();
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }


    public double getDistance() {
        return distance;
    }

    private void consumption() {
        consumption = distance * 0.08;
    }

    public double getConsumption() {
        return consumption;
    }

    public String getBodytype() {
        return bodytype;
    }

    public int getNumofpassengers() {
        return numofpassengers;
    }


}
