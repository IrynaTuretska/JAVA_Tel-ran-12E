package com.company;

public class Main {

    public static void main(String[] args) {
        Person person1= new Person();
        person1.name="Nick";
        person1.yearOfBirthday=1999;


        Person person2= new Person();
        person2=getNewPerson("Jack",1985);

        Person person3= new Person();
        person3=getNewPerson("Ivan",2005);

        Car car1 = new Car();
        car1.price=30000.0;
        car1.brand="Audi";

        Car car2 = new Car();
        car2.price=40000.0;
        car2.brand="Audi";

        Car car3 = new Car();
        car3.price=20000.0;
        car3.brand="Opel";

        Car[] cars = {car1,car2,car3};
        for (int i=0;i<cars.length;i++){
            System.out.println(cars[i].toString());
        }

        person1.print();
        System.out.println(person1.getAge());
        System.out.println(person2.getAge());

    }

    public static Person getNewPerson(String name, int year){
        Person p= new Person();
        p.name=name;
        p.yearOfBirthday=year;
        return p;
    }
}
