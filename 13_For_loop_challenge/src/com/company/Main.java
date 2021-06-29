package com.company;

import javax.swing.plaf.IconUIResource;

public class Main {

    public static void main(String[] args) {
        int count=0;
        int sum=0;
        for(int i=1;i<=1000;i++){
            if(i%3==0 && i%5==0){
                System.out.println("number = "+i);
                count++;
                sum+=i;
            }
            if(count==5){
                break;
            }
        }
        System.out.println("The sum of all the numbers = "+sum);
    }
}
