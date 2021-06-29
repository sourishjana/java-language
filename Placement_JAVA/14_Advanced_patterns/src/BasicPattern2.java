public class BasicPattern2 {
    public void show(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<(2*(i));j++){
                System.out.print(" ");
            }
            for(int j=0;j<n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
