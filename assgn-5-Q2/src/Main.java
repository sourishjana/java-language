
class A{
    static int x=12;
    String y="This is in A";
    void test(){
        System.out.println(x+" "+y);
        System.out.println(new B().z+" "+new B().a);
    }
    static class B{
        int z=78;
        String a="This is in B";
        void display(){
            System.out.println(z+" "+a);
            System.out.println(x+" "+new A().y);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        new A().test();
        new A.B().display();
    }
}
