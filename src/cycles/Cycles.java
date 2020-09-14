package cycles;

import java.util.Scanner;

public class Cycles {
    private static int calculateFunctionForTheFirstTask(int variable) {
        int result = 0;
        for (int i = 1; i <= variable; i++) {
            result += i;
        }
        return result;
    }

    private static void calculateFunctionForTheSecondTask(int A, int B, double h, int x) {
        //Я не уверен, что уловил суть задания, но вроде так
        int y;
        for (double i = A; i <= B; i = i + h) {
            if (x > 2) {
                y = x;
            } else
                y = -x;
            System.out.println("x = " + x + "\n" + "y = " + y);
        }
    }

    private static int calculateFunctionForTheThirdTask() {
        int result = 0;
        for (int i = 1; i <= 100; i++) {
            result += Math.pow(i, 2);
        }
        return result;
    }

    private static double calculateFunctionForTheTaskFour() {
        double sum = 1;
        for (int i = 1; i <= 20; i++) {
            sum += sum * (Math.pow(i, 2));
        }
        return sum;
    }


    //С этого момента все методы типа void, потому что по-другому не возвращает то, что мне нужно


    private static void calculateFunctionForTheTaskFive(double e){
        int n = 0;
        double sum = 0;
        for (int i = 0; i<=10; i++){
            ++n;
            System.out.print("\n");
            double a =  (1/Math.pow(2,n))+ (1/Math.pow(3,n));
            System.out.printf("%.4f", a);
            if (e <= Math.abs(a))
                sum = sum+a;
            System.out.printf(" sum is %f", sum);

        }
    }
    private static void calculateFunctionForTheTaskSix() {
        char charsSigns = '\u0000';
        int charsNumber = 0;
        for (int i = 0; i <= 10000; i++) {
            charsSigns++;
            charsNumber++;
            System.out.println("\n sign: " + charsSigns + "  number: " + charsNumber);
        }
    }
    private static void calculateFunctionForTheTaskSeven(int m, int n){
        while (m <= n) {
            System.out.print("\nnumber: " + m);
            System.out.print(" its dividers: ");
            for (int i = 2; i <= m - 1; i++) {
                if (m % i == 0) {
                    System.out.print(i + ",");
                }
            }
            m = m + 1;
        }
    }
    private static void calculateFunctionForTheTaskEight(String firstVariable, String secondVariable){
        for (int f = 0; f < firstVariable.length(); f++) {
            firstVariable.charAt(f);
        }
        System.out.println(" ");
        for (int g = 0; g < secondVariable.length(); g++) {
            secondVariable.charAt(g);
        }
        System.out.println("The same numbers from two lines is: ");
        for (int i = 0; i < firstVariable.length(); i++) {
            for (int j = 0; j < secondVariable.length(); j++) {
                if (firstVariable.charAt(i) == secondVariable.charAt(j)) {
                    System.out.print("/" + secondVariable.charAt(j));
                }
            }
        }
    }
    public static void main(String[] args) {
        //Task #1, sum from 1 to n task
        //1 random input variable introduced for the first tusk as an example
        int variableTask1 = (int) (Math.random() * 10);
        int resultTask1 = calculateFunctionForTheFirstTask(variableTask1);
        System.out.println("This is a result of task 1: " + resultTask1);

        //Task #2, calculate function task
        //1 random input variable introduced for the first tusk as an example
        Scanner scannerForTaskTwo = new Scanner(System.in);
        System.out.println("Enter start line A");
        int firstVariableTaskTwo = scannerForTaskTwo.nextInt();
        System.out.println("Enter finish line B");
        int secondVariableTaskTwo = scannerForTaskTwo.nextInt();
        System.out.println("Enter step h");
        double thirdVariableTaskTwo = scannerForTaskTwo.nextDouble();
        System.out.println("Enter the value of x");
        int fourthVariableTaskTwo = scannerForTaskTwo.nextInt();
        System.out.println("This is a result of task 2: ");
        calculateFunctionForTheSecondTask(firstVariableTaskTwo, secondVariableTaskTwo, thirdVariableTaskTwo, fourthVariableTaskTwo);


        //Task #3, 1^2 + 2^2 + ... + n^2 task
        //1 random input variable introduced for the first tusk as an example
        int resultTask3 = calculateFunctionForTheThirdTask();
        System.out.println("This is a result of task 3: " + resultTask3);

        //Task #4, 1^2 + 2^2 + ... + n^2 task
        double resultTask4 = calculateFunctionForTheTaskFour();
        System.out.println("This is a result of task 4: " + resultTask4);

        //Task #5, 1^2 + 2^2 + ... + n^2 task
        System.out.println("Input е");
        Scanner scannerFotTaskFour = new Scanner(System.in);
        double e =  scannerFotTaskFour.nextDouble();
        System.out.println("This is a result of task 5: ");
        calculateFunctionForTheTaskFive(e);

        //Task #6, Display the correspondences between symbols and their numerical designations in the computer memory task
        System.out.println("This is a result of task 6: ");
        calculateFunctionForTheTaskSix();

        //Task #7, print all dividers except 1 and the number itself task
        //2 random input variable introduced for the first tusk as an example
        Scanner scannerForTaskSeven = new Scanner(System.in);
        System.out.println("Enter start of line numbers m ");
        int firstVariableTaskSeven = scannerForTaskSeven.nextInt();
        System.out.println("Enter end of line numbers n ");
        int secondVariableTaskSeven = scannerForTaskSeven.nextInt();
        System.out.println("This is a result of task 7: ");
        calculateFunctionForTheTaskSeven(firstVariableTaskSeven, secondVariableTaskSeven);

        //Task #8, find common numbers task
        //2 random input variable introduced for the first tusk as an example
        Scanner scannerForTaskEight = new Scanner(System.in);
        System.out.println("\nEnter number a: ");
        String firstVariableTaskEight = scannerForTaskEight.nextLine();
        System.out.println("\nEnter number b: ");
        String secondVariableTaskEight = scannerForTaskEight.nextLine();
        System.out.println("\nThis is a result of task 8: ");
        calculateFunctionForTheTaskEight(firstVariableTaskEight, secondVariableTaskEight);


    }
}
