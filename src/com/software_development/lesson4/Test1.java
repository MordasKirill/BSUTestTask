package com.software_development.lesson4;

public class Test1 {

    private static int a = 1;
    private static int b = 2;

    public static void main(String[] args) {
        show(a, b);
        System.out.print("Change numbers: ");
        changeNumber(a, b);

        System.out.println("sum of numbers " + sumNumber(a,b));
        System.out.println("bigest number " + whatIsMore(a,b));
    }

    private static void show(int a, int b) {
        System.out.println(a +" "+ b);
    }

    private static void changeNumber(int a, int b) {
        a = 5;
        b = 7;
        System.out.println(a + " " + b);
    }

    private static int sumNumber(int a, int b) {
        return a+b;
    }

    private static int whatIsMore(int a, int b) {
        return Math.max(a, b);
    }
}