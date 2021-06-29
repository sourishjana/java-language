package com.company;

public class Main {

    public static void main(String[] args) {

        float minFloatVal = Float.MIN_VALUE;
        float maxFloatVal = Float.MAX_VALUE;
        System.out.println("Min float val is : "+ minFloatVal);
        System.out.println("Max float val is : "+ maxFloatVal);

        double minDoubleVal = Double.MIN_VALUE;
        double maxDoubleVal = Double.MAX_VALUE;
        System.out.println("Min Double val is : "+ minDoubleVal);
        System.out.println("Max Double val is : "+ maxDoubleVal);


        int myIntVal =5;

        // By default every decimal number is considered as double so we need to write 5.25f
        float myFloatVal = 5.25f;
        float myFloatVal1 = (float)5.25;

        double myDoubleVal = 5.65d;

        int myIntVal2 =5 / 3;
        float myFloatVal2 = 5f / 3f;
        double myDoubleVal2 = 5.0 / 3; // by default double
        System.out.println("Integer val = "+ myIntVal2);
        System.out.println("Float val = "+ myFloatVal2);
        System.out.println("Double val = "+ myDoubleVal2);

        // In case of Java the double is considered as default val instead of float
        // And in JAVA there are many libraries that uses double as default and process them faster
        // so JAVA can work faster with double values than that of float values

        double pi = 3.1415927d;
        double anotherNum = 3_000_000.4_567_890d; // another format of representing numbers
        System.out.println(pi);
        System.out.println(anotherNum);



        // challenge :
        double pounds=67d;
        double result = pounds * 0.45359237;

        System.out.println("the Weight in kilograms = "+result);


    }
}
