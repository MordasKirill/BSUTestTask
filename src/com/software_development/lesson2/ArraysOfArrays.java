package com.software_development.lesson2;

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
        //Display the elements that are on the diagonal.
        System.out.println("Enter quality of strings");
        Scanner scanner = new Scanner(System.in);
        int strings = scanner.nextInt();
        System.out.println("Enter quality of columns");
        int columns = scanner.nextInt();
        matrixOperationsTask2(createMatrix(strings, columns));

        //Task #3
        //Print the k row and p column of the matrix
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
        matrixOperationsTask3(arrayForTask3, firstVariableTask3, secondVariableTask3);

        //Task #4
        //Generate a square matrix of order n according to the given pattern (n is even);
        System.out.println("Enter the square matrix with even number n: ");
        Scanner scannerForTask4 = new Scanner(System.in);
        int variableTask4 = scannerForTask4.nextInt();
        matrixOperationsTask4(variableTask4);

        //Task #5
        //Generate a square matrix of order n according to the given pattern (n is even):
        System.out.println("Enter the square matrix with even number n: ");
        Scanner scannerForTask5 = new Scanner(System.in);
        int variableTask5 = scannerForTask5.nextInt();
        matrixOperationsTask5(variableTask5);

        //Task #6
        //Generate a square matrix of order n according to the given pattern (n is even):
        System.out.println("Enter the square matrix with even number n: ");
        Scanner scannerForTask6 = new Scanner(System.in);
        int variableForTask6 = scannerForTask6.nextInt();
        matrixOperationsTask6(variableForTask6);

        //Task #7
        //Generate a square matrix of order n according to the given rule:
        System.out.println("Enter the square matrix with even number n: ");
        Scanner scannerForTask7 = new Scanner(System.in);
        int variableForTask7 = scannerForTask7.nextInt();
        matrixOperationsTask7(variableForTask7);

        //Task #8
        //In the numerical matrix, swap two columns of any column,
        //i.e. , put all the elements of one column at the corresponding
        //positions of the other, and move the elements of the second to the first.
        //Column numbers are entered by the user from the keyboard.
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
        matrixOperationsTask8(firstVariableTask8, secondVariableTask8, thirdVariableTask8, fourthVariableTask8, createMatrix(firstVariableTask8, secondVariableTask8));

        //Task #9
        //A matrix of non-negative numbers is given.
        //Calculate the sum of the elements in each column.
        //Determine which column contains the maximum amount.
        Scanner scannerForTask9 = new Scanner(System.in);
        System.out.println("Enter quality of strings");
        int firstVariableTask9 = scannerForTask9.nextInt();
        System.out.println("Enter quality of columns");
        int secondVariableTask9 = scannerForTask9.nextInt();
        matrixOperationsTask9(firstVariableTask9, secondVariableTask9);

        //Task #10
        //A matrix of non-negative numbers is given.
        //Calculate the sum of the elements in each column.
        //Determine which column contains the maximum amount.
        System.out.println("Enter the square matrix with even number n: ");
        Scanner scannerForTask10 = new Scanner(System.in);
        int variableTask10 = scannerForTask10.nextInt();
        matrixOperationsTask10(variableTask10);

        //Task 11
        //Fill the 10x20 matrix with random numbers from 0 to 15.
        //Display the matrix itself and row numbers, in
        //of which the number 5 occurs three or more times
        matrixOperationsTask11();

        //Task 12
        //Sort matrix strings in ascending and descending order of element values.
        Scanner scannerForTask12 = new Scanner(System.in);
        System.out.println("Enter quality of strings");
        int stringsTask12 = scannerForTask12.nextInt();
        System.out.println("Enter quality of columns");
        int columnsTask12 = scannerForTask12.nextInt();
        matrixOperationsTask12(createMatrix(stringsTask12, columnsTask12));

        //Task 13
        //Sort matrix columns in ascending and descending order of element values.
        Scanner scannerForTask13 = new Scanner(System.in);
        System.out.println("Enter quality of strings");
        int stringsTask13 = scannerForTask13.nextInt();
        System.out.println("Enter quality of columns");
        int columnsTask13 = scannerForTask13.nextInt();
        matrixOperationsTask13(createMatrix(stringsTask13, columnsTask13));

        //Task 14
        //Generate a random matrix m x n consisting of zeros and ones,
        //with a number in each column units equals column number.
        Scanner scannerForTask14 = new Scanner(System.in);
        System.out.println("Enter quality of strings");
        int stringsTask14 = scannerForTask14.nextInt();
        System.out.println("Enter quality of columns equals quality of strings ");
        int columnsTask14 = scannerForTask14.nextInt();
        matrixOperationsTask14(stringsTask14, columnsTask14);

        //Task 15
        //Find the largest element of the matrix and replace all odd elements with it
        Scanner scannerForTask15 = new Scanner(System.in);
        System.out.println("Enter quantity of strings");
        int stringsTask15 = scannerForTask15.nextInt();
        System.out.println("Enter quantity of columns");
        int columnsTask15 = scannerForTask15.nextInt();
        matrixOperationsTask15(createMatrix(stringsTask15, columnsTask15));

        //Task 16
        //A magic square of order n is a square matrix of size n x n, composed of numbers 1, 2, 3,
        //..., n 2 so that the sums over each column, each row, and each of the two large diagonals are equal between
        //each other. Construct such a square.
        Scanner scannerForTask16 = new Scanner(System.in);
        System.out.println("Enter the odd dimension of the matrix: ");
        int dimension = scannerForTask16.nextInt();

        if(dimension%2!=0) {
            System.out.println("\"Magic square\" \n\nodd number of elements:");
            oddMagicSquare(dimension);
        }


        else  {
            System.out.println("For matrix with " + dimension+" dimension this program" +
                    "\ncan't make\n \"Magic square\". " +
                    "\n\nTry to restart the program using a odd dimension\n.");
        }

    }
    private static int [] [] createMatrix(int n, int m){
        int[][] matrix = new int[n][m];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int positiveNegative = Math.random() < 0.5 ? -1 : 1;
                matrix[i][j] = (int) (Math.random() * 100) * positiveNegative;
                System.out.printf("%3d ", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        return matrix;
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
    private static void matrixOperationsTask2(int [] [] matrix){
        System.out.println("Elements of the main diagonal:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    System.out.printf("%3d  ", matrix[i][j]);
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Side diagonal elements:");
        for (int i = matrix.length-1; i >= 0; i--) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i + j == matrix.length-1) {
                    System.out.printf("%3d  ", matrix[i][j]);
                }
            }
            System.out.println();
        }
    }
    private static void matrixOperationsTask3(int [] [] arrayForTask3, int firstVariableTask3, int secondVariableTask3){
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
    private static void matrixOperationsTask4(int n){

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
    private static void matrixOperationsTask5(int n){
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
    private static void matrixOperationsTask6(int n){
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
    private static void matrixOperationsTask7(int n){
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
    private static void matrixOperationsTask8(int n, int m, int s, int z, int [] [] matrix){
        int swap;
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
    private static void matrixOperationsTask9(int n, int m){
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
    private static void matrixOperationsTask10(int n){
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
    private static void matrixOperationsTask11 (){
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
    private static void matrixOperationsTask12(int [] [] matrix){
        boolean isSorted;
        int swap;
        System.out.println("Sorting by ascending ");
        for (int i = 0; i < matrix.length; i++) {
            isSorted = false;
            while (!isSorted) {
                isSorted = true;
                for (int j = 0; j < matrix[i].length - 1; j++) {
                    if (matrix[i][j] > matrix[i][j + 1]) {
                        isSorted = false;
                        swap = matrix[i][j];
                        matrix[i][j] = matrix[i][j + 1];
                        matrix[i][j + 1] = swap;
                    }
                }
            }
        }
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.printf("%3d ", anInt);
            }
            System.out.println();
        }
        System.out.println("\nSorting by descending  ");
        for (int i = 0; i < matrix.length; i++) {
            isSorted = false;
            while (!isSorted) {
                isSorted = true;
                for (int j = 0; j < matrix[i].length - 1; j++) {
                    if (matrix[i][j] < matrix[i][j + 1]) {
                        isSorted = false;
                        swap = matrix[i][j];
                        matrix[i][j] = matrix[i][j + 1];
                        matrix[i][j + 1] = swap;
                    }
                }
            }
        }
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.printf("%3d ", anInt);
            }
            System.out.println();
        }
    }
    private static void matrixOperationsTask13(int [] [] matrix){
            boolean isSorted;
            int swap;
            System.out.println("\nSorting by ascending ");
            for (int j = 0; j < matrix[0].length; j++) {
                isSorted = false;
                while (!isSorted) {
                    isSorted = true;
                    for (int i = 0; i < matrix.length - 1; i++) {
                        if (matrix[i][j] > matrix[i + 1][j]) {
                            isSorted = false;
                            swap = matrix[i][j];
                            matrix[i][j] = matrix[i + 1][j];
                            matrix[i + 1][j] = swap;
                        }
                    }
                }
            }
            for (int[] ints : matrix) {
                for (int anInt : ints) {
                    System.out.printf("%3d ", anInt);
                }
                System.out.println();
            }
            System.out.println("\nSorting by descending  ");
            for (int j = 0; j < matrix[0].length; j++) {
                isSorted = false;
                while (!isSorted) {
                    isSorted = true;
                    for (int i = 0; i < matrix.length - 1; i++) {
                        if (matrix[i][j] < matrix[i + 1][j]) {
                            isSorted = false;
                            swap = matrix[i][j];
                            matrix[i][j] = matrix[i + 1][j];
                            matrix[i + 1][j] = swap;
                        }
                    }
                }
            }
            for (int[] ints : matrix) {
                for (int anInt : ints) {
                    System.out.printf("%3d ", anInt);
                }
                System.out.println();
            }
    }
    private static void matrixOperationsTask14(int n, int m){
        int[][] matrix = new int[n][m];

        if(m == n) {
            int count;
            for (int i = 0; i < matrix.length; i++) {
                count = i + 1;
                for (int j = 0; j < matrix[i].length; j++) {
                    if (count - 1 > 0) {
                        matrix[i][j] = 0;
                        count--;
                    } else {
                        matrix[i][j] = 1;
                    }
                    System.out.printf("%3d ", matrix[i][j]);
                }
                System.out.println();
            }
        }else System.out.println("If you want to get correct answer please enter m = n! ");
    }
    private static void matrixOperationsTask15(int [] [] matrix){
        int max = Integer.MIN_VALUE;
        for (int [] array : matrix) {
            for (int element : array) {
                if (element > max) {
                    max = element;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 != 0) {
                    matrix[i][j] = max;
                }
            }
        }
        for (int[] array : matrix) {
            for (int element : array) {
                System.out.printf("%3d ", element);
            }
            System.out.println();
        }
    }

    //oddMatrixSquare - данный метод используется для построения "Магического квадрата" из нечетного колличества элементов
    //алгоритм использующийся в данном методе называется "Сиамским методом"
    public static void oddMagicSquare(int n) {
        int[][] matrix = new int[n][n];
        int x = n/2;
        int y = matrix.length-1;
        int count = 1;

        while (true){
            matrix[(matrix.length-1)-y][x] = count;
            count++;

            if(x==matrix.length-1) x=-1;
            if(y>=matrix.length-1) y=-1;
            y++;
            x++;
            if (matrix[matrix.length-1-y][x] != 0) y--;

            int count1=0;
            for (int[] array:matrix) {
                for (int z :array) {
                    if(z == 0) count1++;
                }
            }
            if (count1==0) break;
        }

        printMatrix(matrix);
    }
    //В метде evenMatrixSquare нужно использовать отсортированную матрицу,
    //именно этим занимается метод standardMatrixFilling (можете вызвать его с любой размерность и посмотреть что будет)
    public static int[][] standardMatrixFilling(int n){
        int[][] matrix = new int[n][n];
        int count = 1;

        for (int i = 0; i > matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = count;
                count++;
            }
        }
        return  matrix;
    }
    //Метод printMatrix отвечает за вывод матрицы на экран
    public static void printMatrix (int[][] matrix) {
        for (int[] array : matrix) {
            for (int x : array) {
                System.out.print(x + "\t");
            }
            System.out.println();
        }
        System.out.println("");
    }

}
