package com.company;

public class Main {

    public static void main(String[] args) {

        User user1 = new User("Vik_1", "aloha1990_1", "Password01");
        User user2 = new User("Vik_2", "aloha1990_2", "Password02");
        User user3 = new User("Vik_3", "aloha1990_3", "Password03");
        User user4 = new User("Vik_4", "aloha1990_4", "Password04");

        User user5 = new User("Vik_1", "aloha1990_1", "Password01");

        User[] users = new User[]{
                user1, user2, user3, user4, user5};

        for (User user : users) {
            System.out.println(user);

        }
        System.out.println("--------------------------------------------------------");
        System.out.println("THERE ARE NO DUPLICATES OF USERS: " + findDuplicates(users));
        System.out.println("--------------------------------------------------------");
        System.out.println("THIS USER's INDEX IS: " + findUserIndex("Vik_3", "aloha1990_3", "Password03", users));
        System.out.println("---------------------------------------------------------");
        thisGreeting("aloha1990_1", "Password01", users);

    }
    public static boolean findDuplicates(User[] users) {
        for (int i = 0; i < users.length; i++) {
            for (int j = i + 1; j < users.length; j++) {
                if (users[i].equals(users[j])) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int findUserIndex(String name, String login, String password, User[] users) {
        for (int i = 0; i < users.length; i++) {
            String userName = users[i].getName();
            String userLog = users[i].getLogin();
            String userPass = users[i].getPassword();
            if (userName.equals(name)&&userLog.equals(login) && userPass.equals(password)) {
                return i;
            }
        }
        return -1;
    }
    public static void thisGreeting(String login, String password, User[] users) {
        for (int i = 0; i < users.length; i++) {
            String userLog = users[i].getLogin();
            String userPass = users[i].getPassword();
            if (userLog.equals(login) && userPass.equals(password)) {
                System.out.printf("Welcome to the program Mr. " + users[i].getName() + " !");
                return;
            }
        }
        System.out.println("NO USER FOUND!");
    }
}


