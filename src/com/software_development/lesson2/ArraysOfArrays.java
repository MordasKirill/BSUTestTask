package com.software_development.lesson2;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysOfArrays {
    public static void main(String[] args) {

        //Task #1
        //2 random input variable and array introduced for the first task as an example
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Высота матрицы: ");
//        int firstVariableTask1 = scanner.nextInt();
//        System.out.println("Ширина матрицы: ");
//        int secondVariableTask1 = scanner.nextInt();
//
//        int[][] matrixA;
//
//        matrixA = new int[firstVariableTask1][secondVariableTask1];
//        for (int i = 0; i < firstVariableTask1; i++) {
//            System.out.println((i + 1) + "-я строка матрицы: ");
//            for (int j = 0; j < secondVariableTask1; j++) {
//                matrixA[i][j] = scanner.nextInt();
//            }
//        }
//        task1(firstVariableTask1, secondVariableTask1, matrixA);
        //Task #2
        //2 random input variable introduced for the third task as an example
        Scanner scannerForTask2 = new Scanner(System.in);
        System.out.println("Enter a size of array:");
        int firstVariableTask2 = scannerForTask2.nextInt();
        System.out.println("Enter natural number z ");
        int secondVariableTask2 = scannerForTask2.nextInt();
        task2(firstVariableTask2, secondVariableTask2);

        //Task #3
        //2 random input variable and random array introduced for the third task as an example
        //int n = (int) (Math.random()*20);
        int[][] arrayForTask3 = new int[5][5];
        for (int i = 0; i < arrayForTask3.length; i++) {
            for (int j = 0; j < arrayForTask3.length; j++)
                arrayForTask3[i][j] = (int) (Math.random() * 100) + 1;
        }
        Scanner scannerForTask3 = new Scanner(System.in);
        System.out.println("K-я строка: ");
        int firstVariableTask3 = scannerForTask3.nextInt();
        System.out.println("P-й столбец: ");
        int secondVariableTask3 = scannerForTask3.nextInt();
        task3(arrayForTask3, firstVariableTask3, secondVariableTask3);

        //Task #4
        //1 random input variable introduced for the fourth task as an example
        System.out.println("Enter the square matrix with even number n: ");
        Scanner scannerForTask4 = new Scanner(System.in);
        int variableTask4 = scannerForTask4.nextInt();
        task4(variableTask4);

        //Task #5
        //1 random input variable introduced for the task five as an example
        System.out.println("Enter the square matrix with even number n: ");
        Scanner scannerForTask5 = new Scanner(System.in);
        int variableTask5 = scannerForTask5.nextInt();
        task5(variableTask5);

        //Task #6
        //1 random input variable introduced for the task six as an example
        System.out.println("Enter the square matrix with even number n: ");
        Scanner scannerForTask6 = new Scanner(System.in);
        int variableForTask6 = scannerForTask6.nextInt();
        task6(variableForTask6);

        //Task #7
        //1 random input variable introduced for the task seven as an example
        System.out.println("Enter the square matrix with even number n: ");
        Scanner scannerForTask7 = new Scanner(System.in);
        int variableForTask7 = scannerForTask7.nextInt();
        task7(variableForTask7);

        //Task #8
        //4 random input variables introduced for the task eight as an example
        System.out.println("Enter quality of strings");
        Scanner scannerForTask8 = new Scanner(System.in);
        int firstVariableTask8 = scannerForTask8.nextInt();
        System.out.println("Enter quality of columns");
        int secondVariableTask8 = scannerForTask8.nextInt();
        System.out.println();
        System.out.println("Choose the number 1 of column that you want to change: ");
        int thirdVariableTask8 = scannerForTask8.nextInt()- 1;
        System.out.println("Choose the number 2 of column that you want to change: ");
        int fourthVariableTask8 = scannerForTask8.nextInt() - 1;
        task8(firstVariableTask8, secondVariableTask8, thirdVariableTask8, fourthVariableTask8);

        //Task #9
        //4 random input variables introduced for the task nine as an example
        Scanner scannerForTask9 = new Scanner(System.in);
        System.out.println("Enter quality of strings");
        int firstVariableTask9 = scannerForTask9.nextInt();
        System.out.println("Enter quality of columns");
        int secondVariableTask9 = scannerForTask9.nextInt();
        task9(firstVariableTask9, secondVariableTask9);

        //Task #10
        //1 random input variables introduced for the task nine as an example
        System.out.println("Enter the square matrix with even number n: ");
        Scanner scannerForTask10 = new Scanner(System.in);
        int variableTask10 = scannerForTask10.nextInt();
        task10(variableTask10);
    }
    private static void task1(int n, int m, int[][] matrixA){
        //TODO: Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 6
        System.out.println();
        System.out.println("Требуемые по условию столбцы матрицы:");
        for (int i = 0; i < m; i ++) {
            for (int j = 0; j < n; j += 2) {
                if (matrixA[0][j] > matrixA[m - 1][j]) {
                    System.out.print(matrixA[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }
    private static void task2(int arraySize, int z){
        int[] array = new int[arraySize];
        int count=0;
        for (int i=0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.print(Arrays.toString(array)+ "\n");

        for (int i=0; i < array.length; i++) {
            if (array[i] > z ) {
                array[i]=z;
                ++count;
            }
        }
        System.out.println(Arrays.toString(array)+ "\n" + "The amount of changing is " + count);
    }
    private static void task3(int [] [] arrayForTask3, int firstVariableTask3, int secondVariableTask3){
        firstVariableTask3--; secondVariableTask3--;
        System.out.println("k row: ");
        for (int i = 0; i < 5; ++i)
            System.out.println(arrayForTask3[firstVariableTask3][i]);
        System.out.println("p col:" );
        for (int i = 0; i < 5; ++i)
            System.out.println(arrayForTask3[i][secondVariableTask3] );
        System.out.println();
        for (int i = 0; i < arrayForTask3.length; i++) {
            for (int j = 0; j < arrayForTask3[i].length; j++) {
                System.out.print(arrayForTask3[i][j] + "\t");
            }
            System.out.println();
        }
    }
    private static void task4(int n){

        int[][] matrix = new int[n][n];
        int count = 0;
        int nDecrement = 0;
        if (n % 2 == 0) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (i % 2 == 0) {
                        count++;
                        matrix[i][j] = count;
                        System.out.printf("%3d ", matrix[i][j]);
                    } else {
                        nDecrement++;
                        matrix[i][j] = (n+1) - nDecrement;
                        System.out.printf("%3d ", matrix[i][j]);
                    }
                }
                count = 0;
                nDecrement = 0;
                System.out.println();
            }
        } else {
            System.out.println("Number n is odd!");
        }
    }
    private static void task5(int n){
        int[][] matrix = new int[n][n];
        if (n % 2 == 0) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (i > 0)  {
                        if (n - (i + j) <= 0) {
                            matrix[i][j] = 0;
                        } else {
                            matrix[i][j] = i + 1;
                        }
                        System.out.printf("%3d ", matrix[i][j]);
                    }
                    else {
                        matrix[i][j] = 1;
                        System.out.printf("%3d ", matrix[i][j]);
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("Number n is odd!");
        }
    }
    private static void task6(int n){
        int[][] matrix = new int[n][n];

        if (n % 2 == 0) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if ((j >= i && j + i < n ) || ( j <= i && j + i >= n - 1)) {
                        matrix[i][j] = 1;
                    } else {
                        matrix[i][j] = 0;
                    }
                    System.out.printf("%2d ", matrix[i][j]);
                }
                System.out.println();
            }
        } else {
            System.out.println(" Number N is odd ");
        }
    }
    private static void task7(int n){
        double [][] matrix = new double[n][n];
        int count;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Math.sin(((i * i) - (j * j)) / n);
                System.out.printf("%10f",matrix[i][j]);
            }
            System.out.println();
        }

        count = 0;
        for (double [] array : matrix) {
            for (double element : array) {
                if (element > 0) {
                    count++;
                }
            }
        }
        System.out.println("Amount of positive numbers:" + count);
    }
    private static void task8(int n, int m, int s, int z){
        int[][] matrix = new int[n][m];
        int swap;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int positiveNegative = Math.random() < 0.5 ? -1 : 1;
                matrix[i][j] = (int) (Math.random() * 100) * positiveNegative;
                System.out.printf("%3d ", matrix[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < matrix.length; i++) {
            swap = matrix[i][s];
            matrix[i][s] = matrix[i][z];
            matrix[i][z] = swap;
        }

        for (int[] array : matrix) {
            for (int element : array) {
                System.out.printf("%3d ", element);
            }
            System.out.println();
        }
    }
    private static void task9(int n, int m){
        int[][] matrix = new int[n][m];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
                System.out.printf("%3d ", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        int maxColumn = 1;
        int maxSum = 0;
        int sum = 0;
        for (int j = 0; j < matrix[0].length; j++) {
            for (int i = 0; i < matrix.length; i++) {
                sum += matrix[i][j];
            }
            System.out.printf("%nThe sum elements in column is №%d: %d", j + 1, sum);
            if (sum > maxSum) {
                maxSum = sum;
                maxColumn = j + 1;
            }
            sum = 0;
        }

        System.out.printf("\n\nColumn №%d consists max sum.", maxColumn);
        System.out.println();
    }
    private static void task10(int n){
        int[][] arrayForTask10 = new int[n][n];
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                arrayForTask10[i][j] = (int) (Math.random() * 100) + 1;
                System.out.printf("%3d ", arrayForTask10[i][j]);
            }
            System.out.println();
        }
        for (int i=0; i<n; i++)
            if (arrayForTask10[i][i] > 0) {
                System.out.printf("\n"+"%3d ", arrayForTask10[i][i]);
            }
    }
}
