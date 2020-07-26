package com.company;

public class Main {

    public static void main(String[] args) {

        Person person1= new Person("Nick",1999);
        Person person2 = new Person("Jack",1985);
        Person person3 =new Person("Ivan",2005);
        Person person4= new Person("Lena",2000);
        Person person5= new Person("Lena",1998,60);


        Car car1 = new Car("Audi",30000.0);
        Car car2 = new Car("Audi",40000.0);
        Car car3 = new Car("Opel",20000.0);

        person2.car=car1;
        person4.car=car3;
        person1.car=car2;


        System.out.println("----- print persons");
        Person[] people = {person1,person2,person3,person4,person5};
        for (int i=0;i<people.length;i++){
            people[i].print();
        }

        System.out.println();
        System.out.println("------ print cars");
        Car[] cars = {car1,car2,car3};
        for (int i=0;i<cars.length;i++){
            System.out.println(cars[i].toString());
        }
    }
}