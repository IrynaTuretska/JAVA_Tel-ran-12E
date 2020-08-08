package com.company;

public class StandardRoomType extends RoomDB {
    private final double priceCoefficient = 1.0;

    public StandardRoomType(String roomNumber, int capacity) {
        super(roomNumber, capacity);
    }

    @Override
    public double getPrice() {
        return getBasePrice()*priceCoefficient;
    }

    @Override
    public String toString() {
        return "StandardRoom № " + getRoomNumber() + " (" + getPrice() + " USD)";
    }
}
