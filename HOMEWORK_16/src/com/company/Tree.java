package com.company;

public class Tree extends Plant{

    public Tree(String plantSort, double initialGrowth, double springGrowth,
                double summerGrowth, double autumnGrowth, double winterGrowth) {
        super(plantSort, initialGrowth, springGrowth, summerGrowth, autumnGrowth, winterGrowth);


    }
    public void getYearGrowth(Plant plants){
        System.out.println(plants.toString());
    }
}
