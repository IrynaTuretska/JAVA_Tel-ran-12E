package com.company;

public class Task2 {
    public static void main(String[] args) {

        /* 7_2. Дано выражение в виде строки, например “20*((876/8)+19)” , написать
        метод который проверит правильность расстановки скобок. Считаем, что скобки
        расставлены правильно если:
        • если каждой “(“ соответствует “)” т.е. количество открывающих скобок ‘(’,
        соответствует количеству закрывающих скобок‘)’
        • если нет ситуации, когда закрывающая скобка идет ранее соответствующей
        открывающей скобки т.е. “)2+3(“ это ошибка
        “9*(8+3)-( (9+1)*5)” -> true
        “9*(8+3)- (9+1)*5)” -> false
        “9*8+3)-( (9+1)*5” ->  */


        System.out.println(checkBrackets("9*(8+3)-((9+1)*5)")) ;
        System.out.println(checkBrackets("9*(8+3)-(9+1)*5)")) ;
        System.out.println(checkBrackets("9*8+3)-((9+1)*5")) ;
    }


    public static boolean checkBrackets(String input) {
        int brackets = 0;
        for (char symbol : input.toCharArray()) {
            switch (symbol) {

                case '(':
                    brackets++;
                    break;

                case ')':

                    brackets--;
                    break;

                default:
                    break;
            }
        }
        return brackets ==0;
    }
}

