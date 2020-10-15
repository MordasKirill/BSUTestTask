package com.software_development.lesson2;

import java.util.Arrays;
import java.util.Scanner;

public class OneDimensionalArraysAndSorts {
    public static void main(String[] args) {

        //Task 1
        //Union of arrays task
        Scanner scannerForTask1 = new Scanner(System.in);
        System.out.println("Enter quantity elements of first array: ");
        int firstArrayLength = scannerForTask1.nextInt();
        System.out.println("\n\nEnter quantity elements of second array: ");
        int secondArrayLength = scannerForTask1.nextInt();
        System.out.println("\n\nChoose number from first array: ");
        int k = scannerForTask1.nextInt();
        unionOfArraysTask1(firstArrayLength, secondArrayLength, k);

        //Task 2
        //Form a new non-decreasing sequence of numbers task
        Scanner scannerFotTask2 = new Scanner(System.in);
        System.out.println("Enter quantity elements of first sequence: ");
        int firstSequence = scannerFotTask2.nextInt();
        System.out.println("\n\nEnter quantity elements of second sequence: ");
        int secondSequence = scannerFotTask2.nextInt();
        nonDecreasingSequenceTask2(firstSequence, secondSequence);

        //Task 3
        //Selection sort task
        Scanner scannerForTask3 = new Scanner(System.in);
        System.out.println("Enter quantity elements of sequence: ");
        int sequenceLengthTask3 = scannerForTask3.nextInt();
        selectionSortTask3(sequenceLengthTask3);

        //Task 4
        //Sorting by exchanges task
        Scanner scannerForTask4 = new Scanner(System.in);
        System.out.println("Enter quantity elements of array: ");
        int arrayLengthTask4 = scannerForTask4.nextInt();
        sortingExchangesTask4(arrayLengthTask4);

        //Task 5
        //Sort by inserts task
        Scanner scannerForTask5 = new Scanner(System.in);
        System.out.println("Enter quantity of the sequence. ");
        int arrayLengthTask5 = scannerForTask5.nextInt();
        int[] array = new int[arrayLengthTask5];

        for (int i = 0; i < array.length; i++) {
            int positiveNegative = Math.random() < 0.5 ? -1 : 1;
            array[i] = (int) (Math.random() * 100) * positiveNegative;
            System.out.print(array[i] + ", ");
        }

        sortingByInsert(array);

        System.out.println("\nAfter sorting: ");
        for (int value : array) {
            System.out.print(value + ", ");
        }

        //Task 6
        //Shell sorting task
        Scanner scannerForTask6 = new Scanner(System.in);
        System.out.println("Enter quantity of the sequence. ");
        int n2 = scannerForTask6.nextInt();
        System.out.println("\nResult after sorting: ");
        sortingShellTask6(randomArray(n2));

        //Task 8
        //Make a program
        //which brings fractions to a common denominator and orders them in ascending order
        calculateFractionsTask8();

    }

