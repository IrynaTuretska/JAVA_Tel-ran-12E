package com.company;

public class Main12 {

    public static void main(String[] args) {
        // Задача №13: Сигнализация звенит или нет. Да - если время с 22 до 7 утра, то звенит.
        System.out.print("Сигнализация звенит! Дверь открыта! - " + checkDoorAllarm(8));

    }
    public static boolean checkDoorAllarm(int time) {
        return (time==22 || time==23) || ((time>=0 && time<=7 ));
    }

}