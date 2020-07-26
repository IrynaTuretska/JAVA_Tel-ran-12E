package com.company;

public abstract class Programmer extends Employee { // extends - наследование
    public Programmer(String name, double salary) {
        super(name, salary);
    }
    public  void work(){
        System.out.println("Programmer works");

    };
    public abstract void codeReview();
}
