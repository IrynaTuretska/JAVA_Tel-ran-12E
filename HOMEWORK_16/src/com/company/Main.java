package com.company;

public class Main {

    public static void main(String[] args) {

        Tree[] trees = DBMock.getTree();
        Bush[] bushes = DBMock.getBush();
        Flower[] flowers = DBMock.getFlower();

        for(Tree plants:trees) {
            plants.getYearGrowth();

        }

        for(Bush plants:bushes){
            plants.getYearGrowth();

        }

        for(Flower plants:flowers){
            plants.getYearGrowth();
        }
    }
}
