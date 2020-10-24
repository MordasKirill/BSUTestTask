package com.software_development.lesson2;

import java.util.Scanner;

public class DecompositionUsingMethods {
    public static void main(String[] args) {
        //Task 1
        //Write a method to find the greatest common
        //divisor and least common multiple of 2 natural numbers
        //todo in progress
        //Task 2
        //write a method to find the greatest common divisor of 4 natural numbers
        int greatestCommonFactor;
        int [] number = fillArrayTask2();
        greatestCommonFactor = findGreatestCommonFactorTask2(number);
        System.out.println("\nLargest Common Factor: " + greatestCommonFactor);

        //Task 3
        //Calculate the area of ​​a polygon
        Scanner scannerForTask3 = new Scanner(System.in);
        System.out.println("Enter the side of hexagon: ");
        double a = scannerForTask3.nextInt();
        System.out.println("The area of hexagon: ");
        System.out.printf("%.1f", squareCounterTask3(a));

        //Task 4
//        Scanner scannerForTask4 = new Scanner(System.in);
//        System.out.println("Enter quality of strings");
//        int amountOfStringsTask4 = scannerForTask4.nextInt();
//        System.out.println("Enter quality of columns");
//        int amountOfColumnsTask4 = scannerForTask4.nextInt();
//        int[][] matrix = new int[amountOfStringsTask4][amountOfColumnsTask4];
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                int positiveNegative = Math.random() < 0.5 ? -1 : 1;
//                matrix[i][j] = (int) (Math.random() * 100) * positiveNegative;
//                System.out.printf("%3d ", matrix[i][j]);
//            }
//            System.out.println();
//        }
//        int [] result = findMaximumDistance(matrix);
//        System.out.printf("Maximum distance between of points is %d and %d, that equals %.2f %n",
//                result[0], result[1], maxDistance);
        //Task 5
        //Find the second largest number in an array
        Scanner scannerForTask5 = new Scanner(System.in);
        System.out.println("Enter the size numbers:");
        int arraySize = scannerForTask5.nextInt();
        int [] array = new int [arraySize];
        for (int i=0; i<array.length;i++){
            int positiveNegative = Math.random() < 0.5 ? -1 : 1;
            array[i] = (int) (Math.random() * 100) * positiveNegative;
            System.out.printf("%d, ", array[i]);
        }

        System.out.println("\nSecond maximum number of array is: ");
        findSecondMaxNumberTask5(array);

        //Task 6
        //Are 3 numbers co prime
        Scanner scannerForTask6 = new Scanner(System.in);
        System.out.println("Enter first number:" );
        int firstVariableTask6 = scannerForTask6.nextInt();

        System.out.println("Enter second number: ");
        int secondVariableTask6 = scannerForTask6.nextInt();

        System.out.println("Enter third number: ");
        int thirdVariableTask6 = scannerForTask6.nextInt();

        int [] numberTask6 = {firstVariableTask6, secondVariableTask6, thirdVariableTask6};
        System.out.println("Is number is co prime?  ");
        System.out.println(isMutuallyTask6(numberTask6));

        //Task 7
        //Calculating factorials of numbers from 1 to 9
        int [] arrayTask7 = {1, 3, 5, 7, 9};
        System.out.println("Sum of factorials: " + amountFactorialTask7(arrayTask7));

        //Task 8
        //Finding the sum of three consecutive array elements
        Scanner scannerForTask8 = new Scanner(System.in);
        System.out.println("Enter quantity of the array more then 6 elements: ");
        int arrayLength = scannerForTask8.nextInt();
        int[] arrayTask8 = new int[arrayLength];
        if (arrayLength >= 6) {
            for (int i = 0; i < arrayTask8.length; i++) {
                int positiveNegative = Math.random() < 0.5 ? -1 : 1;
                arrayTask8[i] = (int) (Math.random() * 100) * positiveNegative;
                System.out.print(arrayTask8[i] + ", ");
            }
            System.out.println("\nResult after calculating: ");
            calculateSumTask8(arrayTask8, 1);
            calculateSumTask8(arrayTask8, 3);
            calculateSumTask8(arrayTask8, 4);
        } else {
            System.out.println("You entered less then 6 elements: ");
        }
        //Task 9
        //Calculating the area of ​​a quadrilateral
        Scanner scannerForTask9 = new Scanner(System.in);
        System.out.println("Enter the sizes of sides quadrangle: ");
        System.out.println("x = ");
        int x = scannerForTask9.nextInt();
        System.out.println("y = ");
        int y = scannerForTask9.nextInt();
        System.out.println("z = ");
        int z = scannerForTask9.nextInt();
        System.out.println("t = ");
        int t = scannerForTask9.nextInt();

        System.out.println("The area of quadrangle is: ");
        double quadrilateral = (float) calculateSquareTask9(x, y, z, t);
        System.out.println(quadrilateral);

        //Task 10
        //Number n is given. Write a method for filling an array,
        //the elements of which are the digits of the number n
        Scanner scannerForTask10 = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int arraySizeTask10 = scannerForTask10.nextInt();
        System.out.println("Enter number N: ");
        int n = scannerForTask10.nextInt();
        creationOfArrayTask10 (arraySizeTask10, n);

        //Task 11
        //Find which of the numbers has more digits
        Scanner scannerForTask11 = new Scanner(System.in);
        System.out.println("Enter the number M: ");
        int firstVariableTask11 = scannerForTask11.nextInt();
        System.out.println("Enter the number N: ");
        int secondVariableTask11 = scannerForTask11.nextInt();
        System.out.println("Number that consist more digits: ");
        System.out.println(moreDigitsTask11(firstVariableTask11, secondVariableTask11));

        //Task 12
        //The natural numbers K and N are given. Write a method (methods) of forming the array A,
        //whose elements are numbers whose sum of digits is equal to K and which are not
        //greater than N.
        Scanner scannerForTask12 = new Scanner(System.in);
        System.out.println("Enter the number K: ");
        int firstVariableTask12 = scannerForTask12.nextInt();;
        System.out.println("Enter the number N: ");
        int secondVariableTask12 = scannerForTask12.nextInt();

        int [] arrayTask12 = createArrayTask12(firstVariableTask12, secondVariableTask12);

        System.out.println("The result is: ");
        printArrayTask12(arrayTask12);

        //Task 13
        //Two primes are called “twins” if they differ from each other
        //by 2 (41 and 43). Find and print all pairs of “twins” from the segment
        //[n, 2n], where n is a given positive integer greater than 2. To solve the problem
        //use decomposition.
        Scanner scannerForTask13 = new Scanner(System.in);
        System.out.println("(Task 13) Enter N: ");
        int variableTask13 = scannerForTask13.nextInt();
        int [][] twinNumbers = findTwinTask13(variableTask13);
        System.out.printf("Numbers \"Twins\" on the distance from %d till %d:%n", n, n * 2);
        printMatrixTask13(twinNumbers);

        //Task 14
        //Find Armstrong numbers
        System.out.println("(Task 14) Enter K:");
        Scanner scannerForTask14 = new Scanner(System.in);
        int variableTask14 = scannerForTask14.nextInt();
        printArmstrongNumbersTask14(variableTask14);

        //Task 15
        //Find all natural n-digit numbers in which the numbers form a strictly increasing
        //sequence
        Scanner scannerForTask15 = new Scanner(System.in);
        System.out.println("(Task 15) Enter N: ");
        int variableTask15 = scannerForTask15.nextInt();
        findNumbersTask15(variableTask15);

        //Task 16
        //Write a program that determines the sum of
        //n - digit numbers containing only odd numbers.
        Scanner scannerForTask16 = new Scanner(System.in);
        System.out.println("(Task 16) Enter N: ");
        int variableTask16 = scannerForTask16.nextInt();
        int sum = calculateSumTask16(variableTask16);
        int evenNumbers = countEvenNumbersTask16(sum);
        System.out.printf("Sum %d numbers, consists even numbers: %d %n", variableTask16, sum);
        System.out.printf("In founded sum %d even numbers", evenNumbers);

        //Task 17
        //Subtract the sum of its digits from the given number. Subtract the sum of it from the result again.
        //numbers, etc.
        Scanner scannerForTask17 = new Scanner(System.in);
        System.out.println("(Task 17) Enter number: ");
        int variableTask17 = scannerForTask17.nextInt();
        System.out.println("\nThe quantity of the subtractions: " + countSubtractionTask17(variableTask17));
    }

