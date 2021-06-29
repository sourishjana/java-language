import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num= scanner.nextInt();
        int copyOfNum=num;
        int sum=0;

        while(num!=0){
            int remainder=num%10;
            sum+=remainder;
            num=num/10;
        }
        System.out.println(sum);


        // shortcut for the no of digits in a number :

        int numberOfDigits= (int)Math.log10(copyOfNum)+1;
        System.out.println("No of digits in "+copyOfNum+" is = "+numberOfDigits);

        // palindrome number :

        Palindrome p=new Palindrome();
        p.checkPalindrome(copyOfNum);



        // do while loop ----------------------------------------------
        int k;
        do{
            k=scanner.nextInt();
            System.out.println("Number is : "+k);
        }while (k!=0);


    }
}
