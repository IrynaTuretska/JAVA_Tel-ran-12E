package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        DBMock db=new DBMock();
        Student[] students=db.getStudents();
        System.out.println("====== The Best reit =======");
        System.out.println(bestStudent(students));
        System.out.println("===========================");
        System.out.println("====== List of the students =======");

        print(students);



    }

    public static void print(Student[] spisok) {
        for (int i = 0; i < spisok.length; i++)
            System.out.println(spisok[i].toString());
    }

    public static Student bestStudent (Student[] students) {
        Student stmaxReit = students[0];
        for (int i = 1; i < students.length; i++) {
            if (stmaxReit.getReit() < students[i].getReit()) {
                stmaxReit = students[i];
            }
        }
        return stmaxReit;
    }
}
