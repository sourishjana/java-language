import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int[][] a=new int[5][3];
        for(int i=0;i<5;i++){
            for(int j=0;j<3;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        // we can also initialize 2D array like this
        int[][] b={
                {2,3,4,5,6},
                {1,7,3},
                {6,7,9,2,3,7}
        };

        //new MatrixAddition().showAddition();
        new MatrixAddition().showMultiplication();

    }
}
