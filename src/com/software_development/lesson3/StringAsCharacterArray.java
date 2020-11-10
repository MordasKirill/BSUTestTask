package com.software_development.lesson3;

import java.util.Scanner;

public class StringAsCharacterArray {
    public static void main(String[] args) {
        //Task 1
        //Convert camelCase to snake_case
        System.out.println("Task 1");
        String[] camelCaseArray = {"cameCase", "thatWasAwesome", "itIsTheFinalCountDown", "getPermit"};
        String [] snakeCase = convertingToSnakeCaseTask1(camelCaseArray);
        System.out.println(String.join(", ", camelCaseArray));
        System.out.println(String.join(", ", snakeCase));

        //Task 2
        //Change "word" to "letter"
        System.out.println("Task 2");
        String stringTask2 = "word word hello world force it word. ";
        System.out.println(stringTask2.replace("word", "letter"));
        String word = "System outlined word and word is a perfected and amazing word 's";
        String letter = wordChangerTask2(word);
        System.out.println(word);
        System.out.println(letter);

        //Task 3
        //Find amount of digits
        System.out.println("Task 3");
        Scanner scannerForTask3 = new Scanner(System.in);
        System.out.println("Enter string: ");
        String line = scannerForTask3.nextLine();
        findDigitsTask3(line);

        //Task 4
        //Find amount of numbers
        System.out.println("Task 4");
        Scanner scannerForTask4 = new Scanner(System.in);
        System.out.println("Enter string: ");
        String strings = scannerForTask4.nextLine();
        System.out.println("Amount of numbers is: "+findNumbersTask4(strings));

        //Task 5
        //Remove extra spaces
        System.out.println("Task 5");
        Scanner scannerForTask5 = new Scanner(System.in);
        System.out.println("Enter string: ");
        String stringTask5 = scannerForTask5.nextLine();
        System.out.println(replaceSpaceTask5(stringTask5));
    }

    private static String [] convertingToSnakeCaseTask1(String[] array){
        String[] snakeCase = new String[array.length];
        for (int i = 0; i < snakeCase.length; i++) {
            StringBuilder strBuilder = new StringBuilder();
            for (int j = 0; j < array[i].length(); j++) {
                char letter = array[i].toCharArray()[j];
                if (Character.isLowerCase(letter)){
                    strBuilder.append(letter);
                } else {
                    strBuilder.append("_");
                    strBuilder.append(Character.toLowerCase(letter));
                }
            }
            snakeCase[i] = strBuilder.toString();
        }
        return snakeCase;
    }
    private static String wordChangerTask2(String word){
        return word.replace("word", "letter");
    }
    private static void findDigitsTask3(String strings){
        int counter = 0;
        for (int i = 0; i < strings.length(); i++) {
                if (Character.isDigit(strings.charAt(i))) {
                    counter++;
                }
        }
        System.out.println("The quantity of digits is: " + counter);
    }
    private static int findNumbersTask4(String strings){
        int counter = 0;
        for (int i = 0; i < strings.length(); i++) {
                if (i == strings.length() - 1 || !isDigitTask4(strings.charAt(i + 1))) {
                    counter++;
                }
        }
        return counter;
    }

    private static boolean isDigitTask4(char chars){
        boolean isDigit = false;
        char [] digits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        for (int i = 0; i < digits.length; i++) {
            if (chars == digits[i]) {
                isDigit = true;
                break;
            }
        }
        return isDigit;
    }
    private static String replaceSpaceTask5(String string){
        String str = string.trim();
        StringBuilder stringBuilder = new StringBuilder(str);
        for (int i = 0; i < stringBuilder.length(); i++) {
            if (stringBuilder.charAt(i) == ' '){
                if (stringBuilder.charAt(i+1) == ' '){
                    stringBuilder.deleteCharAt(i);
                    i--;
                }
            }
        }
        return stringBuilder.toString();
    }
}