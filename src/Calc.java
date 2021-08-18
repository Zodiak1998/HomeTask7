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
        float a = Float.parseFloat(newExp[0]);
        float b = Float.parseFloat(newExp[2]);

        if (newExp[1].contains("делить")) {
            try {
                solution.divide(a, b);
            } catch (ArithmeticException e) {
                System.out.println(e.toString());
                e.printStackTrace();
            }
        }
        if (newExp[1].contains("плюс")) solution.plus(a,b);
        if (newExp[1].contains("минус")) solution.minus(a,b);
        if (newExp[1].contains("умножить")) solution.multiply(a,b);



    }

    private void multiply(float a, float b) {

        System.out.println(a*b);

    }

    private void minus(float a, float b) {

        System.out.println(a-b);

    }

    private void plus(float a, float b) {

        System.out.println(a+b);

    }

    public void divide(float a, float b){

        System.out.println(a/b);

    }

}
