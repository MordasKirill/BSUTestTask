package com.software_development.lesson4.Text;

public class Word {

    private String word;

    Word(String word) {
        this.word = word;
    }

    @Override
    public String toString() {
        return word;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

}