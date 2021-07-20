package com.company;


public class Voennyj extends Vozdushnyj {
    protected boolean catapultsystem;
    protected int numofmissiles;
    protected double pow;

    public Voennyj(double power, double maxspeed, double weight, String brand, int wingspan, int minranwaylenght, boolean catapultsystem, int numofmissiles) {
        super(power, maxspeed, weight, brand, wingspan, minranwaylenght);
        this.catapultsystem = catapultsystem;
        this.numofmissiles = numofmissiles;
    }

    public void pow() {
        pow = getPower() * 0.74;
    }

    public double getPow() {
        return pow;
    }

    public boolean isCatapultsystem() {
        return catapultsystem;
    }

    public int getNumofmissiles() {
        return numofmissiles;
    }

    public void shot() {
        do {
            numofmissiles--;
            System.out.println("Ракета пошла!");
        } while (numofmissiles > 0);
        if (numofmissiles == 0)
            System.out.println("Боеприпасы отсутствуют!");
    }

    public void catapultsystem() {
        if (catapultsystem) {
            System.out.println("Катапультирование прошло успешно!");
        } else {
            System.out.println("У вас нет такой системы!");
        }
    }
}