    private static int [] fillArrayTask2() {
        Scanner scanner = new Scanner(System.in);
        int [] array = new int[4];
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter number a" + (i + 1) + ":");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static int findGreatestCommonFactorTask2(int [] number) {
        int a = Math.abs(number[0]);
        for (int element : number) {
            int b = Math.abs(element);
            while (a != 0 && b != 0) {
                if (a > b) {
                    a %= b;
                } else {
                    b %= a;
                }
            }
            a += b;
        }
        return a;
    }
    private static double squareCounterTask3(double a) {
        return (3 * Math.sqrt(3) * Math.pow(a, 2)) / 2;
    }
    private static double distanceCounter (int [][] matrix) {
        return Math.sqrt(Math.pow((matrix[0][0] - matrix[1][0]), 2)
                + Math.pow((matrix[0][1] - matrix[1][1]), 2));
    }

    //todo task 4 is not done yet
//    private static int [] findMaximumDistance (int [][] matrix) {
//        int [] result = new int[2];
//        double distance;
//        maxDistance = 0;
//        for (int i = 0; i < matrix.length - 1; i++) {
//            for (int j = i + 1; j < matrix.length; j++) {
//                int [][] currentPoints = {{matrix[i][0], matrix[i][1]},
//                        {matrix[j][0], matrix[j][1]}};
//                distance = distanceCounter(currentPoints);
//                if (distance > maxDistance) {
//                    maxDistance = distance;
//                    result[0] = i + 1;
//                    result[1] = j + 1;
//                }
//            }
//        }
//        return result;
//    }
private static void findSecondMaxNumberTask5(int [] array){
    int swap;
    for (int i=0; i<array.length;i++) {
        for (int j = 0; j < i; j++) {
            if(array[i] < array[j]) {
                swap = array[i];
                array[i] = array[j];
                array[j] = swap;
            }
        }
    }
    System.out.printf("%d, ", array[array.length - 2]);
}
    private static boolean isMutuallyTask6 (int[] a) {
        return findGreatestCommonFactorTask2(a) == 1;
    }
    private static int amountFactorialTask7 (int [] array) {
        int amount = 0;
        for (int element : array) {
            amount += factorialTask7(element);
        }
        return amount;
    }
    private static int factorialTask7 (int n) {
        int result = 1;
        if (n == 1 || n == 0) {
            return result;
        }
        result = n * factorialTask7(n - 1);
        return result;
    }
    private static void calculateSumTask8(int[] array, int k) {
        int sum = 0;
        for (int i = k - 1; i < k + 2; i++) {
            sum += array[i];
        }
        System.out.println(sum);
    }
    private static double calculateSquareTask9(double x, double y, double z, double t) {
        double diagonal = Math.sqrt(x * x + y * y);
        double s1 = x * y / 2;
        double p = (diagonal + z + t) / 2;
        double s2 = Math.sqrt(p * (p - diagonal) * (p - z) * (p - t));
        return s1 + s2;
    }
    private static void creationOfArrayTask10 (int m, int n) {
        int[] array = new int[m];
        for (int i = 0; i < array.length; i++) {
            array[i] = n;
            System.out.printf("%d, ", array[i]);
        }
    }
    private static String moreDigitsTask11(int m, int n) {
        int firstCount = (int) (Math.log10(Math.abs(m)) + 1);
        int secondCount = (int) (Math.log10(Math.abs(n)) + 1);
        if (firstCount == secondCount) {
            return "The quantity of digits is equal";
        } else {
            return (firstCount > secondCount) ? ("M consists more") : ("N consists more");
        }
    }
    private static int [] createArrayTask12 (int k, int n) {
        int [] array = new int[k];
        int i;
        for (i = 0; i < array.length && k > n; i++) {
            array[i] = (int) (Math.random() * n) + 1;
            k -= array[i];
        }
        array[i] = k;
        int [] arrayA = new int[i + 1];
        System.arraycopy(array, 0, arrayA, 0, i + 1);
        return arrayA;
    }

