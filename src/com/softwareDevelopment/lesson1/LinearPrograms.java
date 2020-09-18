package com.softwareDevelopment.lesson1;

import java.util.Scanner;
import static java.lang.Math.*;

public class LinearPrograms {
    public static void main(String[] args) {

        //Task #1 calculate result of the function
        //3 random input variables introduced for the first tusk as an example
        double firstVariableTask1 = (int) (Math.random() * 10);
        double secondVariableTask1 = (int) (Math.random() * 10);
        double thirdVariableTask1 = (int) (Math.random() * 10);

        double resultTask1 = calculateFunctionForTheFirstTask(firstVariableTask1, secondVariableTask1, thirdVariableTask1);
        System.out.println("This is a result of tusk 1: " + resultTask1 );

        //Task #2 calculate result of the function
        //3 random input variables introduced for the first tusk as an example
        double firstVariableTask2 = (Math.random() * 20 - 10);
        double secondVariableTask2 = (Math.random() * 20 - 10);
        double thirdVariableTask2 = (Math.random() * 20 - 10);

        double resultTask2 = calculateFunctionForTheSecondTask(firstVariableTask2, secondVariableTask2, thirdVariableTask2);
        System.out.println("This is a result of tusk 2: " + resultTask2);

        //Task #3 calculate result of the function
        //2 random input variables introduced for the first tusk as an example
        double firstVariableTask3 = (Math.random() * 360);
        double secondVariableTask3 = (Math.random() * 360);
        double resultTask3 = calculateFunctionForTheThirdTask(firstVariableTask3, secondVariableTask3);
        System.out.println("This is a result of tusk 3: " + resultTask3);

        //Task #4 calculate result of the function
        //1 random input variables introduced for the first tusk as an example
        double firstVariableTask4 = 123.456;
        double resultTask4 = calculateFunctionForTheTaskNumberFour(firstVariableTask4);
        System.out.println("This is a result of tusk 4: " + resultTask4);

        //Task #5 calculate result of the function
        //1 random input variables introduced for the first tusk as an example
        int amountOfSecondsTask5 = 5000;
        String resultTask5 = calculateFunctionForTheTaskNumberFive(amountOfSecondsTask5);
        System.out.println("This is a result of task 5: " + resultTask5);

        //Task #6 calculate result of the function
        //1 random input variables introduced for the first tusk as an example
        int firstVariableTask6;
        int secondVariableTask6;
        System.out.println("#Task 6.");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите точку x:");
        firstVariableTask6 = in.nextInt();
        System.out.println("Введите точку y:");
        secondVariableTask6 = in.nextInt();
        boolean resultTask6 = calculateFunctionForTheTaskNumberSix(firstVariableTask6, secondVariableTask6);
        System.out.println("This is a result of tusk 5: point is in the field " + resultTask6);


    }
    private static double calculateFunctionForTheFirstTask(double firstVariable, double secondVariable, double thirdVariable) {
        return ((firstVariable - 3) * secondVariable / 2) + thirdVariable;
    }

    private static double calculateFunctionForTheSecondTask(double firstVariable, double secondVariable, double thirdVariable) {
        double sqrt = Math.sqrt(Math.pow(secondVariable, 2) + 4 * firstVariable * thirdVariable);
        double beforeMinus = ((secondVariable + sqrt) / (2 * firstVariable));
        double afterMinus = ((Math.pow(firstVariable, 3) * thirdVariable) + Math.pow(secondVariable, -2));
        double result = beforeMinus - afterMinus;
        return Math.round(result);
    }

    private static double calculateFunctionForTheThirdTask(double firstVariable, double secondVariable) {
        return ((sin(firstVariable) + cos(secondVariable)) / (cos(firstVariable) - sin(secondVariable))) * (tan(firstVariable * secondVariable));
    }

    private static double calculateFunctionForTheTaskNumberFour(double firstVariable) {
        double beforePoint = (firstVariable * 1000) % 1000;
        double afterPoint = (int) firstVariable / 1000.0;
        return beforePoint + afterPoint;
    }

    private static String calculateFunctionForTheTaskNumberFive(int amountOfSeconds) {
        int seconds = amountOfSeconds % 60;
        int minutes = (amountOfSeconds / 60) % 60;
        int hours = (amountOfSeconds / 60) / 60;
        return hours + "ч " + minutes + "мин " + seconds + "сек ";
    }

    private static boolean calculateFunctionForTheTaskNumberSix(int x, int y) {
        return ((y>= 0 && y<4 && x>-2 && x<2) || (y<0 && y>-3 && x>-4 && x<4));
    }




}
