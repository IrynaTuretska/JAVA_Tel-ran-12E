package com.company;

public class DBMock {
    // read DB
    public Student[] getStudents(){
        Student student = new Student("Bogdan", "12E",new int[]{10,50,25,99});
        Student student1 = new Student("Danil", "12E",new int[]{70,80,25,99});
        Student student2 = new Student("Oleg", "12E",new int[]{10,50});
        Student student3 = new Student("Ira", "12E",new int[]{10,50,25,99,78,65});
        Student[] students =  {student, student1, student2, student3} ;
        return students;
    }
}
