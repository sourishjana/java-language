package com.company;

public class Main {

    public static void main(String[] args) {
        int switchValue = 2;

        switch (switchValue){
            case 1:
                System.out.println("The value is 1");
                break;
            case 2:
                System.out.println("The value is 2");
                break;
            case 3: case 4: case 5:
                System.out.println("The value is 3 or 4 or 5");
                break;
            default:
                System.out.println("this is none of the above");
                break;
        }

        System.out.println("A switch statement without any break statement");
        switch (switchValue){
            case 1:
                System.out.println("The value is 1");
            case 2:
                System.out.println("The value is 2");
            case 3: case 4: case 5:
                System.out.println("The value is 3 or 4 or 5");
            default:
                System.out.println("this is none of the above");
        }


        String month="FebruarY";
        switch (month.toLowerCase()){
            case "january":
                System.out.println("the month is jan");
                break;
            case "february":
                System.out.println("the month is feb");
                break;
            default:
                System.out.println("none of the above");
                break;
        }
    }
}
