package com.company;

public class Circle extends Shape{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;

    }
    public double area(){
        return Math.PI*radius*radius;
    }
    public String toString(){
        return "CIRCLE: radius = " + radius + " and AREA = " + area();
    }
}
