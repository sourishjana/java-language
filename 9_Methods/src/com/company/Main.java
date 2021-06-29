package com.company;

public class Main {

    public static void main(String[] args) {

        calcScore(true, 400,5,78);

        calcScore(true , 500, 8, 90);

        int result = calcScoreReturn(true, 1000,2,75);
        System.out.println("the result is : "+result);

        displayPlayer("Sourish", calcScorePosition(1000));
        displayPlayer("Robin", calcScorePosition(400));

    }

    public static void calcScore(boolean gameOver, int score , int levelCompleted, int bonus){
        if(gameOver){
            int finalScore = score + (levelCompleted+ bonus);
            System.out.println("The final score is : "+ finalScore);
        }
    }
    public static int calcScoreReturn(boolean gameOver, int score , int levelCompleted, int bonus){
        if(gameOver){
            return score + (levelCompleted+ bonus);
        }
        return -1; // -1 signifies value not found or it indicates an error
    }

    public static void displayPlayer(String name, int position){
        System.out.println(name + " palyer has achived the postion : "+position);
    }

    public static int calcScorePosition(int score){
        // method 1:
        /*if(score>=1000){
            return 1;
        }else if (score>=500){
            return 2;
        }else if(score>=100){
            return 3;
        }
        return 4;*/


        // method 2:
        int position=4;
        if(score>=1000){
            position=1;
        }else if (score>=500){
            position= 2;
        }else if(score>=100){
            position= 3;
        }
        return position;
    }
}
