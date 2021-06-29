public class AdvancedPattern1 {
    public void show(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<2*(n-i-1);j++){
                System.out.print(" ");
            }
            for(int j=0;j<i+1;j++){
                System.out.print("*   ");
            }
            System.out.println();
        }
    }
    public void show1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<2*i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<n-i;j++){
                System.out.print("*   ");
            }
            System.out.println();
        }
    }
}

/*

______*
____*__*
__*__*__*
*__*__*__*

*/
