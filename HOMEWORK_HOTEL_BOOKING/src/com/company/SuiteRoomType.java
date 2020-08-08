package com.company;

public class SuiteRoomType extends RoomDB{

    private final double priceCoefficient = 1.3;

    public SuiteRoomType(String roomNumber, int capacity ){
        super(roomNumber, capacity);
    }

    @Override
    public double getPrice() {
        return getBasePrice()*priceCoefficient;
    }

    @Override
    public String toString() {
        return "SuitedRoom № " + getRoomNumber() + " (" + getPrice() + " USD)";
    }
}

