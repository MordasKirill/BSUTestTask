package com.software_development.lesson3;

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternAndMatcher {
    public static void main(String[] args) {
        //Task 1
        //Make text operations
        String input = "There are different kinds of animals on our planet, " +
                "and all of them are very important for it. For example, " +
                "everybody knows that the sharks are dangerous for people, " +
                "but they are useful for cleaning seawater. " +
                "There are two types of animals: domestic (or pets) and wild. " +
                "People keep pets in their homes." +
                "\n"+
                "Giraffes are very beautiful and unusual animals. " +
                "They are the tallest land animals in the world. " +
                "Giraffes can reach a height of 5,5 m and a weight of 900 kg. " +
                "They are famous for their long necks. But does anybody know, " +
                "that giraffes have a very long tongue?"+
                "\n"+
                "Haai it's your new  teaaacher. Taaahere. Wahy?";
        System.out.println("Sort Paragraphs: ");
        splitParagraphs(input);
        System.out.println();
        System.out.println("Sort Words: ");
        sortWords(input);
        System.out.println("Sort Lexems: ");
        sortLexemes(input);

        //Task 2
        //Xml parser
        String xml = "<notes>\n" +
                "    <note id = \"1\">\n" +
                "        <to>Вася</to>\n" +
                "        <from>Света</from>\n" +
                "        <heading>Напоминание</heading>\n" +
                "        <body>Позвони мне завтра!</body>\n" +
                "    </note>\n" +
                "    <note id = \"2\">\n" +
                "        <to>Петя</to>\n" +
                "        <from>Маша</from>\n" +
                "        <heading>Важное напоминание</heading>\n" +
                "        <body/>\n" +
                "    </note>\n" +
                " </notes> \n";
        String xmlAnalysis = xmlAnalyzer(xml);
        System.out.println(xmlAnalysis);
    }
    private static void splitParagraphs(String input){
        Pattern patternSplitParagraphs = Pattern.compile("\n");
        String[] paragraphsSpited = patternSplitParagraphs.split(input);
        int[] counterSentences = new int[paragraphsSpited.length];
        int maxLengthParagraph = 0;
        for (int i = 0; i < paragraphsSpited.length; i++) {
            String[] sentences = splitSentences(paragraphsSpited[i]);
            counterSentences[i] = sentences.length;
            if (maxLengthParagraph < sentences.length) {
                maxLengthParagraph = sentences.length;
            }
        }
        for (int i = 1; i <= maxLengthParagraph; i++) {
            for (int j = 0; j < counterSentences.length; j++) {
                if (i == counterSentences[j]) {
                    System.out.println(paragraphsSpited[j]);
                }
            }
        }
    }
    private static String[] splitSentences(String text){
        Pattern pattern = Pattern.compile("\\s*[|!|\\.]\\s*");
        return pattern.split(text);
    }

    private static String[] splitWords(String text){
        Pattern pattern = Pattern.compile("\\s*[\\s|!|,|\\.]\\s*");
        return pattern.split(text);
    }
    private static void sortWords(String text) {
        String[] paragraphs = text.split("\n");
        for (String paragraph : paragraphs) {
            String[] sentences = splitSentences(paragraph);
            for (String sentence : sentences) {
                String[] words = splitWords(sentence);

                for (int k = words.length - 1; k >= 0; k--) {
                    for (int m = 0; m < k; m++) {
                        if (words[m].length() > words[m + 1].length()) {
                            String tmp = words[m];
                            words[m] = words[m + 1];
                            words[m + 1] = tmp;
                        }
                    }
                }

                for (String word : words) {
                    System.out.print(word + " ");
                }
                System.out.print("\b. ");
            }
            System.out.println();
        }
        System.out.println();
    }
    private static void sortLexemes(String text) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter symbol for sorting leksem by descending: ");
        String letter = scanner.nextLine();
        String[] paragraphs = text.split("\n");
        for (String paragraph : paragraphs) {
            String[] sentences = splitSentences(paragraph);
            for (String sentence : sentences) {
                String[] words = splitWords(sentence);

                for (int k = words.length - 1; k >= 0; k--) {
                    for (int m = 0; m < k; m++) {
                        int countRight = 0;
                        int countLeft = 0;
                        for (int n = 0; n < words[m].length(); n++) {
                            if (String.valueOf(words[m].charAt(n)).compareToIgnoreCase(letter) == 0) {
                                countLeft++;
                            }
                        }
                        for (int n = 0; n < words[m + 1].length(); n++) {
                            if (String.valueOf(words[m + 1].charAt(n)).compareToIgnoreCase(letter) == 0) {
                                countRight++;
                            }
                        }
                        if (countLeft < countRight) {
                            String tmp = words[m];
                            words[m] = words[m + 1];
                            words[m + 1] = tmp;
                        } else if (countLeft == countRight) {
                            String[] forCompare = {words[m], words[m + 1]};
                            Arrays.sort(forCompare);
                            words[m] = forCompare[0];
                            words[m + 1] = forCompare[1];
                        }
                    }
                }
                for (String word : words) {
                    System.out.print(word + " ");
                }
                System.out.print("\b. ");
            }
            System.out.println();
        }
        System.out.println();
    }
    private static String xmlAnalyzer(String xml) {
        StringBuilder strBuilder = new StringBuilder();
        Pattern patternOpen = Pattern.compile("<\\w.+?>");
        Pattern patternClose = Pattern.compile("</\\w+>");
        Pattern patternBody = Pattern.compile(">.+?<");
        Pattern patternEmpty = Pattern.compile("<\\w.+?/>");
        String [] lines = xml.split("\n\\s*");
        for (String line : lines) {
            Matcher matcherOpen = patternOpen.matcher(line);
            Matcher matcherClose = patternClose.matcher(line);
            Matcher matcherBody = patternBody.matcher(line);
            Matcher matcherEmpty = patternEmpty.matcher(line);
            if (matcherEmpty.find()) {
                strBuilder.append(matcherEmpty.group());
                strBuilder.append("\n");
            }
            else if (matcherOpen.find()) {
                strBuilder.append(matcherOpen.group());
                strBuilder.append("\n");
            }
            if (matcherBody.find()) {
                strBuilder.append(matcherBody.group().substring(1));
                strBuilder.append("\n");
            }
            if (matcherClose.find()) {
                strBuilder.append(matcherClose.group());
                strBuilder.append("\n");
            }
        }
        return strBuilder.toString();
    }
}