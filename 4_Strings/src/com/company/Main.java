package com.company;

public class Main {

    public static void main(String[] args) {
	    // A string can hold a lot of characters
        // Technically it is limited by memory or the max value of an int which is 2.14 billion

        String myString = "This is my string.";
        System.out.println("My string is = "+ myString);

        myString = myString + " And this is more.";
        System.out.println("My string is = "+ myString);

        myString = myString + "\u00A9 2020.";
        System.out.println("My string is = "+ myString);

        String numberStr = "345.87";
        numberStr = numberStr + "89.98";
        System.out.println(numberStr);

        String lastStr = "10";
        int myInt = 20;
        lastStr = lastStr + myInt;
        System.out.println("Mylast str is = "+lastStr);

        double doubleNum = 123.47d;
        lastStr = lastStr + doubleNum;
        System.out.println("Mylast str is = "+ lastStr);
    }
}
