public class AdvancedPattern2 {
    public void show(int n){
        int k=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<2*(n-i-1);j++){
                System.out.print(" ");
            }
            for(int j=0;j<(i+1);j++){
                System.out.print((++k)+"   ");
            }
            System.out.println();
        }
    }
}

/*

______1         2(n-i-1)  spaces
____2__3        2(n-i-1)  spaces
__4__5__6       2(n-i-1)  spaces
7__8__9__10     2(n-i-1)  spaces

*/
