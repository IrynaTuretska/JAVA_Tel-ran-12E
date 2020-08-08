package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        Booking booking1 = new Booking(
                new StandardRoomType("52 ''Garden View''", 2),
                new PersonDB("Jack"),
                new DateInterval(new Date(30, 7, 2020),
                        new Date(30, 7, 2021)));

        //for (int i = 0; i < 999999999; i++) ;
        Booking booking2 = new Booking(
                new SuiteRoomType("90 ''Ocean View''", 1),
                new PersonDB("Tomas"),
                new DateInterval(new Date(11, 8, 2020),
                        new Date(13, 8, 2020)));

        Booking booking3 = new Booking(
                new DeLUX_RoomType("93 ''Villa Ocean Front''", 6),
                new PersonDB("Samantha"),
                new DateInterval(new Date(14, 8, 2020),
                        new Date(20, 8, 2020)));


        Booking booking4 = new Booking(
                new DeLUX_RoomType("93 ''Villa Ocean Front''", 6),
                new PersonDB("Tamara"),
                new DateInterval(new Date(14, 8, 2020),
                        new Date(20, 8, 2020))

        );

        BookingList bookingList = new ArrayBookingList(3);
        bookingList.add(booking1);
        bookingList.add(booking2);
        bookingList.add(booking3);
        bookingList.add(booking4);


        bookingList.print();

        //System.out.println(booking1);
        //System.out.println(booking2);
        //System.out.println(booking3);

        System.out.println("                                                              ");
        System.out.println("------------------------------BOOKING BY INDEX----------------");
        System.out.println(bookingList.getBookingByIndex(3));
        System.out.println("                                                              ");
        System.out.println("--------------------------------FIND BOOKING------------------");
        System.out.println(bookingList.findBooking(booking3));
    }

}

