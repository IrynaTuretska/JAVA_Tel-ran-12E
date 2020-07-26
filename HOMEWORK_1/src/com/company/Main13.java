package com.company;



public class Main13 {

    public static void main(String[] args) {

        // Задача №14: Сигнализация звенит или нет. Да - если время с 22 до 7 утра, то звенит.
        // + звенит во время обеда с 13 до 14 включительно.
        System.out.print("Сигнализация звенит! Дверь открыта! - " + checkDoorAlarm(14));

    }

    public static boolean checkDoorAlarm(int time)
    {
        return (time==22 || time==23) || ((time>=0 && time<=7 ) || (time>=13 && time<=14));

    }
}