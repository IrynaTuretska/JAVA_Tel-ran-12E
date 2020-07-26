package com.company;

public class Car {
    String brand;
    double price;

    public Car(String brand,double price){
        this.price=price;
        this.brand=brand;
    }

    public String toString(){
        return "car: "+ brand + " price: "+price;
    }

}
