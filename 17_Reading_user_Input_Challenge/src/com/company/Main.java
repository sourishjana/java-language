package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        for(int i=0;i<10;i++){
            System.out.println("Enter Number "+(i+1));
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt){
                int num = scanner.nextInt();
            }else{
                System.out.println("Invalid number");
            }
            scanner.nextLine();
        }
        scanner.close();
    }
}
