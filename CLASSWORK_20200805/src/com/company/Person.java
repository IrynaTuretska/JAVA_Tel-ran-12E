package com.company;

public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
/* // by Name
    public int compareTo(Person person){
        return this.name.compareTo(person.name);
    }
*/

    @Override
    public String toString() {
        return "(" + name + ": " + age + " лет" + ")";
    }

    //by name and age
    @Override
    public int compareTo(Person person) {
        int nameComparing = this.name.compareTo(person.name);
        return (nameComparing == 0) ?
                this.age - person.age : nameComparing;
    }
}
/* // by age
    @Override
    public int compareTo(Person person) {
        return this.age-person.age;
    }
 */

/*
    public int compareTo(Person person) {
        return this.name.compareTo(person.name);
    }


    public int compareTo(Person person){
        return this.age-o.age;
        if (this.age > person.age){
            return 1;
        }
        if (this.age < person.age){
            return -1;
        }
        return 0;
  */

