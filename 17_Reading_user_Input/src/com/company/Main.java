package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter your date of birth : ");

        boolean hasNextInt = scanner.hasNextInt(); // checks that the next input is int or not

        if(hasNextInt){
            int yearOfBirth=scanner.nextInt();
            scanner.nextLine(); // to handle the enter problem (i.e next line character)

            System.out.println("Enter your name : ");
            String name=scanner.nextLine();
            int age = 2020-yearOfBirth;

            if(age>=0 && age<=120){
                System.out.println("Your name is : "+name+" and dob is : "+age);
            }else{
                System.out.println("Invlid value of dob");
            }
        }else{
            System.out.println("Cant parse dob");
        }

        scanner.close();
    }
}
