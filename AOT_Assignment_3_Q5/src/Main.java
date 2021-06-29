public class Main {
    public static void main(String[] args) {
        A a=new A();
        B b=new B();
        C c=new C();
        D d=new D();
        /*a.show();
        b.show();
        c.show();
        d.show();*/
        A ref;
        ref=a;
        ref.show();
        ref=b;
        ref.show();
        ref=c;
        ref.show();
        ref=d;
        ref.show();
    }
}

class A{
    public void show(){
        System.out.println("Showing class A");
    }
}
class B extends A{
    @Override
    public void show(){
        System.out.println("Showing class B");
    }
}
class C extends A{
    @Override
    public void show(){
        System.out.println("Showing class C");
    }
}
class D extends A{
    @Override
    public void show(){
        System.out.println("Showing class D");
    }
}