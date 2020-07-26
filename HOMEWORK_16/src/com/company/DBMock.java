package com.company;

public class DBMock {

    private static Tree[] trees = {
            new Tree("Oak tree: ", 1.5, 0.15,
                    0.15, 0.5, 0),

            new Tree("Pine tree: ", 1.5, 0.15,
                    0.15, 0.5, 0.5),

    };

    private static Bush[] bushes = {
            new Bush("Mimosa: ", 0.4, 0.1,
                    0.1, 0.3, 0.0),

            new Bush("Blackberry: ", 0.4, 0.1,
                    0.1, 0.3, 0.0)

    };

    private static Flower[] flowers = {
            new Flower("Blackberry: ", 0.0, 0.2,
                    0.1, 0.0, 0.0),

            new Flower("Tulip: ", 0.0, 0.2,
                    0.1, 0.0, 0.0)

    };

    public static Tree[] getTree() {
        return trees;
    }

    public static Bush[] getBush() {
        return bushes;
    }

    public static Flower[] getFlower() {
        return flowers;
    }
}
