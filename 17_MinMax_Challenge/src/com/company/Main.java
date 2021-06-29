package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of numbers u want : ");
        int numberCount = 0;
        boolean hasNextInt =scanner.hasNextInt();
        if(hasNextInt){
            numberCount= scanner.nextInt();
            scanner.nextLine();
            int maxNum= Integer.MIN_VALUE;
            int minNum= Integer.MAX_VALUE;
            for(int i=0;i<numberCount;i++){
                System.out.println("Enter number #"+(i+1));
                hasNextInt =scanner.hasNextInt();
                if(hasNextInt){
                    int number= scanner.nextInt();
                    if(number>maxNum){
                        maxNum=number;
                    }
                    if (number<minNum){
                        minNum=number;
                    }
                }else{
                    System.out.println("Invalid number");
                }
                scanner.nextLine();
            }
            System.out.println("Max number = "+maxNum+" , Min number is = "+minNum);
        }else{
            System.out.println("Invalid number");
        }
        scanner.close();
    }
}
