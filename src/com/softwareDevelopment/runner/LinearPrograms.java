package com.softwareDevelopment.runner;

import java.util.Scanner;

public class LinearPrograms {

    private static double calculateFunctionForTheFirstTask(double firstVariable, double secondVariable, double thirdVariable){
        double result = ((firstVariable - 3) * secondVariable/2) + thirdVariable;
        return result;
    }
    private static double calculateFunctionForTheSecondTask(double firstVariable, double secondVariable, double thirdVariable){
        double sqrt = Math.sqrt(Math.pow(secondVariable, 2) + 4 * firstVariable * thirdVariable);
        double result = (( secondVariable + sqrt) / 2 * firstVariable) - Math.pow(firstVariable, 3) * thirdVariable + (1 / Math.pow(secondVariable, 2));
        return result;
    }

    private static double calculateFunctionForTheThirdTask(double firstVariable, double secondVariable){
        double result = (Math.sin(firstVariable) + Math.cos(secondVariable) / Math.cos(firstVariable) - Math.sin(secondVariable))
                * Math.tan(firstVariable*secondVariable);
        return result;
    }

    private static double calculateFunctionForTheTaskNumberFour(double firstVariable){
        double beforePoint = (firstVariable * 1000) % 1000;
        double afterPoint = (int) firstVariable / 1000.0;
        double result = beforePoint + afterPoint;
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
    private static String functionForTheFirstTask(double firstAngle, double secondAngle) {
        boolean isTriangleReal = false;
        boolean isTriangleRectangular = false;
        if (firstAngle + secondAngle < 180) {
            isTriangleReal = true;
        }
        if (firstAngle == 90 || secondAngle == 90 || 180 - firstAngle - secondAngle == 90){
            isTriangleRectangular = true;
        }
        return "It is a triangle " + isTriangleReal + " this triangle is rectangular " + isTriangleRectangular;
    }
    private static int functionForTheSecondTask (int firstVariable, int secondVariable, int thirdVariable, int fourthVariable){
        int firstMin;
        int secondMin;
        firstMin = Math.min(firstVariable, secondVariable);
        secondMin = Math.min(thirdVariable, fourthVariable);
        int result = Math.max(firstMin, secondMin);
        return result;
    }
    private static String  functionForTheTaskTree( int x1, int y1, int x2, int y2, int x3, int y3){
        if(x1 == x2 && x2 == x3 && y1 == y2 && y2 == y3){
            return  "Points are located on one straight line.";
        }else
            return "Points are not located on one straight line.";
    }
    private static String functionForTheTaskFour ( int A, int B, int x, int y, int z){
        if (((A < x)&&(B < y))||((A < x) && (B < z))||((A < z) && (B < y))){
            return "The brick will go through the hole";
        } else
            return "The brick will not go through the hole";
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
        double firstVariableTask3 = (Math.random() * 2 - 1);
        double secondVariableTask3 = (Math.random() * 2 - 1);

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
        System.out.println("This is a result of tusk 5: " + resultTask5);

        //Task #1 for part 2, triangle task
        //2 random input variables introduced for the first tusk as an example
        double firstAngleTask1 = (Math.random() * 180);
        double secondAngleTask1 = (Math.random() * 180);
        String resultPart2Task1 = functionForTheFirstTask(firstAngleTask1, secondAngleTask1);
        System.out.println("This is a result of task 1 part 2: " + resultPart2Task1);
        calculateFunctionForTheTaskNumberSix();

        //Task #2 for part 2, Max, min task
        //4 random input variables introduced for the first tusk as an example
        int firstVariablePart2Task1 = (int) (Math.random() * 10);
        int secondVariablePart2Task1 = (int) (Math.random() * 10);
        int thirdVariablePart2Task1 = (int) (Math.random() * 10);
        int fourthVariablePart2Task1 = (int) (Math.random() * 10);
        int resultPart2Task2 =functionForTheSecondTask(firstVariablePart2Task1, secondVariablePart2Task1, thirdVariablePart2Task1, fourthVariablePart2Task1);
        System.out.println("This is a result of task 2 part 2: " + resultPart2Task2);

        //Task #3 for part 2, Max, min task
        //3 pares of random input variables introduced for the first tusk as an example
        int x1 = (int) (Math.random() * 10), y1 = (int) (Math.random() * 10);
        int x2 = (int) (Math.random() * 10), y2 = (int) (Math.random() * 10);
        int x3 = (int) (Math.random() * 10), y3 = (int) (Math.random() * 10);
        String resultPart2Task3 = functionForTheTaskTree(x1, y1, x2, y2, x3, y3);
        System.out.println("This is a result of task 2 part 2: " + resultPart2Task3);

        //Task #4 for part 2, Max, min task
        //5 random input variables introduced for the first tusk as an example
        int x = (int) (Math.random() * 10), y = (int) (Math.random() * 10), z = (int) (Math.random() * 10);
        int A = (int) (Math.random() * 10), B = (int) (Math.random() * 10);
        String resultPart2Task4 = functionForTheTaskFour(A, B, x, y, z);
        System.out.println("This is a result of task 2 part 2: " + resultPart2Task4);
    }
}
