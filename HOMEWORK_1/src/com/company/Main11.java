package com.company;

public class Main11 {

    public static void main(String[] args) {
        // Задача №12: true или false если одна из колб имеет температуру выше 100 градусов,
        // а вторая ниже 0 градусов
        System.out.print("Your devise is working correclty! - " + checkDevise(-5, 101));

    }
    public static boolean checkDevise(double colba1, double colba2) {
        boolean result = (colba1<0 && colba2>100) || (colba1>100 && colba2<0 );
        if (result){
            return true;
        }else{
            return false;
        }
    }
}