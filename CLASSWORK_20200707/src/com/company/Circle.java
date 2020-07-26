package com.company;

import java.util.Objects;

public class Circle extends Shape {
    private double radius;
    private double area;

    public Circle(double radius) {
        this.radius = radius;
        this.area= Math.PI*radius*radius;
    }



    public double area(){
        return area;
    }

    public String toString(){
        return "Circle: radius="+radius + " area="+area();
    }
}
