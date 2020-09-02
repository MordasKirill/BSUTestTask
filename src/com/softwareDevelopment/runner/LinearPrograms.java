package com.softwareDevelopment.runner;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class LinearPrograms {

    private static void firstTask(){
        double firstVariable = (int) (Math.random() * 10);
        double secondVariable = (int) (Math.random() * 10);
        double thirdVariable = (int) (Math.random() * 10);
        double result;

        result = ((firstVariable - 3) * (secondVariable/2)) + thirdVariable;

        System.out.println("#Task 1 Result is: " + result);
    }
    private static void secondTask(){
        double firstVariable = (Math.random() * 20 - 10);
        double secondVariable = (Math.random() * 20 - 10);
        double thirdVariable = (Math.random() * 20 - 10);
        double result;

        result = (( secondVariable + secondVariable * secondVariable + ( 4*firstVariable * thirdVariable ) ) / 2 * firstVariable)
                - firstVariable*firstVariable*firstVariable*thirdVariable
                + (1 / secondVariable*secondVariable);

        System.out.println("#Task 2 Result is: " + result);
    }

    private static void thirdTask(){
        double firstVariable = (Math.random() * 360);
        double secondVariable = (Math.random() * 360);
        double result;

        result = (Math.sin(firstVariable) + Math.cos(secondVariable) / Math.cos(firstVariable) - Math.sin(secondVariable))
                * Math.tan(firstVariable*secondVariable);

        System.out.println("#Task 3 Result is: " + result);
    }

    private static void taskNumberFor(){
        double firstVariable = 123.456;
        double result;

        result = (firstVariable * 1000) % 1000 + (int) firstVariable / 1000.0;

        System.out.println("#Task 4 Result is: " + result);

    }
    private static void taskNumberFive(){
        int sec = 50000;

        int seconds = sec % 60;
        int minutes = (sec / 60) % 60;
        int hours = (sec / 60) / 60;

        System.out.println("#Task 5 Result is: " + hours + "ч " + minutes + "мин " + seconds + "сек ");

    }
    private static void taskNumberSix(){
        int firstVariable;
        int secondVariable;
        System.out.println("#Task 6.");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите точку x:");
        firstVariable = in.nextInt();
        System.out.println("Введите точку y:");
        secondVariable = in.nextInt();

        if ((firstVariable <= 4 && firstVariable >= -4 && secondVariable <= 0 && secondVariable >= -3))
        {
            System.out.println("Your point is in the field.");

        } else if(firstVariable <= 2 && firstVariable>=-2 && secondVariable >=0) {

            System.out.println("Your point is in the field.");

        } else {

            System.out.println("Your point is not in the field.");

        }
    }
    public static void main(String[] args) {
	// write your code here

        firstTask();
        secondTask();
        thirdTask();
        taskNumberFor();
        taskNumberFive();
        taskNumberSix();

    }
}
