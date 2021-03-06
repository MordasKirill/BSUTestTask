package com.software_development.lesson2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class OneDimensionalArrays {
    public static void main(String[] args) {

        //Task #1
        //Find the sum of elements that are multiples of a given K
        Scanner inputTask1 = new Scanner(System.in);
        System.out.println("Input k: ");
        int variableTask1 = inputTask1.nextInt();
        int resultTask1 = multipleElementTask1(variableTask1, randomArray());
        System.out.println("This is a result of task 1: " + resultTask1);

        //Task #2
        //Replace terms larger than given Z by Z
        Scanner inputTask2 = new Scanner(System.in);
        System.out.println("Input Z: ");
        int variableTask2 = inputTask2.nextInt();
        int resultTask2 = countingReplacementsTask2(randomArray(), variableTask2);
        System.out.println("This is a result of task 2: " + resultTask2);

        //Task #3
        //Count how many positive  negative and zero elements
        String resultTask3 = countingPositiveNegativeZeroElementsTask3(randomArray());
        System.out.println("This is a result of task 3: " + resultTask3);

        //Task #4
        //Swap the largest and smallest elements
        double[] resultTask5 = swapMaxAndMinElementTask4(randomArray());
        System.out.println("This is a result of task 4: " + Arrays.toString(resultTask5));

        //Task #5
        //Print numbers for which ai> i
        System.out.println("Result of task 5: ");
        findingNumberValueGreaterThanOrdinalTask5(randomArray());

        //Task #6
        //Calculate the sum of numbers whose ordinal numbers are prime numbers
        System.out.println("Result of task 6: ");
        sumOfElementsWhoseOrdinalNumbersArePrimeNumbersTask6(randomArray());

        //Task #7
        //Finding out max sum pare of elements
        double resultOfTask7 = calculateFunctionTask7(randomArray());
        System.out.println(resultOfTask7);

        //Task #8
        //Throw out members equal min( a1, a2, ..., an )
        Random rand = new Random();
        int variableTask8 = rand.nextInt(20);
        int[] firstArray = new int[variableTask8];

        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = rand.nextInt(20) - 10;
            System.out.print(firstArray[i] + ", ");
        }
        System.out.println();
        System.out.println("Result of task 8: ");
        int [] resultOfTask8 = comparingElementsTask8(firstArray);
        System.out.println(Arrays.toString(resultOfTask8));

        //Task #9
        //Find the most common number
        int resultTask9 = mostCommonNumberTask9(firstArray);
        System.out.println("This is a result of task 4: " + resultTask9);

        //Task #10
        //Compress the array, throwing out every second element from it, fill the free spaces with 0
        System.out.println("Enter the size of array: ");
        Scanner scannerForTask10 = new Scanner(System.in);
        int variableForTask10 = scannerForTask10.nextInt();
        int[] array = new int[variableForTask10];
        for (int i = 0; i < array.length; i++) {
            int negativePositive = Math.random() < 0.5 ? -1 : 1;
            array[i] = (int) (Math.random() * 100) * negativePositive;
            System.out.print(array[i] + ";");
        }
        System.out.println();
        zerosChanging(array);
        System.out.println();
        arrayCompressing(array);

    }

    private static double[] randomArray(){
        int variable = (int) (Math.random()*20);
        double[] array = new double[variable];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100) + 1;
        }
        return array;
    }
    private static int multipleElementTask1(int k, double [] array) {
        int sum = 0;
        for(int i = 0 ; i < array.length ; i++){
            if (array[i] % k == 0) {
                sum += array[i];
            }
        }
        return sum;
    }
    private static int countingReplacementsTask2(double []  array, int z){
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
        return count;
    }
    private static String countingPositiveNegativeZeroElementsTask3(double [] array){
        int positiveNumbers = 0;
        int negativeNumbers = 0;
        int zeroNumbers = 0;

        for ( int i=0; i<array.length; i++){
            if(array[i]>0){
                positiveNumbers ++;
        }
        if (array[i]<0 ){
                negativeNumbers ++;
        }
        else zeroNumbers ++;
        }
        return "Positive numbers: "+positiveNumbers+"; Negative: "+negativeNumbers+"; Zeros: "+zeroNumbers;
    }
    private static double[] swapMaxAndMinElementTask4(double[] array){
        int minElementPosition = 0;
        int maxElementPosition = 0;
        double parsedMinElementPosition;
        for (int i = 1; i < array.length; i++)
        {
            minElementPosition = array[i] < array[minElementPosition] ? i : minElementPosition;
            maxElementPosition = array[i] > array[maxElementPosition] ? i : maxElementPosition;
        }
        System.out.println(Arrays.toString(array));
        parsedMinElementPosition = array[minElementPosition];
        array[minElementPosition] = array[maxElementPosition];
        array[maxElementPosition] = parsedMinElementPosition;
        return array;
    }
    private static void findingNumberValueGreaterThanOrdinalTask5(double [] array) {
        for(int i = 0; i < array.length; ++i) {
            if(array[i] > i) {
                System.out.print(array[i] + " ");

            }
        }
        System.out.println(Arrays.toString(array));
    }
    private static void sumOfElementsWhoseOrdinalNumbersArePrimeNumbersTask6(double [] array){
        System.out.println(Arrays.toString(array));
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (isPrime(i)) {
                System.out.println("Ordinal number of " + array[i] + " is prime");
                sum+=array[i];
            }
        }
        System.out.println("Summ: " + sum);
    }
    public static boolean isPrime(int x) {
        if (x < 2) return false;
        int temp;
        for (int i = 2; i <= x / 2; i++) {
            temp = x % i;
            if (temp == 0) {
                return false;
            }
        }
        return true;
    }
    public static double calculateFunctionTask7(double[] arr) {
        double max = Double.MIN_VALUE;
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            max = Math.max(max, arr[i] + arr[j]);
        }
        System.out.println("Original array:\n " + Arrays.toString(arr));
        return max;
    }
    private static int[] comparingElementsTask8(int[] firstArray){
        int n = firstArray.length;
        int minVal = Integer.MAX_VALUE;
        for (int element : firstArray) {
            minVal = Math.min(minVal, element);
        }
        int countMinElem = 0;
        for (int tmpEl : firstArray) {
            if (tmpEl != minVal) {
                countMinElem++;
            }
        }

        int[] secondArray = new int[n];
        int indexNewArray = 0;
        for (int element : firstArray) {
            if (element != minVal) {
                secondArray[indexNewArray++] = element;
                System.out.print(element + ", ");
            }
        }
        return secondArray;
    }
    private static int mostCommonNumberTask9(int [] firstArray){
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

}
