class A {
    int i=10;
    void show(){
        System.out.println(i);
    }
}
class B extends A{
    int i=100;
    /*void show(){
        System.out.println(i);
    }*/

    public static void main(String[] args) {
        A ob=new B();
        B ob1=(B)ob;
        System.out.println(ob.i);
        ob.show();
        ob1.show();
    }
}
