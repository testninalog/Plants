package com.endava.training;

public class Orange extends Plant implements Fructiferous, Eatable{
    private Integer age;
    private Integer height;

    public Orange(double oxygenProduction) {
        super(oxygenProduction);
    }

    public Orange(double oxygenProduction, Integer age, Integer height) {
        super(oxygenProduction);
        this.age = age;
        this.height = height;
    }

    @Override
    public String getTimeToHarvest() {
        return "Septembar";
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Orange{" +
                "age=" + age +
                ", height=" + height +
                '}';
    }

    @Override
    public boolean isEatable() {
        return true;
    }
}
