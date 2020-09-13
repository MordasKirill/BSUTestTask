package cycles;

import java.util.Scanner;

public class Cycles {
    private static int calculateFunctionForTheFirstTask(int variable){
        int result = 0;
        for (int i = 1; i <= variable; i++) {
            result += i;
        }
        return result;
    }
    private static String calculateFunctionForTheSecondTask(int A, int B, double h, int x){
        //Я не уверен, что уловил суть задания, но вроде так
        int  y;
        for (double i = A; i <= B; i = i + h) {
            if (x > 2) {
                y = x;
            } else
                y = -x;
            System.out.println("x = "+ x + "\n" + "y = " + y);
        }
        return " from " + A + " to " + B;
    }
    private static int calculateFunctionForTheThirdTask(){
        int result = 0;
        for (int i = 1; i <= 100; i++) {
            result += Math.pow(i, 2);
        }
        return result;
    }
    private static double calculateFunctionForTheTaskFour(){
        double sum = 1 ;
        for (int i = 1; i <= 20; i++) {
            sum += sum*(Math.pow(i, 2));
        }
        return sum;
    }
    public static void main(String[] args) {
        //Task #1, sum from 1 to n task
        //1 random input variable introduced for the first tusk as an example
        int variableTask1 = (int) (Math.random() * 10);
        int resultTask1 = calculateFunctionForTheFirstTask(variableTask1);
        System.out.println("This is a result of task 1: " + resultTask1);

        //Task #2, sum from 1 to n task
        //1 random input variable introduced for the first tusk as an example
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter start line A");
        int a = scanner.nextInt();
        System.out.println("Enter finish line B");
        int b = scanner.nextInt();
        System.out.println("Enter step h");
        double h = scanner.nextDouble();
        System.out.println("Enter the value of x");
        int x = scanner.nextInt();
        String resultTask2 = calculateFunctionForTheSecondTask(a, b, h, x);
        System.out.println("This is a result of task 2: " + resultTask2);
        //Task #3, 1^2 + 2^2 + ... + n^2 task
        //1 random input variable introduced for the first tusk as an example
        int resultTask3 = calculateFunctionForTheThirdTask();
        System.out.println("This is a result of task 3: " + resultTask3);

        //Task #4, 1^2 + 2^2 + ... + n^2 task
        //1 random input variable introduced for the first tusk as an example
        double resultTask4 = calculateFunctionForTheTaskFour();
        System.out.println("This is a result of task 4: " + resultTask4);



    }
}
