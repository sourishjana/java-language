package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("hello world");
        int x= 320 - (56+6);
        System.out.println(x);

        int minVal = Integer.MIN_VALUE;
        int maxVal = Integer.MAX_VALUE;
        System.out.println("Min val of int is : "+minVal);
        System.out.println("Max val of int is : "+maxVal);
        System.out.println("Busted max val : "+ (maxVal+1));
        System.out.println("Busted min val : "+ (minVal-1));

        byte minValByte= Byte.MIN_VALUE;
        byte maxValByte= Byte.MAX_VALUE;
        System.out.println("Min val of byte : "+minValByte);
        System.out.println("MAX val of byte : "+maxValByte);

        short minValShort= Short.MIN_VALUE;
        short maxValShort= Short.MAX_VALUE;
        System.out.println("Min val of Short : "+minValShort);
        System.out.println("MAX val of Short : "+maxValShort);

        long myLongVal=100L; // have to give a L at last
        System.out.println("Long value is : "+ myLongVal);

        long minValLong= Long.MIN_VALUE;
        long maxValLong= Long.MAX_VALUE;
        System.out.println("Min val of Long : "+minValLong);
        System.out.println("MAX val of Long : "+maxValLong);

        int newInt = (minVal/2);
        byte newByte = (byte)(minValByte/2); // only (minValByte/2) is considered as int
        short newShort = (short)(minValShort/2); // only (minValShort/2) is considered as int
        // so they are typecasted as their real datatypes



        // challenge -------------------------------------------------------------

        byte oneVal = 10;
        short twoVal = 20;
        int threeVal = 30;

        long longVal = 50000L + 10L * (oneVal + twoVal + threeVal);
        System.out.println("Total is : "+ longVal);

        short shortVal = (short)(50000 + 10 * (oneVal + twoVal + threeVal));
        System.out.println("Total is : "+ shortVal);
    }
}
