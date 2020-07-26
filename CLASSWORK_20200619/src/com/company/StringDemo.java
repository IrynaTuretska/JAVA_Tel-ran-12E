package com.company;

public class StringDemo {
    public static void main(String[] args) {
        char[] chArray={'h','e','l','ä'};
        String s="hello Java";
        String s1= new String("Hello");
        String s2= new String(chArray);

        // Print char array
        System.out.println(s2);
        for (char ch:chArray){
            System.out.print(ch);
        }

        System.out.println("------ String demo ---------");
        System.out.println(s.compareTo(s1));  // comparing the strings s and s1
        char[] chars=s.toCharArray();         // get an char[] from s
        String newString =s.substring(5);     // the substring from the 5th char to the end of the s. s="hello Java" -> newString=" Java"
        String newString2 =s.substring(5,7);  // the substring from the 5th char to the 6th char. s="hello Java" -> newString=" J"
        System.out.println(newString);

        System.out.println(newString.trim()); // remove lead and finish spaces
        String[] string= s.split(" ");   // get the array of words from string s

        System.out.println("----------------------");
        System.out.println(s.replaceAll("\\.","!"));  // replace all '.' to '!'

        for (String qwe:string ) {
            System.out.println(qwe);

        }
    }
}
