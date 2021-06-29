
interface A{
    void displayA();
}
interface B{
    void displayB();
}
interface C extends A,B{
    void displayC();
}

class Concrete{

}

class Derived extends Concrete implements C{

    @Override
    public void displayA() {
        System.out.println("This is interface A");
    }

    @Override
    public void displayB() {
        System.out.println("This is interface B");
    }

    @Override
    public void displayC() {
        System.out.println("This is interface C");
    }
}


public class Main {
    public static void main(String[] args) {
        Derived d=new Derived();
        d.displayA();
        d.displayB();
        d.displayC();
    }
}
