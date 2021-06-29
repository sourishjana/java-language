
abstract class A{
    public static void show(){
        System.out.println("This is a concrete method.");
    }
}

abstract class B{
    abstract void show1();
    abstract void show2();
    abstract void show3();
}

abstract class C extends B{
    @Override
    void show3() {
        System.out.println("this is show3");
    }
}

public class Main extends C{
    @Override
    void show1() {
        System.out.println("This is show1");
    }

    @Override
    void show2() {
        System.out.println("This is show2");
    }

    /*@Override
    void show3() {
        System.out.println("this is show3");
    }*/

    public static void main(String[] args) {
        A.show();
        Main b=new Main();
        b.show1();
        b.show2();
        b.show3();
    }
}


