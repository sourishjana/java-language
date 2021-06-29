package com.company;

public class Main {

    public static void main(String[] args) {

        // while loop :
	    int count=0;
	    while(count!=6){
            System.out.println("number = "+count);
            count++;
        }

	    // Forever while loop :
	    count = 1;
	    while(true){
	        if(count==6){
	            break;
            }
            System.out.println("count = "+count);
	        count++;
        }

	    // Do while loop :
	    count = 1;
	    do{
	        count++;
            System.out.println("do count = "+count);
        }while (count<7);


	    // challenges:
        int startNum=2;
        int endNum=20;
        while(startNum<=endNum){
            if(isEven(startNum)){
                System.out.println("even1 = "+startNum);
            }
            startNum++;
        }

        startNum=2;
        endNum=20;
        while(startNum<=endNum){
            startNum++;
            if(!isEven(startNum)){
                continue;
            }
            System.out.println("even2 = "+startNum);
        }

        int counter=0;
        startNum = 2;
        endNum = 20;
        while(startNum<=endNum){
            if(isEven(startNum)){
                System.out.println("even3 = "+startNum);
                counter++;
            }
            if(counter>=5){
                break;
            }
            startNum++;
        }
        System.out.println("Total no of even numbers = "+counter);


    }

    public static boolean isEven(int num){
        if(num%2==0){
            return true;
        }
        return false;
    }
}
