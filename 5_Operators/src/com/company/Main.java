package com.company;

import java.io.OutputStream;

public class Main {
    public static void main(String[] args) {

        int result = 1+2 ;
        System.out.println("1+2 = "+result);
        int prevRes = result;
        System.out.println("Prev res = "+ prevRes);

        result = result - 1;
        System.out.println("3-1 = "+result);
        System.out.println("Prev res = "+ prevRes);

        result = result*10;
        System.out.println("2*10 = "+result);

        result = result/5;
        System.out.println("20/5 = "+result);

        result = result % 3;
        System.out.println("4%3 = "+ result);

        result++;
        System.out.println("1++ = "+ result);

        result--;
        System.out.println("1-- = "+ result);

        result += 2;
        System.out.println("1+=2 = "+result);

        result *= 10;
        System.out.println("3*=10 = "+ result);

        result /= 3;
        System.out.println("30/=3 = "+result);

        result -= 2;
        System.out.println("10-=2 = "+result);

        boolean isAlean = false;
        if(isAlean==false){
            System.out.println("Is not an alien !");
            System.out.println("I am sacred of alien !");
        }

        int topScore =100;
        if(topScore != 100){
            System.out.println("You got the highest score !");
        }

        if(topScore > 100){
            System.out.println("You got the highest score !");
        }if(topScore >= 100){
            System.out.println("You got the highest score !");
        }

        int secondTopScore = 60;
        if((topScore>secondTopScore) && (secondTopScore<100)){
            System.out.println("top score > than second top score and second top score < 100");
        }
        if((topScore<100) || (secondTopScore<=80)){
            System.out.println("Either of the both conditions are true");
        }

        boolean isCar = false;
        if(!isCar){
            System.out.println("This is a car");
        }

        // assignment and equality operator:
        boolean isBike = false;
        if(isBike = true){
            System.out.println("This is not true");
        } // here bike is assigned to true
        if(isBike == true){
            System.out.println("This is not true");
        }
        if(isBike){
            System.out.println("This is not true");
        }


        // Ternary operator
        boolean wasCar = isCar ? true : false;
        if(wasCar){
            System.out.println("wasCar is true");
        }else{
            System.out.println("wasCar is false");
        }


        // Challenge :
        double a=20.00;
        double b=80.00;
        double c = a+b*100.00;
        int remainder = (int)(c%40.00);

        boolean remainderZero = remainder==0 ? true : false;
        System.out.println(remainderZero);

        if(remainderZero){
            System.out.println("got some remainder");
        }

    }
}
