package com.software_development.lesson1;

import java.util.Arrays;

public class BranchingPrograms {

    public static void main(String[] args) {
        //Task #1 for part 2, triangle task
        //2 random input variables introduced for the first tusk as an example
        double firstAngleTask1 = (Math.random() * 180);
        double secondAngleTask1 = (Math.random() * 180);
        boolean resultTaskIsTriangle = isTriangle(firstAngleTask1, secondAngleTask1);
        boolean resultTaskIsTriangleRectangular = isTriangleRectangular(firstAngleTask1, secondAngleTask1);
        System.out.println("This is a result of task 1 part 2: it is triangle " + resultTaskIsTriangle + " this triangle is rectangular " + resultTaskIsTriangleRectangular);

        //Task #2 for part 2, Max, min task
        //4 random input variables introduced for the first tusk as an example
        int firstVariableTask1 = (int) (Math.random() * 10);
        int secondVariableTask1 = (int) (Math.random() * 10);
        int thirdVariableTask1 = (int) (Math.random() * 10);
        int fourthVariableTask1 = (int) (Math.random() * 10);
        int resultTask2 = calculateFunctionForTheSecondTask(firstVariableTask1, secondVariableTask1, thirdVariableTask1, fourthVariableTask1);
        System.out.println("This is a result of task 2 part 2: " + resultTask2);

        //Task #3 for part 2, Are points on a straight line task
        //3 pares of random input variables introduced for the first tusk as an example
        int x1 = (int) (Math.random() * 10), y1 = (int) (Math.random() * 10);
        int x2 = (int) (Math.random() * 10), y2 = (int) (Math.random() * 10);
        int x3 = (int) (Math.random() * 10), y3 = (int) (Math.random() * 10);
        boolean resultTask3 = calculateFunctionForTheTaskTree(x1, y1, x2, y2, x3, y3);
        System.out.println("This is a result of task 3 part 2: Points are on a straight line " + resultTask3);

        //Task #4 for part 2, Will brick go trough the hole task
        //5 random input variables introduced for the first tusk as an example
        int x = (int) (Math.random() * 10), y = (int) (Math.random() * 10), z = (int) (Math.random() * 10);
        int A = (int) (Math.random() * 10), B = (int) (Math.random() * 10);
        boolean resultPart2Task4 = calculateFunctionForTheTaskFour(A, B, x, y, z);
        System.out.println("This is a result of task 4 part 2: brick will go trough " + resultPart2Task4);

        //Task #5 for part 2, Calculate function task
        //1 random input variable introduced for the first tusk as an example
        int variableTask5 = (int) (Math.random() * 10);
        double resultTask5 = calculateFunctionForTheTaskFive(variableTask5);
        System.out.println("This is a result of task 5 part 2: " + resultTask5);

    }

    private static boolean isTriangle(double firstAngle, double secondAngle) {
        if (firstAngle > 0 && secondAngle > 0) {
            return firstAngle + secondAngle < 180;
        }
        return false;
    }

    private static boolean isTriangleRectangular(double firstAngle, double secondAngle) {
        return  firstAngle == 90 || secondAngle == 90 || 180 - firstAngle - secondAngle == 90;
    }

    private static int calculateFunctionForTheSecondTask(int firstVariable, int secondVariable, int thirdVariable, int fourthVariable){
        int firstMin = Math.min(firstVariable, secondVariable);
        int secondMin = Math.min(thirdVariable, fourthVariable);
        return  Math.max(firstMin, secondMin);
    }
    private static boolean calculateFunctionForTheTaskTree(int x, int y, int x0, int y0, int x1, int y1) {
        // TODO: задача на доработке
        if ( x == x1 && x1 == x0 ||  y == y1 && y1 == y0) {
            return true;
        }
            double maxOfXAndX0 = Math.max(x, x0); // Максимум из x и x0
            double minOfX0AndX1 = Math.min(x0, x1); // Минимум из x0 и x1
            double maxOfAllX = Math.max(maxOfXAndX0, x1); // Максимум всех x
            double minOfAllX = Math.min(minOfX0AndX1, x); // Минимум всех x
            double maxOfYAndY0 = Math.max(y, y0); // Максимум из y и y0
            double minOfY0AndY1 = Math.min(y0, y1); // Минимум из y0 и y1
            double maxOfAllY = Math.max(maxOfYAndY0, y); // Максимум всех y
            double minOfAllY = Math.min(minOfY0AndY1, y); // Минимум всех y
            double[] middlePointX = new double[]{x, x0, x1};
            Arrays.sort(middlePointX);
            double[] middlePointY = new double[]{y, y0, y1};
            Arrays.sort(middlePointY);
            return (middlePointX[1] - minOfAllX) / (maxOfAllX - minOfAllX) == (middlePointY[1] - minOfAllY) / (maxOfAllY - minOfAllY);
        }

    private static boolean calculateFunctionForTheTaskFour(int a, int b, int x, int y, int z){
        return (y <= a) && (z <= b) || (x <= a) && (z <= b) || (x <= b) && (z <= a) ||
                (x <= a) && (y <= b)  || (x <= b) && (y <= a)|| (y <= b) && (z <= a);
    }
    private static double calculateFunctionForTheTaskFive(double variable){

        if (variable <= 3){
            return Math.pow(variable, 2) - ((3 * variable) + 9);
        }else   {
            return 1 / (Math.pow(variable, 3) + 6);
        }
    }
}