    private static void printArrayTask12 (int [] array) {
        for (int element : array) {
            System.out.printf("%3d ", element);
        }
    }
    private static int [][] findTwinTask13 (int n) {
        int [][] twinNumbers = new int[n - 1][2];
        for (int i = 0; i < twinNumbers.length; i++) {
            twinNumbers[i][0] = n + i;
            twinNumbers[i][1] = twinNumbers[i][0] + 2;
        }
        return twinNumbers;
    }

    private static void printMatrixTask13 (int [][] square) {
        for (int[] array : square) {
            for (int element : array) {
                System.out.printf("%2d ", element);
            }
            System.out.println();
        }
    }
    private static void printArmstrongNumbersTask14(int k) {
        for (int i = 1; i <= k; i++) {
            if (isArmstrongTask14(i)) {
                System.out.print(i + " ");
            }
        }
    }
    private static boolean isArmstrongTask14(int number) {
        int sum = 0;

        int[] array = new int[lengthNumberTask14(number)];
        int n = number;
        for (int i = array.length; i > 0; i--) {
            array[i - 1] = n - (n / 10) * 10;
            n /= 10;
        }
        for (int element : array) {
            int inDegree = element;
            for (int j = 1; j < array.length; j++) {
                inDegree *= element;
            }
            sum += inDegree;
        }
        return number == sum;
    }
    private static int lengthNumberTask14(int n) {
        int length = 0;
        while (n >= 1) {
            length++;
            n /= 10;
        }
        return length;
    }
    private static void findNumbersTask15 (int n) {
        int [] number = new int[n];
        number[0] = 1;
        while (number[n - 1] < 9) {
            for (int i = 1; i < number.length; i++) {
                number[i] = number[0] + i;
            }
            for (int element : number) {
                System.out.print(element);
            }
            System.out.print(", ");
            number[0]++;
        }
        System.out.println("\b\b");
    }
    private static int calculateSumTask16(int n) {
        int[] numbers = findNumbersTask16(n);
        int sum = 0;
        for (int element : numbers) {
            sum += element;
        }
        return sum;
    }

