package com.company;

public class Main {

    public static void main(String[] args) {
	    String numberAsString="2019";
        System.out.println("Number as string = "+numberAsString);

        int number = Integer.parseInt(numberAsString);
        System.out.println("Number = "+number);

        numberAsString+=1;
        number+=1;
        System.out.println("After adding 1");
        System.out.println("Number as string = "+numberAsString);
        System.out.println("Number = "+number);


        System.out.println("-------------------------------------------");

        String doubleAsString="2019.789";
        System.out.println("Double as string = "+doubleAsString);

        double doubleNumber = Double.parseDouble(doubleAsString);
        System.out.println("Double = "+doubleNumber);

        doubleAsString+=1;
        doubleNumber+=1;
        System.out.println("After adding 1");
        System.out.println("Double as string = "+doubleAsString);
        System.out.println("Double = "+doubleNumber);
    }
}
