import java.util.Scanner;

public class MatrixAddition {
    public void showAddition(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n and m : (n*m) :");
        int n=sc.nextInt();
        int m= sc.nextInt();
        sc.nextLine();

        int[][] arr = new int[n][m],arr1=new int[n][m];

        System.out.println("Enter 1st array : ");
        for(int j=0;j<n;j++){
            for(int i=0;i<m;i++){
                arr[j][i]=sc.nextInt();
            }
        }
        System.out.println("Enter 2nd array : ");
        for(int j=0;j<n;j++) {
            for (int i = 0; i < m; i++) {
                arr1[j][i] = sc.nextInt();
            }
        }

        System.out.println("1st array : ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("2nd array : ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }

        int[][] res=new int[n][m];
        System.out.println("Result is : ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                res[i][j]=arr[i][j]+arr1[i][j];
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
    public void showMultiplication(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n and m : (n*m) :");
        int n=sc.nextInt();
        int m= sc.nextInt();
        sc.nextLine();
        int[][] arr = new int[n][m];

        System.out.println("Enter 1st array : ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter n and m : (n*m) :");
        int n1=sc.nextInt();
        int m1= sc.nextInt();
        if(m!=n1){
            System.out.println("matrix multiplication not valid");
            return;
        }
        int[][] arr1=new int[n1][m1];
        System.out.println("Enter 2nd array : ");
        for(int i=0;i<n1;i++) {
            for (int j = 0; j < m1; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("1st array : "+n+" "+m);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("2nd array : "+n1+" "+m1);
        for(int i=0;i<n1;i++){
            for(int j=0;j<m1;j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }

        /*int[][] res=new int[n][m];
        System.out.println("Result is : ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                res[i][j]=arr[i][j]+arr1[i][j];
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }*/
        int[][] res=new int[n][m1];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<m1;k++){
                    res[j][k]+= arr[j][i]*arr1[i][k];
                }
            }
        }
    }
}
