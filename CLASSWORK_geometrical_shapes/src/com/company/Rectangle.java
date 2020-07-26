package com.company;

public class Rectangle extends Shape {
    private double sideVertical;
    private double sideHorizontal;

    public Rectangle(double sideVertical, double sideHorizontal){
        this.sideVertical = sideVertical;
        this.sideHorizontal = sideHorizontal;
    }
    public double area(){
        return sideVertical*sideHorizontal;
    }

    public String toString(){
        return "RECTANGLE: sides = " + sideVertical + " & " + sideHorizontal + " and AREA = " + area();
    }
}
