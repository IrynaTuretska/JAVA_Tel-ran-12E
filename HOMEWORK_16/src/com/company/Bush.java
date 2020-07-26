package com.company;

public class Bush extends Plant {


    public Bush(String plantSort, double initialGrowth, double springGrowth,
                double summerGrowth, double autumnGrowth, double winterGrowth) {
        super(plantSort, initialGrowth, springGrowth, summerGrowth, autumnGrowth, winterGrowth);


    }
    public void getYearGrowth(Plant plants){
        System.out.println(plants.toString());
    }
}

