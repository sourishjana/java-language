public class DigitSum {
    public static int noOfDigits(int num){
        if(num<1){
            return -1;
        }else if (num<10){
            return 1;
        }
        int r,count=0,sum=0;
        while(num>0){
            r=num%10;
            sum+=r;
            System.out.println("digits = "+r);
            count++;
            num=num/10;
        }
        System.out.println("The sum of all digits = "+sum);
        return count;
    }
}
