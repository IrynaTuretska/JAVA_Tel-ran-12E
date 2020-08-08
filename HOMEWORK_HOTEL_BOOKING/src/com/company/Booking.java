package com.company;

public class Booking {
    //private int bookingReference;
    private RoomDB room;
    private PersonDB person;
    private DateInterval dateInterval;


    public Booking(RoomDB room, PersonDB person, DateInterval dateInterval) {
        this.room = room;
        this.person = person;
        this.dateInterval = dateInterval;


    }


    public RoomDB getRoom() {
        return room;
    }

    public PersonDB getPerson() {
        return person;
    }

    public DateInterval getDateInterval() {
        return dateInterval;
    }

    public double getPrice() {
        return this.room.getPrice() * this.dateInterval.getDays();

    }

    @Override
    public String toString() {
        return "BOOKING: room " + room + ", UNDER THE NAME OF: " + person +
                " " + dateInterval +
                " price for " + this.dateInterval.getDays() + " days is " +
                getPrice() + " USD";
    }


}
