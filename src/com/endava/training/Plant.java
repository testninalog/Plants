package com.endava.training;

public abstract class Plant {

    private double oxygenProduction;

    public Plant(double oxygenProduction) {
        this.oxygenProduction = oxygenProduction;
    }

    public double getOxygenProduction() {
        return oxygenProduction;
    }

    public void setOxygenProduction(double oxygenProduction) {
        this.oxygenProduction = oxygenProduction;
    }
}
