package com.company;

public class Computer {
    String cpu;
    int ram;
    int hdd;
    double price;

    public Computer(String cpu, int ram, int hdd, double price) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.price = price;
    }

    public int compareTo(Computer computer) {
        if (this.price > computer.price) return 1;
        if (this.price < computer.price) return -1;
        return 0;
    }

    public String toString() {
        return ("COMPUTER: " + "CPU - " + cpu + " / RAM - " + ram + " GB / "
                + " HDD - " + hdd + " GB / " + "Price - " + price + " USD");
    }

    public double bestPrice() {
        if (this.price > price) {
            return this.price;
        } else {
            return price;
        }

    }
}
