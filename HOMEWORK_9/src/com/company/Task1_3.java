package com.company;

public class Task1_3 {

    public static void main(String[] args) {

        String[] names = {"Valeriya", "Inna", "Nickolaus", "Jack"};
        findShortNames(names);      // #9.1
        String nameSearch = "Inna";
        System.out.println(nameSearch + " is " + isNameCorrect(nameSearch, names)); // # 9.2
        System.out.println(nameSearch + " index is " + indexOf(nameSearch, names)); // # 9.3
    }

    public static void findShortNames(String[] names) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].length() < 5) {
                System.out.println(names[i]);
            }
        }
    }

    public static boolean isNameCorrect(String nameSearch, String[] names) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(nameSearch)) {
                return true;
            }
        }
        return false;
    }

    public static int indexOf(String nameSearch, String[] names){
        for (int i=0;i<names.length; i++){
            if(names[i].equals(nameSearch)) {
                return i;
            }
        }
        return -1;
    }
}
