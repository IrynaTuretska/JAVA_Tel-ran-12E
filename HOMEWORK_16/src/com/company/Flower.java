package com.company;

public class Flower extends Plant{


    public Flower(String plantSort, double initialGrowth, double springGrowth,
                  double summerGrowth, double autumnGrowth, double winterGrowth) {
        super(plantSort, initialGrowth, springGrowth, summerGrowth, autumnGrowth, winterGrowth);


    }
    public void getYearGrowth(Plant plants){
        System.out.println(plants.toString());
    }
}

