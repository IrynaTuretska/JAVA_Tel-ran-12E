package com.company;

public class DeLUX_RoomType extends RoomDB {
    private final double priceCoefficient = 1.5;
    private final double deLuxTax = 50.0;

    public DeLUX_RoomType(String roomNumber, int capacity) {
        super(roomNumber, capacity);
    }

    @Override
    public double getPrice() {
        return getBasePrice()*priceCoefficient + deLuxTax;
    }

    @Override
    public String toString() {
        return "DeLUXRoom № " + getRoomNumber() + " (" + getPrice() + " USD)";
    }
}

