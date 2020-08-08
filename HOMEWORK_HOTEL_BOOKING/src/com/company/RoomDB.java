package com.company;

public abstract class RoomDB {

    private String roomNumber;
    private int capacity;
    private final double basePrice = 100.0;

    public RoomDB(String roomNumber, int capacity) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;

    }
public String getRoomNumber(){
        return roomNumber;
}
    public int getCapacity() {
        return capacity;

    }

    @Override
    public String toString() {
        return " № " + roomNumber + " for " + capacity +
                " ppl.";
    }

    public double getBasePrice() {
        return basePrice;
    }
    public abstract double getPrice();
}

