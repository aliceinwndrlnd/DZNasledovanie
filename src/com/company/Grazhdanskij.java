package com.company;

import java.util.Scanner;

public class Grazhdanskij extends Vozdushnyj {
    private int numofpassengers;
    private boolean businessclass;
    protected double pow;

    public Grazhdanskij(double power, double maxspeed, double weight, String brand, int wingspan, int minranwaylenght, int numofpassengers, boolean businessclass) {
        super(power, maxspeed, weight, brand, wingspan, minranwaylenght);
        this.numofpassengers = numofpassengers;
        this.businessclass = businessclass;
    }

    public void pow() {
        pow = getPower() * 0.74;
    }

    public double getPow() {
        return pow;
    }

    public int getNumofpassengers() {
        return numofpassengers;
    }

    public boolean isBusinessclass() {
        return businessclass;
    }

    public void capacity() {
        System.out.println("Введите, какое количество человек планируется посадить в самолет: ");
        Scanner scan = new Scanner(System.in);
        int capacity = scan.nextInt();
        if (capacity > 0 && capacity <= 200) {
            System.out.println("Данное количество человек отлично поместится в самолете!");
        } else if (capacity == 0) {
            System.out.println("Разве никто не полетит?");
        } else {
            System.out.println("Вам понадобится самолет побольше!");
        }


    }
}
