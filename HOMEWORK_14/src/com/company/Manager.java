package com.company;

import javax.sound.midi.Soundbank;

public class Manager extends Employee{
    private double mangerBonus;

    public Manager(String name, double salary, double managerBonus){
        super(name, salary);

        this.mangerBonus = managerBonus;
    }

    public void work(){
        System.out.println("I'm " + getName() + " I am a manager. I check this code.");

    }
    public void pay(){
        System.out.println(getName() + " is being paid: salary " + getSalary() + " EUR and manager's bonus " + mangerBonus + " EUR.");
    }
}

