package com.company;

public class JavaProgrammer extends Programmer{
    public JavaProgrammer(String name, double salary) {
        super(name, salary);
    }


    @Override
    public void codeReview() {
        System.out.println("The Java code is good");
    }
}
