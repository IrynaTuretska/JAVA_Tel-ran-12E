package com.company;

import java.util.Comparator;

public class PersonComparatorByAge implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
      /*
        if (o1.getAge() > o2.getAge()){
            return 1;
        }else {
            return -1;
        }
     */
        return o1.getAge()-o2.getAge();
    }
}
