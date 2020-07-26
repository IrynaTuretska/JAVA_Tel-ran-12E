package com.company;


public class EmployeeArray {
    private Employee[] employees;

    public EmployeeArray(Employee[] employees) {
        this.employees = employees;
    }



    public void PrintAll() {
        PrintAll(this.employees);
    }
    public static void PrintAll(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println("//----//----//----//----//----//----//");
    }


    public  void workAll() {
        for (Employee employee : employees) {
            employee.work();
        }
        System.out.println("//----//----//----//----//----//----//");
    }

    public  void payAll() {
        for (Employee employee : employees) {
            employee.pay();
        }
        System.out.println("//----//----//----//----//----//----//");
    }

    public  void CodeReviewAll() {

        for (Employee employee : employees) {
            System.out.println(employee.getName());
            System.out.print("  ");
            if (isProgrammer(employee)) {
                ((Programmer) employee).codeReview();
            }
        }
    }

    private  boolean isProgrammer(Employee employee) {
        if (employee instanceof Programmer) { // является ли employee object класса Programmer
            return true;
        }
        return false;
    }

}
