package com.software_development.lesson4;

public class Test2 {
    private int first;
    private int second;

    public static void main(String[] args) {

    }
    private Test2(int first, int second){
        this.first = first;
        this.second = second;
    }
    private Test2(){

    }
    private int getFirst(){
        return first;
    }
    private void setFirst(){
        this.first = first;
    }
    private int getSecond(){
        return second;
    }
    private void setSecond(){
        this.second = second;
    }
}
