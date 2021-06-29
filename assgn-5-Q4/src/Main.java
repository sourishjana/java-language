
interface Display{
    void display();
}

class A implements Display{
    public void display(){
        System.out.println("This is class A");
    }
}

public class Main {
    public static void main(String[] args) {
        A a=new A(){ // like a subclass of A .. subclass with no name
            @Override
            public void display(){
                super.display();
                System.out.println("This is anonymous class of A");
            }
        };
        a.display();
    }
}
