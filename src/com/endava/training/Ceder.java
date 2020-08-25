package com.endava.training;

public class Ceder extends Pinidea implements  Eatable{

    public int numberOfSpecies = 10;
    public Ceder(double oxygenProduction) {
        super(oxygenProduction);
    }

    public String getGrowthEnvironment(){
        return "mauntain and Mediteran";
    }

    @Override
    public boolean isEatable() {
        return false;
    }
}
