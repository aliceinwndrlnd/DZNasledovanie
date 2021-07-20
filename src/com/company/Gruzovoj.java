package com.company;

import java.util.Scanner;

public class Gruzovoj extends Nazemnyj {
    protected int liftcapacity;
    protected double pow;


    public Gruzovoj(double power, double maxspeed, double weight, String brand,int numofwheels, double fuelconsump, int liftcapacity) {
        super(power, maxspeed, weight, brand, numofwheels, fuelconsump);
        this.liftcapacity = liftcapacity;
    }

    public void pow() {
        pow = getPower() * 0.74;
    }

    public double getPow() {
        return pow;
    }
    public void capacity () {
        System.out.println("Введите, какое количество груза (в тоннах) Вы хотите загрузить: ");
        Scanner scan = new Scanner(System.in);
        int capacity = scan.nextInt();
        if (capacity > 0 && capacity <= 450) {
            System.out.println("Грузовик загружен!");}
        else if (capacity == 0) {
            System.out.println("Разве Вы не хотите ничего загрузить?");
        }
        else {
            System.out.println("Вам понадобится грузовик побольше!");
        }
    }

    public int getLiftcapacity() {
        return liftcapacity;
    }
}
