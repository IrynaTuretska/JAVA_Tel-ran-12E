package com.company;

public class Main {

    public static void main(String[] args) {
        Account a1= new Account("DE123456789",new Person("name1","lastName1"),10065.77);
        Account a2= new Account("DE123456781",new Person("name2","lastName2"),10165.71);
        Account a3= new Account("DE1256782",new Person("name3","lastName3"),10265.72);
        Account a4= new Account("DE123458826783",new Person("name4","lastName4"),10365.73);
        Account a5= new Account("DE123456784",new Person("name5","lastName5"),10465.74);

        Account[] accounts = new Account[]{a1,a2,a3,a4,a5};

        BankProcessing bankProcessing = new BankProcessing(accounts);
        System.out.println(bankProcessing);
        System.out.println();
        System.out.println(bankProcessing.allClientsToString());

        System.out.println();
        System.out.println(bankProcessing.secureToString());

    }
}
