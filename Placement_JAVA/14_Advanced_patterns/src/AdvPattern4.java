public class AdvPattern4 {
    public void show(int n){
        System.out.print("* ");
        System.out.println();
        for(int i=0;i<(n-2);i++){
            System.out.print("* ");
            for(int j=0;j<i;j++){
                System.out.print("  ");
            }
            System.out.print("* ");
            System.out.println();
        }
        for(int i=0;i<n;i++){
            System.out.print("* ");
        }
    }
}
