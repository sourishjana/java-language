import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AvgMarks {
    Scanner sc=new Scanner(System.in);

    public void showAvg(){
        int n=sc.nextInt();
        sc.nextLine();
        int[] a=new int[n];
        String[] s= sc.nextLine().split(" ");
        for(int i =0 ;i < s.length;i++){
            a[i]= Integer.parseInt(s[i]);
        }
        /*for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }*/

        //double avg=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=a[i];
        }
        System.out.println("Avg of the total marks = "+(double)(sum/n));
    }

}