    private static int[] findNumbersTask16(int n) {
        int size = (int) Math.pow(5, n);
        int[] numbers = new int[size];
        int firstNumber = 1;
        for (int i = 1; i < n; i++) {
            firstNumber += (int) Math.pow(10, i);
        }
        numbers[0] = firstNumber;

        for (int i = 1; i < numbers.length; i++) {
            numbers[i] = nextNumberTask16(numbers[i - 1], n);
        }
        return numbers;
    }
    private static int nextNumberTask16(int number, int n) {
        boolean isNext = false;
        while (!isNext) {
            number += 2;
            isNext = true;
            int m = n;
            while (m > 0) {
                if ((number / ((int) Math.pow(10, m-- - 1))) % 2 == 0) {
                    isNext = false;
                }
            }
        }
        return number;
    }
    private static int countEvenNumbersTask16(int n) {
        int rest;
        int count = 0;
        while (n != 0) {
            rest = n % 10;
            n = n / 10;
            if (rest % 2 == 0)
                count++;
        }
        return count;
    }
    private static int countSubtractionTask17(int number) {
        int count = 0;
        while (number > 0) {
            number -= countSumOfDigitsTask17(number);
            count++;
        }
        return count;
    }

    private static int countSumOfDigitsTask17(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.print(sum + ", ");
        return sum;
    }
}
