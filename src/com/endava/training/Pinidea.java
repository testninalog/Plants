package com.endava.training;

public class Pinidea extends Plant implements Eatable{

    public int numberOfSpecies = 50;
    public Pinidea(double oxygenProduction) {
        super(oxygenProduction);
    }

    public String getGrowthEnvironment(){
        return "mauntain";
    }

    @Override
    public boolean isEatable() {
        return false;
    }
}
