//package com.software_development.lesson3;
//
//import java.awt.*;
//import java.util.Arrays;
//import java.util.Scanner;
//import java.util.regex.Pattern;
//
//public class TestClass {
//    public static void main(String[] args) {
//        String input = "Hello. Me. Who. No. Yet! Hello Java! Hello JavaScript! JavaSE 8." +
//                "\n"+
//                "Hello. Me. Who. No. Yet!"+
//                "\n"+
//                "Haai i am your new teaaacher. Taaahere. Wahy?";
//        Pattern patternSplitParagraphs = Pattern.compile("\n");
//        String[] paragraphsSpited = patternSplitParagraphs.split(input);
//        int[] counterSentences = new int[paragraphsSpited.length];
//        int maxLengthParagraph = 0;
//        for (int i = 0; i < paragraphsSpited.length; i++) {
//            String[] sentences = splitSentences(paragraphsSpited[i]);
//            counterSentences[i] = sentences.length;
//            if (maxLengthParagraph < sentences.length) {
//                maxLengthParagraph = sentences.length;
//            }
//        }
//        for (int i = 1; i <= maxLengthParagraph; i++) {
//            for (int j = 0; j < counterSentences.length; j++) {
//                if (i == counterSentences[j]) {
//                    System.out.println(paragraphsSpited[j]);
//                }
//            }
//        }
//        System.out.println();
//        System.out.println("Sort Words");
//        sortWords(input);
//        System.out.println("Sort Lexems");
//        sortLexemes(input);
//    }
//    private static String[] splitSentences(String text){
//        Pattern pattern = Pattern.compile("\\s*[|!|\\.]\\s*");
//        return pattern.split(text);
//    }
//
//    private static String[] splitWords(String text){
//        Pattern pattern = Pattern.compile("\\s*[\\s|!|,|\\.]\\s*");
//        return pattern.split(text);
//    }
//    private static void sortWords(String text) {
//        String[] paragraphs = text.split("\n");
//        for (String paragraph : paragraphs) {
//            String[] sentences = splitSentences(paragraph);
//            for (String sentence : sentences) {
//                String[] words = splitWords(sentence);
//
//                for (int k = words.length - 1; k >= 0; k--) {
//                    for (int m = 0; m < k; m++) {
//                        if (words[m].length() > words[m + 1].length()) {
//                            String tmp = words[m];
//                            words[m] = words[m + 1];
//                            words[m + 1] = tmp;
//                        }
//                    }
//                }
//
//                for (String word : words) {
//                    System.out.print(word + " ");
//                }
//                System.out.print("\b. ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//    }
//    private static void sortLexemes(String text) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter symbol for sorting leksem by descending: ");
//        String letter = scanner.nextLine();
//        String[] paragraphs = text.split("\n");
//        for (String paragraph : paragraphs) {
//            String[] sentences = splitSentences(paragraph);
//            for (String sentence : sentences) {
//                String[] words = splitWords(sentence);
//
//                for (int k = words.length - 1; k >= 0; k--) {
//                    for (int m = 0; m < k; m++) {
//                        int countRight = 0;
//                        int countLeft = 0;
//                        for (int n = 0; n < words[m].length(); n++) {
//                            if (String.valueOf(words[m].charAt(n)).compareToIgnoreCase(letter) == 0) {
//                                countLeft++;
//                            }
//                        }
//                        for (int n = 0; n < words[m + 1].length(); n++) {
//                            if (String.valueOf(words[m + 1].charAt(n)).compareToIgnoreCase(letter) == 0) {
//                                countRight++;
//                            }
//                        }
//                        if (countLeft < countRight) {
//                            String tmp = words[m];
//                            words[m] = words[m + 1];
//                            words[m + 1] = tmp;
//                        } else if (countLeft == countRight) {
//                            String[] forCompare = {words[m], words[m + 1]};
//                            Arrays.sort(forCompare);
//                            words[m] = forCompare[0];
//                            words[m + 1] = forCompare[1];
//                        }
//                    }
//                }
//                for (String word : words) {
//                    System.out.print(word + " ");
//                }
//                System.out.print("\b. ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//    }
//
//}
