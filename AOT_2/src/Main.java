

public class Main {

    public static void main(String[] args) {
        Main obj1=new Main();
        First obj2=new First();
        System.out.println(obj2.show(obj1));
        System.out.println(obj2.show(obj2));
    }
}

class First{
    Main show(Main obj1){
        return obj1;
    }
    First show(First obj2){
        return obj2;
    }
}

