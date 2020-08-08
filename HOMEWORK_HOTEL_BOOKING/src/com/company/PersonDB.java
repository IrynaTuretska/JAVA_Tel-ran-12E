package com.company;

public class PersonDB {

      private String reservationReference;

    public PersonDB(String reservationReference) {
        this.reservationReference = reservationReference;
    }

    public String getReservationReference() {
        return reservationReference;
    }

    @Override
    public String toString() {
        return reservationReference;
    }
}
