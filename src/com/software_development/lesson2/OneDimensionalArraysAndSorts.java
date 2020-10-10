package com.software_development.lesson2;

import java.util.Scanner;

public class OneDimensionalArraysAndSorts {
    public static void main(String[] args) {
        //Task 1
        Scanner scannerForTask1 = new Scanner(System.in);
        System.out.println("Enter quantity elements of first array: ");
        int firstArrayLength = scannerForTask1.nextInt();
        System.out.println("\n\nEnter quantity elements of second array: ");
        int secondArrayLength = scannerForTask1.nextInt();
        System.out.println("\n\nChoose number from first array: ");
        int k = scannerForTask1.nextInt();
        task1(firstArrayLength, secondArrayLength, k);

        //Task 2
        Scanner scannerFotTask2 = new Scanner(System.in);
        System.out.println("Enter quantity elements of first sequence: ");
        int firstSequence = scannerFotTask2.nextInt();
        System.out.println("\n\nEnter quantity elements of second sequence: ");
        int secondSequence = scannerFotTask2.nextInt();
        task2(firstSequence, secondSequence);

        //Task 3
        Scanner scannerForTask3 = new Scanner(System.in);
        System.out.println("Enter quantity elements of sequence: ");
        int sequenceLengthTask3 = scannerForTask3.nextInt();
        task3(sequenceLengthTask3);

        //Task 4
        Scanner scannerForTask4 = new Scanner(System.in);
        System.out.println("Enter quantity elements of array: ");
        int arrayLengthTask4 = scannerForTask4.nextInt();
        task4(arrayLengthTask4);

        //Task 5
        Scanner scannerForTask5 = new Scanner(System.in);
        System.out.println("Enter quantity of the sequence. ");
        int quantityOfSequence = scannerForTask5.nextInt();

        sortingByInsert(randomArray(quantityOfSequence));
        System.out.println("\nAfter sorting: ");
        for (int value : randomArray(quantityOfSequence)) {
            System.out.print(value + ", ");
        }

        //Task 6
        Scanner scannerForTask6 = new Scanner(System.in);
        System.out.println("Enter quantity of the sequence. ");
        int n = scannerForTask6.nextInt();
        System.out.println("\nResult after sorting: ");
        sortingShell(randomArray(n));
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
    private static void task1(int firstArrayLength, int secondArrayLength, int k){
        //todo in progress, not done yet
        int [] firstArray = new int [firstArrayLength];
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i]= (int) (Math.random()*100)-50;
            System.out.print(firstArray[i] + ", ");
        }
        int [] secondArray = new int [secondArrayLength];
        for (int i = 0; i < secondArray.length; i++) {
            secondArray[i]= (int) (Math.random()*100)-50;
            System.out.print(secondArray[i] + ", ");
        }
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
    private static void task2(int n, int m){
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
                    int temp = joinArray[j];
                    joinArray[j] = joinArray[j + 1];
                    joinArray[j + 1] = temp;
                }
            }
        }
        System.out.println("\n\nNew sequence: ");
        for(int value : joinArray){
            System.out.print(value+ ", ");
        }
    }
    private static void task3(int n){
        int[] array = new int[n + 1];
        for (int i = 1; i < array.length; i++) {
            array[i] = array[i - 1] + 3;
            System.out.print(array[i] + ", ");
        }
        System.out.println();
        int max;
        int temp;
        for (int i = 0; i < array.length; i++) {
            max = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] > array[max]) {
                    max = j;
                }
            }
            temp = array[i];
            array[i] = array[max];
            array[max] = temp;
        }
        for (int value : array)
            System.out.print(value + ", ");
    }
    private static void task4(int n){
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
        //todo bugFix needed, in progress
        int temp;
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                temp = array[i + 1];
                int j = binarySearch(array, i, array[i + 1]);
                for (int k = i + 1; k > j; k--) {
                    array[k] = array[k - 1];
                }
                array[j] = temp;
            }
        }
    }

    private static int binarySearch(int[] array, int lastIndex, int element) {
        //todo bugFix needed, in progress
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
        private static void sortingShell(int[] array){
        //todo bugFix needed, in progress
            int temp;
            int i = 1;
            while (i < array.length) {
                if (array[i - 1] > array[i]) {
                    temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
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
    private static void task7(){

    }
}
