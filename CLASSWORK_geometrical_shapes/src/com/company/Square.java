package com.company;

public class Square extends Shape{
    private double side;

    public Square(double side){
        this.side = side;
    }
    public double area(){
        return side*side;
    }

    public String toString(){
        return "SQUARE: side = " + side + " and AREA = " + area();
    }
}
