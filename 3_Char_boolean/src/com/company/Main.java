package com.company;

public class Main {

    public static void main(String[] args) {

        // char is of 2 byte -> 8 bits

        char myCharVal = 'D';
        int myCharIntVal = (int)'D';
        System.out.println("Char val is = "+myCharVal+ " And my int char val is = "+ myCharIntVal);

        // Unicode -> International encoding standard for different kind of symbols
        // every letter, digit or symbol is assigned a unique neumeric value that applies accress
        // different platforms

        char myUnicodeChar = '\u0044';
        System.out.println("Unicode char is = "+myUnicodeChar);

        char myCopyrightVal = '\u00A9';
        System.out.println("Unicode char is = "+ myCopyrightVal);

        boolean mytrueVal = true;
        boolean myFalseVal = false;
        System.out.println(mytrueVal + " " + myFalseVal);
    }
}
