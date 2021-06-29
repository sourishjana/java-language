

public class Main {
    int w; // instance variable
    static int h; // static variable
    public static void main(String[] args) {
        int d=10; // local variable
        System.out.println(d);
        System.out.println(new Main().w);
        System.out.println(h);


        // static variables have only one copy per class  :

        Example b1= new Example(1,2,3);
        Example b2= new Example(4,5,6);
        System.out.println(b1.w +" "+b1.h+" "+b1.d);
        System.out.println(b2.w +" "+b2.h+" "+b2.d);
    }
}
