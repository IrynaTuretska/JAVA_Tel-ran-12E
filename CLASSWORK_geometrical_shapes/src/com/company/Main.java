package com.company;

public class Main {

    public static void main(String[] args) {

        Circle c1 = new Circle(5);
        Circle c2 = new Circle(4);
        Circle c3 = new Circle(6);

        Square s1 = new Square(2);
        Square s2 = new Square(4);
        Square s3 = new Square(8);

        Rectangle r1 = new Rectangle(2,8);
        Rectangle r2 = new Rectangle(4,6);
        Rectangle r3 = new Rectangle(7,12);

        Shape[] shapes = new Shape[]{
                c1, c2, c3,
                s1, s2, s3,
                r1, r2, r3
        };
        for (Shape shape:shapes){
            System.out.println(shape);
        }
    }
}
