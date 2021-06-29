package com.company;

public class Main {

    public static void main(String[] args) {
        int newScore=calculateScore("Tim",900);
        System.out.println("The new score is : "+newScore);

        calculateScore(800);

        calculateScore();
    }

    // Method overloading:
    // Must for method overloading : no of parameters must be different

    public static int calculateScore(String playerName, int score){
        System.out.println("Player "+playerName+" scored "+score+" points.");
        return score*1000;
    }
    public static int calculateScore(int score){
        System.out.println("Player anonymous scored "+score+" points.");
        return score*1000;
    }
    public static int calculateScore(){
        System.out.println("Player anonymous scored 0 points.");
        return 0;
    }

    // changing the return type doesn't change the signature of method
    // in this case method overloading doesn't work
    /*public static void calculateScore(){
        System.out.println("Player anonymous scored 0 points.");
    }*/

}
