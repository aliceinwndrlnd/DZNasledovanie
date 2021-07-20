package com.company;

public class Vozdushnyj extends Transport {
    private int wingspan;
    private int minranwaylenght;

    public Vozdushnyj(double power, double maxspeed, double weight, String brand, int wingspan, int minranwaylenght) {
        super(power, maxspeed, weight, brand);
        this.wingspan = wingspan;
        this.minranwaylenght = minranwaylenght;
    }

    public int getWingspan() {
        return wingspan;
    }

    public int getMinranwaylenght() {
        return minranwaylenght;
    }

}
