import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int[] marks = new int[6];

        for(int i=0;i<6;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();

        // defining 2 arrays together
        int[] arr1,arr2;

        // default initialization
        int[] defaultArr={3,5,6,7,8};
        for(int i=0;i<5;i++){
            System.out.print(defaultArr[i]+" ");
        }
        System.out.println();

        // double type array:
        double[] doubleArr={4.5,6.7,1.2};


        // calculating avg marks of a student :

        new AvgMarks().showAvg();

    }
}
