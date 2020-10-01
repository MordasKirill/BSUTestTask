package com.software_development.lesson2;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class OneDimensionalArrays {
    public static void main(String[] args) {

        //Task #1
        //1 random input variable introduced for the first task as an example
        Scanner inputTask1 = new Scanner(System.in);
        System.out.println("Input k: ");
        int variableTask1 = inputTask1.nextInt();
        int resultTask1 = task1(variableTask1);
        System.out.println("This is a result of task 1: " + resultTask1);

        //Task #2
        //1 random input variable introduced for the first task as an example
        Scanner inputTask2 = new Scanner(System.in);
        System.out.println("Input k: ");
        int variableTask2 = inputTask2.nextInt();
        int resultTask2 = task2(variableTask2);
        System.out.println("This is a result of task 2: " + resultTask2);

        //Task #3
        //1 random input variable introduced for the first task as an example
        String resultTask3 = task3();
        System.out.println("This is a result of task 3: " + resultTask3);

        //Task #4
        //1 random input array introduced for the first task as an example
        int variableTask4 = (int) (Math.random()*20);
        double[] arrayForTask4 = new double[variableTask4];
        for (int i = 0; i < arrayForTask4.length; i++) {
            arrayForTask4[i] = (int) (Math.random() * 100) + 1;
        }
        System.out.println(Arrays.toString(arrayForTask4));
        double[] resultTask5 = task4(arrayForTask4);
        System.out.println("This is a result of task 4: " + Arrays.toString(resultTask5));

        //Task #5
        //1 random input variable introduced for the first task as an example
        int variableForTask5 = (int) (Math.random()*10);
        task5(variableForTask5);

        //Task #6
        //1 random input variable introduced for the first task as an example
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a size of array:");
        int variableForTask6 = scanner.nextInt();
        task6(variableForTask6);

        //Task #8
        //1 random input variable and random array introduced for the first task as an example
        int variableTask8 = (int) (Math.random()*20);
        Random rand = new Random();
        int[] firstArray = new int[variableTask8];

        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = rand.nextInt(20) - 10;
            System.out.print(firstArray[i] + ", ");
        }
        System.out.println();
        task8(variableTask8, firstArray);

        //Task #9
        //1 random input array introduced for the first task as an example
        int resultTask9 = task9(firstArray);
        System.out.println("This is a result of task 4: " + resultTask9);

        //Task #10
        //1 random input array introduced for the task 10 as an example
        System.out.println("Enter the size of array: ");
        Scanner scannerForTask10 = new Scanner(System.in);
        int variableForTask10 = scannerForTask10.nextInt();
        int[] array = new int[variableForTask10];
        for (int i = 0; i < array.length; i++) {
            int negativePositive = Math.random() < 0.5 ? -1 : 1;//determinate negative or positive values
            array[i] = (int) (Math.random() * 100) * negativePositive; //filling
            System.out.print(array[i] + ";");
        }
        System.out.println();
        zerosChanging(array);
        System.out.println();
        arrayCompressing(array);

        //Task #11
        task11();

    }

    private static int task1(int variableTask1) {
        int[] array = new int[]{2, 3, 4, 5, 6, 7, 8};
        int sum = 0;
        for(int i = 0 ; i < array.length ; i++){
            if (array[i] % variableTask1 == 0) {
                sum += array[i];
            }
        }
        return sum;
    }
    private static int task2(int variableTask2){
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7};
        int sum =0;
        for(int i = 0 ; i < array.length ; i++){
            if (array[i] > variableTask2) {
                array[i] = variableTask2;
                sum ++;
            }
        }
        return sum;
    }
    private static String task3(){
        int[] array = new int [] {-10,0,5,0,2,8,3,-1};
        int positiveNumbers = 0, negativeNumbers = 0, zero = 0;

        for ( int i=0; i<array.length; i++){
            if(array[i]>0  && array[i]!=0){
                positiveNumbers ++;
        }
        else if (array[i]<0 ){
                negativeNumbers ++;
        }
        else if (array[i]==0){
                zero ++;
        }
        }
        return "Положительных чисел: "+positiveNumbers+"; Отрицательных: "+negativeNumbers+"; Равных нулю :"+zero;
    }
    private static double[] task4(double[] array){
        if (array.length <= 1)
            throw new IllegalArgumentException("nothing to swap");
        int mini = 0;
        int maxi = 0;
        for (int i = 1; i < array.length; i++)
        {
            mini = array[i] < array[mini] ? i : mini;
            maxi = array[i] > array[maxi] ? i : maxi;
        }

        array[maxi] = array[maxi]+array[mini];
        array[mini] = array[maxi]-array[mini];
        array[maxi] = array[maxi]-array[mini];
        return array;
    }
    private static void task5(int variable){
        int[] array = new int[]{20, 3, 40, 1, 6, 0, 10};
        for (int i = 1; i < array.length; i++){
            if (array[i]<variable) {
                System.out.println(array[i]);
            }
        }
    }
    private static void task6(int n){
        double[] array = new double[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() / 1 * 100) - 5;
        }
        System.out.print(Arrays.toString(array) + "\n");

        double sum = 0;
        nextPrime:
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    continue nextPrime;
                }
            }
            sum += array[i];
            System.out.println("Prime number " + i + " element of array " + array[i]);
        }
        System.out.println("sum is " + sum);
    }
    private static void task7(){
        //todo in progress . . .
    }
    private static void task8(int n, int[] firstArray){
        int minVal = Integer.MAX_VALUE;
        for (int tmpEl : firstArray) minVal = Math.min(minVal, tmpEl);
        int countMinElem = 0;
        for (int tmpEl : firstArray)
            if (tmpEl == minVal) countMinElem++;

        int[] secondArray = new int[n - countMinElem];
        int indexNewArray = 0;
        for (int tmpEl : firstArray)
            if (tmpEl != minVal) {
                secondArray[indexNewArray++] = tmpEl;
                System.out.print(tmpEl + ", ");
            }
    }
    private static int task9(int [] firstArray){
        int res=0;
        int[] counts=new int[firstArray.length];
        for (int i=0;i<firstArray.length;i++)
        {
            int count=1;
            for (int j=i+1;j<firstArray.length;j++)
            {
                if (firstArray[i]==firstArray[j])
                    count++;
            }
            counts[i]=count;
            if (counts[i]==counts[res])
                res=firstArray[res]>firstArray[i]?i:res;
            else
                res=count>counts[res]?i:res;
        }
        return firstArray[res];
    }
    private static void arrayCompressing(int[] array) {
        int counter = 1;
        for (int i = 0; i < array.length; i += 2) {
            array[counter - 1] = array[i];
            counter++;
            System.out.print(array[i] + ";");
        }
        System.out.println();
    }
    private static void zerosChanging(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0)
                array[i] = 0;
            System.out.print(array[i] + ";");
        }
    }
    private static void task11(){
        int[][] matrix = new int[10][20];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 15);
                System.out.printf("%3d ", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        int count;
        System.out.println("\nNumber of string, where digit 5 meets three or more times: ");
        for (int i = 0; i < matrix.length; i++) {
            count = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 5) {
                    count++;
                }
            }
            if (count >= 3) {
                System.out.printf("%d, ", i + 1);
            }
        }
        System.out.println("\b\b");
    }
}
