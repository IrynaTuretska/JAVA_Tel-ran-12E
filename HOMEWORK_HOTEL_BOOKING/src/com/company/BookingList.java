package com.company;

public interface BookingList {

    int size();
    void add(Booking booking);
    void print();

    public Booking getBookingByIndex(int index);
    public Booking findBooking(Booking booking);
}

