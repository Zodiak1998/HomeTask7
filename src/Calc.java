/*
* 7.1 Cоздаем калькулятор! Да не обычный, а консольный.
* На вход должна поступать строка в формате "аргумент1 арифметическаяОперация аргумент2" (используем Scanner), примеры такого ввода:
* "5 плюс 23", "45 делить 6", "0.7 умножить 4.1", всего доступно 4 возможных операции.
* На выход в консоль должен выводиться результат, либо подробное сообщение о произошедшей ошибке (в человекочитаемом формате) + stacktrace ошибки.
* Пользователь, который будет этим пользоваться - человек, склонный ломать абсолютно все, поэтому интенсивно используйте механизм исключений
* где он применим и позаботьтесь о валидации ввода, плюс арифметических операций.
*
*
* */

import java.lang.ArithmeticException;
import java.util.Scanner;


public class Calc {

    public static void main(String[] args) {

        Calc solution = new Calc();
        Scanner in = new Scanner( System.in );
        String expression = "";
        System.out.print( "Введите выражение: " );
        expression += in.nextLine();

        String[] newExp = expression.split(" ");
        int a = Integer.parseInt(newExp[0]);
        int b = Integer.parseInt(newExp[2]);

        try {
            solution.divide(a,b);
        } catch (ArithmeticException e) {
            System.out.println (e.toString());
            e.printStackTrace();
        }




    }

    public void divide(int a, int b){



    }

}
