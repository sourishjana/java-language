package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(checkNumber(-8));
    }
    public static String checkNumber(int number){
        if(number>0){
            return "Positive";
        }else if(number<0){
            return "Negative";
        }
        return "Zero";
    }
}
