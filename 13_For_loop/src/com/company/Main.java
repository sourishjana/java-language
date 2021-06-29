package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(calcInterest(10000.0,3));

        for(int i=2 ; i<10 ; i++){
            System.out.println("Interest rate "+i
                    +"%. The amount is : "+
                    String.format("%.3f",calcInterest(10000,i))
                    );
        }

        System.out.println("Reverse for loop : ");
        for(int i=10 ; i>=2 ; i--){
            System.out.println("Interest rate "+i
                    +"%. The amount is : "+
                    String.format("%.3f",calcInterest(10000,i))
                    );
        }


        // challenge part ------------------ printing the first 3 prime numbers
        System.out.println(isPrime(4));

        int count=0;
        for(int i=1;true;i++){
            if(isPrime(i)){
                System.out.println("Prime nos : "+i);
                count++;
            }
            if(count==3){
                break;
            }
        }

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

    }

    public static double calcInterest(double amount, double rate){
        return amount*(rate/100);
    }

    /*
    The reason is that the smallest and greater than one factor of a number cannot be
    more than the sqrt of N. And we stop as soon as we find a factor. For example, if N is 49,
    the smallest factor is 7. For 15, smallest factor is 3.
    */
    public static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2;i<=(long)Math.sqrt(num) ; i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
