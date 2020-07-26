package com.company;

public class Main {

    public static void main(String[] args) {

        Computer computer1 = new Computer("Intel Core 2 Duo 3.4 Ghz Processor", 4, 500, 800);
        Computer computer2 = new Computer("Intel Core i7 2.66 Ghz Processor", 16, 250, 599.99);
        Computer computer3 = new Computer("Intel Core i5 1st Generation", 2, 160, 250.49);
        Computer computer4 = new Computer("Intel Core i3 8th Generation", 8, 500, 950);

        Computer[] computers = {computer1, computer2, computer3, computer4};

        System.out.println("----------------THE BEST PRICE------------------");
        System.out.println(cheaperPrice(computers));

        System.out.println("----------------LIST OF COMPUTERS---------------");

        for (int i = 0; i < computers.length; i++) {
            System.out.println(computers[i].toString());
            //System.out.println(cheaperPrice(computers));
        }

        System.out.println("____________________computers comparison: COMPUTER 1 VS COMPUTER 4");
        double compare = computer1.compareTo(computer4);
        System.out.println(computer1);
        if (compare != 0) {
            System.out.println((compare == 1) ? "more EXPENSIVE than" : "more CHEAPER than");
        } else {
            System.out.println("price is EVEN to");
        }
        System.out.println(computer4);


        System.out.println("____________________computers comparison: COMPUTER 1 VS COMPUTER 2");
        double compare2 = computer1.compareTo(computer2);
        System.out.println(computer1);
        if (compare2 != 0) {
            System.out.println((compare2 == 1) ? "more EXPENSIVE than" : "more CHEAPER than");
        } else {
            System.out.println("price is EVEN to");
        }
        System.out.println(computer2);
    }

    public static Computer cheaperPrice(Computer[] computers) {
        Computer price = computers[0];
        for (int i = 1; i < computers.length; i++) {
            if (price.bestPrice() > computers[i].bestPrice()) {
                price = computers[i];
            }
        }
        return price;
    }
}
