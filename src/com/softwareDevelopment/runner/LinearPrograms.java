package com.softwareDevelopment.runner;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class LinearPrograms {

    private static double calculateFunctionForTheFirstTask(double firstVariable, double secondVariable, double thirdVariable){
        double result = ((firstVariable - 3) * (secondVariable/2)) + thirdVariable;
        return result;
    }
    private static double calculateFunctionForTheSecondTask(double firstVariable, double secondVariable, double thirdVariable){
        double result = (( secondVariable + secondVariable * secondVariable + ( 4*firstVariable * thirdVariable ) ) / 2 * firstVariable)
                - firstVariable*firstVariable*firstVariable*thirdVariable
                + (1 / secondVariable*secondVariable);
        return result;
    }

    private static double calculateFunctionForTheThirdTask(double firstVariable, double secondVariable){
        double result = (Math.sin(firstVariable) + Math.cos(secondVariable) / Math.cos(firstVariable) - Math.sin(secondVariable))
                * Math.tan(firstVariable*secondVariable);
        return result;
    }

    private static double calculateFunctionForTheTaskNumberFor(double firstVariable){
        double result = (firstVariable * 1000) % 1000 + (int) firstVariable / 1000.0;
        return result;
    }
    private static String calculateFunctionForTheTaskNumberFive(int amountOfSeconds){
        int seconds = amountOfSeconds % 60;
        int minutes = (amountOfSeconds / 60) % 60;
        int hours = (amountOfSeconds / 60) / 60;
        return hours + "ч " + minutes + "мин " + seconds + "сек ";
    }
    private static void calculateFunctionForTheTaskNumberSix(){
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
        double secondVariableTask2 =(Math.random() * 20 - 10);
        double thirdVariableTask2 =(Math.random() * 20 - 10);

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

        double resultTask4 = calculateFunctionForTheTaskNumberFor(firstVariableTask4);
        System.out.println("This is a result of tusk 4: " + resultTask4);

        //Task #5 calculate result of the function
        //1 random input variables introduced for the first tusk as an example
        int amountOfSecondsTask5 = 5000;
        String resultTask5 = calculateFunctionForTheTaskNumberFive(amountOfSecondsTask5);
        System.out.println("This is a result of tusk 5: " + resultTask5);


        calculateFunctionForTheTaskNumberSix();

    }
}
