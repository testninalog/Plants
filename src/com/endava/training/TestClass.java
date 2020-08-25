package com.endava.training;

public class TestClass {
    public static void main(String[] args) {

        Orange orange = new Orange(50, 10, 5);
        System.out.println(orange);// sistemout vice toString

        Pinidea ceder = new Ceder(200);
        System.out.println(ceder.getGrowthEnvironment());
        System.out.println(ceder.numberOfSpecies);
        System.out.println(ceder.isEatable());
    }
}
