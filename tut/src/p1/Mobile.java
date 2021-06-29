package p1;

public class Mobile{
    private int number; // private
    int defaultNumber; // automatically default (package private)
    protected int protectedNumber; // protected
    public int publicNumber; // public
    public void call(String num){
        // func
        System.out.println(number);
    }
    public void camera(){
        System.out.println("10 mpx");
    }
}
