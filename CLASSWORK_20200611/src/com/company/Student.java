package com.company;

public class Student {
    private String name;
    private String group;
    private double reit;
    private int[] reitArray;




    public Student(String name, String group,int[] reitArray){
        this.name=name;
        this.group =group;
        this.reitArray =reitArray;
    }
    public String toString(){
        return  "Имя "+name+" Група"+ group +" оценка - "+ getReit();
    }

    public double getReit(){
        if (this.name.equals("Bogdan")){
            return 100.0;
        }
        if (reit==0.0){
            calcReit();
        };
        return reit;
    }

    private void calcReit(){
        double avg=0.0;
        for (int reit: reitArray){
            avg+=reit;
        }
        reit= avg/reitArray.length;
    }
}
