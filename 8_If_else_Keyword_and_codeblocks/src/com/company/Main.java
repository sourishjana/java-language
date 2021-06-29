package com.company;

public class Main {

    public static void main(String[] args) {

        int score = 3000;

        if(score<5000 && score>=1000){
            System.out.println("This is between 1000 and 5000");
        } else if(score <1000){
            System.out.println("This is below 1000");
        }else{
            System.out.println("This is different");
        }

        // If there is only one line after if statement:
        if(score<5000 && score>=1000)
            System.out.println("This is between 1000 and 5000");
        else if(score <1000)
            System.out.println("This is below 1000");
        else
            System.out.println("This is different");


        boolean gameOver = true;
        int bonus = 100;
        int levelCompleted=5;

        if(gameOver){
            score = score + (bonus*levelCompleted);
            System.out.println("The score is : "+ score);
        }

    }
}