    private static int [] randomArray(int n){
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            int positiveNegative = Math.random() < 0.5 ? -1 : 1;
            array[i] = (int) (Math.random() * 100) * positiveNegative;
            System.out.print(array[i] + ", ");
        }
        return array;
    }
    private static void unionOfArraysTask1(int firstArrayLength, int secondArrayLength, int k){
        //todo in progress, not done yet
        int [] firstArray = new int [firstArrayLength];
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i]= (int) (Math.random()*100)-50;
            System.out.print(firstArray[i] + ", ");
        }
        System.out.println(Arrays.toString(firstArray));
        int [] secondArray = new int [secondArrayLength];
        for (int i = 0; i < secondArray.length; i++) {
            secondArray[i]= (int) (Math.random()*100)-50;
            System.out.print(secondArray[i] + ", ");
        }
        System.out.println(Arrays.toString(secondArray));
        System.out.println("\n\nResult of joining two arrays : ");
        for (int i = 0; i < firstArray.length; i++) {
            System.out.print(firstArray[i] + ", ");
            if (k == firstArray[i]) {
                for (int j = 0; j < secondArray.length; j++) {
                    System.out.print(secondArray[j] + ", ");
                }
            }
        }
    }
    private static void nonDecreasingSequenceTask2(int n, int m){
        int[] firstArray = new int[n + 1];
        for (int i = 1; i < firstArray.length; i++) {
            firstArray[i] = firstArray[i - 1] + 1;
            System.out.print(firstArray[i] + ", ");
        }
        int[] secondArray = new int[m + 1];
        for (int i = 1; i < secondArray.length; i++) {
            secondArray[i] = secondArray[i - 1] + 2;
            System.out.print(secondArray[i] + ", ");
        }
        int[] joinArray = new int[firstArray.length + secondArray.length];
        for (int i = 0; i < joinArray.length; i++) {
            if (i < firstArray.length) {
                joinArray[i] = firstArray[i];
            } else {
                joinArray[i] = secondArray[i - firstArray.length];
            }
        }
        for (int i = joinArray.length - 1; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (joinArray[j] > joinArray[j + 1]) {
                    int element = joinArray[j];
                    joinArray[j] = joinArray[j + 1];
                    joinArray[j + 1] = element;
                }
            }
        }
        System.out.println("\n\nNew sequence: ");
        for(int value : joinArray){
            System.out.print(value+ ", ");
        }
    }
    private static void selectionSortTask3(int n){
        int[] array = new int[n + 1];
        for (int i = 1; i < array.length; i++) {
            array[i] = array[i - 1] + 3;
            System.out.print(array[i] + ", ");
        }
        System.out.println();
        int max;
        int element;
        for (int i = 0; i < array.length; i++) {
            max = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] > array[max]) {
                    max = j;
                }
            }
            element = array[i];
            array[i] = array[max];
            array[max] = element;
        }
        for (int value : array)
            System.out.print(value + ", ");
    }
    private static void sortingExchangesTask4(int n){
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100) - 50;
            System.out.print(array[i] + ", ");
        }
        System.out.println("\n\n Bubble sort : ");
        int swap;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {

                if (array[i] < array[j]) {
                    swap = array[i];
                    array[i] = array[j];
                    array[j] = swap;
                }
            }
        }
        for (int value : array) {
            System.out.print(value + ", ");
        }
    }
    private static void sortingByInsert(int[] array) {
        int element;
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                element = array[i + 1];
                int j = binarySearch(array, i, array[i + 1]);
                for (int k = i + 1; k > j; k--) {
                    array[k] = array[k - 1];
                }
                array[j] = element;
            }
        }
    }

    private static int binarySearch(int[] array, int lastIndex, int element) {
        int j = lastIndex;
        int firstIndex = 0;
        while (firstIndex <= lastIndex) {
            j = (firstIndex + lastIndex) / 2;
            if (array[j] == element) {
                return j;
            } else if (array[j] < element) {
                firstIndex = j + 1;
            } else if (array[j] > element && j != 0 && !(array[j - 1] < element)) {
                lastIndex = j - 1;
            } else {
                break;
            }
        }
        return j;
    }
        private static void sortingShellTask6(int[] array){
            int element;
            int i = 1;
            while (i < array.length) {
                if (array[i - 1] > array[i]) {
                    element = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = element;
                    if (i - 1 > 0) {
                        i--;
                    }
                } else {
                    i++;
                }
            }
            for (int value : array) {
                System.out.print(value + ", ");
            }
    }
    private static void calculateFractionsTask8(){
        Fraction [] array = {new Fraction(1, 3), new Fraction(2, 4),
                new Fraction(7, 12), new Fraction(5, 12),
                new Fraction(12, 3), new Fraction(17, 24),
                new Fraction(5, 6), new Fraction(13, 3)};

        setCommonDenominator(array);
        sortFractionArray(array);
        for (Fraction element : array) {
            System.out.print(element + ", ");
        }
        System.out.print("\b\b");
    }
    private static void setCommonDenominator (Fraction [] array) {
        boolean isCommon = false;
        int commonDenominator = 0;
        while (!isCommon) {
            isCommon = true;
            commonDenominator++;
            for (Fraction element : array) {
                if (commonDenominator % element.denominator != 0) {
                    isCommon = false;
                    break;
                }
            }
        }

        for (Fraction element : array) {
            element.numerator *= (double) commonDenominator / element.denominator;
            element.denominator = commonDenominator;
        }
    }
    private static void sortFractionArray (Fraction [] array) {
        for (int i = array.length - 1; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j].numerator > array[j + 1].numerator) {
                    Fraction element = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = element;
                }
            }
        }
    }

    static class Fraction {
        int numerator;
        int denominator;
        Fraction(int numerator, int denominator) {
            this.numerator = numerator;
            this.denominator = denominator;
        }

        @Override
        public String toString() {
            return String.format("%d/%d", numerator, denominator);
        }
    }
}
