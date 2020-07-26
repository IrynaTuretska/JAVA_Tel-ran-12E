package com.company;

public class Author {
    private String firstName;
    private String lastName;


    public Author(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public Author(String fullName){
        String[] str=fullName.trim().split(" ");
        lastName=str[str.length-1];
        firstName=str[0];
    }
    /*
        public Author(String fullName){
            String str="";
            for(int i=0; i<fullName.length(); ++i){
                if (fullName.charAt(i)==' '){
                    firstName=str;
                    str="";
                }else{
                    str+=fullName.charAt(i);
                }
            }
            lastName=str;
        }
    */
    public String toString(){
        return firstName+" "+lastName;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

}
