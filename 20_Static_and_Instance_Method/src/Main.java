public class Main {
    int w,h;
    static int d;
    // instance method:
    void calcArea(){
        System.out.println("Inside instance method");
        System.out.println(w+" "+h);
        calcVolume();
        System.out.println(d);
    }
    // Static method:
    static void calcVolume(){
        System.out.println("Inside static method");
        //System.out.println(w+" "+h); // this cant be possible
        Main b= new Main();
        System.out.println(b.w);
        System.out.println(d);
    }

    public static void main(String[] args) {
        Main b=new Main();
        b.w=90;b.h=98;d=87;
        System.out.println(b.w+" "+b.h);
        System.out.println(b.d+" "+d); //there are 2 ways to call static var
        b.calcArea();
        calcVolume();
    }
}
