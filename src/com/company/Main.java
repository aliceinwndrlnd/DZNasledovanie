package com.company;

public class Main {

    public static void main(String[] args) {
        Legkovoj audi = new Legkovoj(120, 300, 1.7, "AUDI", 4, 8, "седан", 5);
        audi.pow();
        audi.setTime(3);
        audi.distance();

        System.out.println("Класс легковые автомобили. Мощность (кВт): " + audi.getPow() + ", максимальная скорость (км/ч): " + audi.getMaxspeed() +
                ", вес (т.): " + audi.getWeight() + ", марка: " + audi.getBrand() + ", количество колес: " + audi.getNumofwheels() + ",");
        System.out.println("расход топлива (л./100км): " + audi.getFuelconsump() + ", тип кузова: " + audi.getBodytype() + ", количество пассажиров: " + audi.getNumofpassengers() + ".");
        System.out.println();

        System.out.println("За время " + audi.getTime() + " ч." + " автомобиль " + audi.getBrand() + ", двигаясь с "
                + "максимальной скоростью " + audi.getMaxspeed() + " км/ч, проедет " + audi.getDistance() + " км и " +
                "израсходует " + audi.getConsumption() + " литров топлива.");

        System.out.println("---------------------------------------------------------");

        Gruzovoj samosval = new Gruzovoj(2300, 64, 5, "BELAZ", 6, 25, 40);
        samosval.pow();
        System.out.println("Класс грузовые автомобили. Мощность (кВт): " + samosval.getPow() + ", максимальная скорость (км/ч): " + samosval.getMaxspeed() +
                ", вес (т.): " + samosval.getWeight() + ", марка: " + samosval.getBrand() + ", количество колес: " + samosval.getNumofwheels() + ",");
        System.out.println("расход топлива (л./100км): " + samosval.getFuelconsump() + ", грузоподъемность (т.): " + samosval.getLiftcapacity() + ".");
        samosval.capacity();

        System.out.println("---------------------------------------------------------");

        Voennyj istrebitel = new Voennyj(45000, 2430, 19, "СУ-27", 14, 1200, true, 2);
        istrebitel.pow();
        System.out.println("Класс военный воздушный транспорт. Мощность (кВт): " + istrebitel.getPow() + ", максимальная скорость (км/ч): " + istrebitel.getMaxspeed() +
                ", вес (т.): " + istrebitel.getWeight() + ", марка: " + istrebitel.getBrand() + ", размах крыльев(м.): " + istrebitel.getWingspan() + ",");
        System.out.println("минимальная полоса для разгона(м): " + istrebitel.getMinranwaylenght() + ", наличие системы катапультирования: " + istrebitel.isCatapultsystem() + ", количество ракет на борту: " + istrebitel.getNumofmissiles() + ".");
        istrebitel.shot();
        istrebitel.catapultsystem();

        System.out.println("---------------------------------------------------------");

        Grazhdanskij samolet = new Grazhdanskij(12950, 936, 28, "BOEING 737", 97, 4000, 200, true);
        samolet.pow();
        System.out.println("Класс гражданский воздушный транспорт. Мощность (кВт): " + samolet.getPow() + ", максимальная скорость (км/ч): " + samolet.getMaxspeed() +
                ", вес (т.): " + samolet.getWeight() + ", марка: " + samolet.getBrand() + ", размах крыльев (м.): " + samolet.getWingspan() + ",");
        System.out.println("минимальная полоса для разгона(м): " + samolet.getMinranwaylenght() + ", количество пассажиров: " + samolet.getNumofpassengers() + ", наличие бизнес-класса: " + samolet.isBusinessclass() + ".");
        samolet.capacity();

        System.out.println("---------------------------------------------------------");


    }

}
