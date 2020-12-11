package com.software_development.lesson4.Text;

public class Runner {

    public static void main(String[] args) {
        Word heading = new Word("Head of text.");
        String line1 = "Every day in elementary school in America begins at 9.20 a.m. " +
                "Children have classes till 3.15 p.m. At 12 o’clock children have lunch. " +
                "Many boys and girls bring their lunch from home. But some of them go for lunch to a school cafeteria. .\n";
        Sentence sentence = new Sentence(line1);
        Text poem = new Text(heading, sentence);
        String line2 = "Mrs. Bradley prepares school lunches almost every weekday for her two children. " +
                "Sometimes she gives the children money and they eat in the school cafeteria. " +
                "But usually the children prefer to take a lunch from home.\n";
        String line3 = "This morning Mrs. Bradley is making peanut butter and cheese sandwiches, " +
                "the children's favorite. She puts two bottles of apple juice for the children to drink. " +
                "She is going to put the sandwiches, some cherry tomatoes and two bananas in their lunchboxes. " +
                "The lunchbox is easy for the children to carry to school.\n";

        poem.addSentence(new Sentence(line2));
        poem.addSentence(new Sentence(line3));
        poem.printHeading();
        poem.printText();
    }
}
