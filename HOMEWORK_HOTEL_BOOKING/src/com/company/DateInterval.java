package com.company;

import java.util.Random;

public class DateInterval {
    private Date beginning;
    private Date end;
    private static Random rnd = new Random(System.currentTimeMillis());
    private int days = 0;

    public DateInterval(Date beginning, Date end) {
        this.beginning = beginning;
        this.end = end;
    }

    @Override
    public String toString() {
        return "[" + beginning + " ; " + end + "]";
    }


    public Date getBeginning() {
        return beginning;
    }

    public Date getEnd() {
        return end;
    }


    public int getDays() {

        if (days == 0) {
            for (int i = beginning.getYear(); i < end.getYear(); i++) {
                days += Date.getDaysPerYear(i);
            }
            days -= beginning.daysFromNewYear();
            days += end.daysFromNewYear();
        }
        return days;
    }
}

 /*   public int getDaysOfStay() {

        if ((beginning.getDay() >= end.getDay() &&
                (beginning.getMonth() == 1
                        || beginning.getMonth() == 3
                        || beginning.getMonth() == 5
                        || beginning.getMonth() == 7
                        || beginning.getMonth() == 8
                        || beginning.getMonth() == 10
                        || beginning.getMonth() == 12) &&
                ((end.getDay() >= 1 && end.getDay() <= 31)))){

            return (((end.getYear() - beginning.getYear())*365) + (31 - beginning.getDay() + end.getDay()) + ((end.month - beginning.month)-1)*31);
        }


        if ((beginning.getDay() >= end.getDay() &&
                ((end.getMonth() == 4
                        && end.getMonth() == 6
                        && end.getMonth() == 9
                        && end.getMonth() == 11) &&
                        (end.getDay() >= 1 && end.getDay() <= 30)))) {

            return ((((end.getYear() - beginning.getYear())*365) + (30 - beginning.getDay() + end.getDay()) + ((end.month - beginning.month)-1)*30));
        }


        if (beginning.getDay() >= end.getDay() &&
                (end.getMonth() == 2
                        && ((end.getYear() % 400 == 0) || (end.getYear() % 4 == 0) && (end.getYear() % 100 != 0)) &&
                        (end.getDay() >= 1 && end.getDay() <= 29))) {

            return (((end.getYear()-beginning.getYear())*366) + (29 - beginning.getDay() + end.getDay()) + ((end.month - beginning.month)-1)*29);
        }


        if (beginning.getDay() >= end.getDay() &&
                (end.getMonth() == 2
                        && ((end.getYear() % 400 == 0) && (end.getYear() % 4 == 0) && (end.getYear() % 100 != 0)) &&
                        (end.getDay() >= 1 && end.getDay() <= 28))) {

            return ((((end.getYear() - beginning.getYear())*365) + (28 - beginning.getDay() + end.getDay()) + ((end.month - beginning.month)-1)*28));


        } else {
            return (((end.getYear() - beginning.getYear())*365) + (end.getDay() - beginning.getDay()));
        }
    }
}

*/




