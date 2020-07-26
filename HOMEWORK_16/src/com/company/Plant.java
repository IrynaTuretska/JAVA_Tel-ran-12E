package com.company;

public class Plant {
    private String plantSort;
    private double initialGrowth;


    private double summerGrowth;
    private double autumnGrowth;
    private double winterGrowth;
    private double springGrowth;


    public Plant(String plantSort, double initialGrowth, double summerGrowth,double autumnGrowth,
                 double winterGrowth, double springGrowth) {
        this.plantSort = plantSort;
        this.initialGrowth = initialGrowth;


        this.summerGrowth = summerGrowth;
        this.autumnGrowth = autumnGrowth;
        this.winterGrowth = winterGrowth;
        this.springGrowth = springGrowth;


    }

    public String getPlantSort() {
        return plantSort;
    }

    public double getInitialGrowth() {
        return initialGrowth;
    }

    public double getSummerGrowth() {
        return summerGrowth;
    }

    public double getAutumnGrowth() {
        return autumnGrowth;
    }

    public double getWinterGrowth() {
        return winterGrowth;
    }

    public double getSpringGrowth() {
        return winterGrowth;
    }

    public void getYearGrowth() {

        System.out.println(getPlantSort() + " initial growth of plant is " + getInitialGrowth() + "m " +
                " Spring " + getSpringGrowth() + " & Autumn " + getAutumnGrowth() +
                " & Winter " + winterGrowth + " & Spring " + springGrowth + " = " +
                (getInitialGrowth() + getSpringGrowth() + getSummerGrowth() + getAutumnGrowth() + getWinterGrowth()) + "m");
    }
}

