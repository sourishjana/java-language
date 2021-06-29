import pTwo.*;

class Another{
    static{
        System.out.println("First Another");
    }
    static{
        System.out.println("Second Another");
    }
}

public class Main extends pTwo {
    static{
        System.out.println("First");
    }
    static{
        System.out.println("Second");
    }
    void func(){
        System.out.println("func");
    }


    interface Shapes{
        double pie=3.14;
        //void area();
    }

    static class Circle implements Shapes {
        public void area(int r) {
            System.out.println(pie*Math.pow(r,2));
        }
    }
    static class Reactangle implements Shapes {
        public void area(int l,int b){
            System.out.println(l*b);
        }
    }

    public static void main(String[] args) {
        new Main().func();
        pTwo c=new pTwo();
        c.displayTwo();
        //c.displayOne();

        Interface i=new Interface();
        i.interfaceOne();
        i.interfaceTwo();
        i.interfaceThree();

        Circle c1=new Circle();
        c1.area(3);
        Reactangle r1= new Reactangle();
        r1.area(6,7);
    }
}
