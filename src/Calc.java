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
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Calc {

    public static void main(String[] args) {

        Calc solution = new Calc();
        Scanner in = new Scanner( System.in );
        String expression = "";
        System.out.print( "Enter expression: " );
        expression += in.nextLine();

        final String regex = "[!&?/*%()=+-]";
        final Pattern expPattern = Pattern.compile( regex );
        final Matcher expMatcher = expPattern.matcher( expression );
        if ( expMatcher.find() ){
            System.err.println( "Invalid expression" );
            System.exit(1);
        }

        String[] newExp = expression.split(" ");
        float a = Float.parseFloat( newExp[0] );
        float b = Float.parseFloat( newExp[2] );

        if ( newExp[1].contains( "divide" ) || newExp[1].contains( "поделить" )) {

            if (newExp[2].contains("0")) System.err.println( "Divide on zero not good" );
            else solution.divide( a, b );

        }
        if ( newExp[1].contains( "plus" ) || newExp[1].contains( "плюс" )) solution.plus( a,b );
        if ( newExp[1].contains( "minus" ) || newExp[1].contains( "минус" )) solution.minus( a,b );
        if ( newExp[1].contains( "multiply" ) || newExp[1].contains( "умножить" )) solution.multiply( a,b );



    }

    private void multiply( float a, float b ) {

        System.out.println( "result: " + a*b );

    }

    private void minus( float a, float b ) {

        System.out.println( "result: " + (a-b) );

    }

    private void plus( float a, float b ) {

        System.out.println( "result: " + (a+b) );

    }

    public void divide( float a, float b ){

        float c = a/b;
        System.out.println( "result: " + c );

    }

}
