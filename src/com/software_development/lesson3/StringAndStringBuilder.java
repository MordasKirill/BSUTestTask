package com.software_development.lesson3;

import java.util.Scanner;

public class StringAndStringBuilder {

    public static void main(String[] args) {

        //Task 1
        //Find out max amount of spaces
        System.out.println("Task 1");
        Scanner scannerForTask1 = new Scanner(System.in);
        System.out.println("Enter string: ");
        String stringTask1 = scannerForTask1.nextLine();
        System.out.println(amountOfSpacesTask1(stringTask1));

        //Task 2
        //Input 'b' after 'a'
        System.out.println("Task 2");
        Scanner scannerForTask2 = new Scanner(System.in);
        System.out.println("Enter string: ");
        String stringTask2 = scannerForTask2.nextLine();
        System.out.println("Result: " + putBAfterATask2(stringTask2));

        //Task 3
        //Is word palindrome?
        System.out.println("Task 3");
        Scanner scannerForTask3 = new Scanner(System.in);
        System.out.println("Enter string: ");
        String stringTask3 = scannerForTask3.nextLine();
        System.out.println("Is word palindrome: " + isPalindromeTask3(stringTask3));

        //Task 4
        //Concatenate 'informatics' to 'cake'
        System.out.println("Task 4");
        String stringTask4 = "информатика";
        System.out.println(concatenationTask4(stringTask4));

        //Task 5
        //Count letter 'a'
        System.out.println("Task 5");
        Scanner scannerForTask5 = new Scanner(System.in);
        System.out.println("Enter string: ");
        String stringTask5 = scannerForTask5.nextLine();
        System.out.println("There are " + counterTask5(stringTask5, 'a') + " letters 'a' ");

        //Task 6
        //Make a new string with doubling letters
        System.out.println("Task 6");
        Scanner scannerForTask6 = new Scanner(System.in);
        System.out.println("Enter string: ");
        String stringTask6 = scannerForTask6.nextLine();
        System.out.println(editingTask6(stringTask6));

        //Task 7
        //Delete spaces and repeating letters
        System.out.println("Task 7");
        Scanner scannerForTask7 = new Scanner(System.in);
        System.out.println("Enter string: ");
        String stringTask7 = scannerForTask7.nextLine();
        System.out.println(deleteSpaceAndRepeatingElements(stringTask7));

        //Task 8
        //Find out the biggest word
        System.out.println("Task 8");
        Scanner scannerForTask8 = new Scanner(System.in);
        System.out.println("Enter string: ");
        String stringTask8 = scannerForTask8.nextLine();
        System.out.println(findBiggestWord(stringTask8));

        //Task 9
        //Count amount of lowercase and uppercase letters
        System.out.println("Task 9");
        Scanner scannerForTask9 = new Scanner(System.in);
        System.out.println("Enter string: ");
        String stringTask9 = scannerForTask9.nextLine();
        System.out.println(" Lowercase letters " + findLowercaseTask9(stringTask9));
        System.out.println(" Uppercase letters " + findUppercaseTask9(stringTask9));

        //Task 10
        //Find out amount of sentences
        System.out.println("Task 10");
        Scanner scannerForTask10 = new Scanner(System.in);
        System.out.println("Enter string: ");
        String stringTask10 = scannerForTask10.nextLine();
        System.out.println("Amount of sentences is: " + amountOfSentencesTask10(stringTask10));

    }

    private static int amountOfSpacesTask1(String strings) {
        int counter = 0;
        int maxCount = 0;

        for (int i = 0; i < strings.length(); i++) {
            if (strings.charAt(i) == ' ') {
                counter++;
            } else {
                if (maxCount < counter) {
                    maxCount = counter;
                }
                counter = 0;
            }
        }
        return maxCount;
    }

    private static String putBAfterATask2(String text) {
        return text.replaceAll("a", "a" + "b");
    }

    private static boolean isPalindromeTask3(String strings) {
        int n = strings.length();
        for (int i = 0; i < (n / 2); i++) {
            if (strings.charAt(i) != strings.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    private static String concatenationTask4(String word) {
        String cake = String.valueOf(word.charAt(word.indexOf('т')));
        cake += String.valueOf(word.charAt(word.indexOf('о')));
        cake += String.valueOf(word.charAt(word.indexOf('р')));
        cake += String.valueOf(word.charAt(word.indexOf('т')));
        return cake;
    }

    private static int counterTask5(String string, char character) {
        int counter = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == character) {
                counter++;
            }
        }
        return counter;
    }

    private static String editingTask6(String text) {
        StringBuilder stringBuilder = new StringBuilder();
        if (text != null) {
            char posSymbol;
            for (int i = 0; i < text.length(); i++) {
                posSymbol = text.charAt(i);
                stringBuilder.append(posSymbol).append(posSymbol);
            }
        }
        return stringBuilder.toString();
    }

    private static String deleteSpaceAndRepeatingElements(String text) {
        StringBuilder stringBuilder = new StringBuilder(text);
        for (int i = 0; i < stringBuilder.length(); i++) {
            char character = stringBuilder.charAt(i);
            if (character == ' ') {
                stringBuilder.deleteCharAt(i);
                i--;
                continue;
            }
            for (int j = i + 1; j < stringBuilder.length(); j++) {
                if (stringBuilder.charAt(j) == character) {
                    stringBuilder.deleteCharAt(j);
                }
            }
        }
        return stringBuilder.toString();
    }

    private static String findBiggestWord(String string) {
        String biggestWord = "";
        int maxLength = 0;
        String[] words = string.split(" ");
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > maxLength) {
                maxLength = words[i].length();
                biggestWord = words[i];
            }
        }
        return biggestWord;
    }

    private static int findLowercaseTask9(String strings) {
        StringBuilder stringBuilder = new StringBuilder(strings);
        int counter = 0;
        for (int i = 0; i < stringBuilder.length(); i++) {
            if (stringBuilder.charAt(i) >= 'a' && stringBuilder.charAt(i) <= 'z') {
                counter++;
            }
        }
        return counter;
    }

    private static int findUppercaseTask9(String strings) {
        StringBuilder stringBuilder = new StringBuilder(strings);
        int counter = 0;
        for (int i = 0; i < stringBuilder.length(); i++) {
            if (stringBuilder.charAt(i) >= 'A' && stringBuilder.charAt(i) <= 'Z') {
                counter++;
            }
        }
        return counter;
    }

    private static int amountOfSentencesTask10(String strings) {
        StringBuilder stringBuilder = new StringBuilder(strings);
        int counter = 0;
        for (int i = 0; i < stringBuilder.length(); i++) {
            char character = stringBuilder.charAt(i);
            if (character == '.' || character == '!' || character == '?') {
                counter++;
            }
        }
        return counter;
    }
}
