
interface Shape{
    double pie=3.14;
}

class Circle implements Shape{
    private double r;
    Circle (double r){
        this.r=r;
    }
    void area(){
        System.out.println(pie*r*r);
    }
}
class Rectangle implements Shape{
    private double l,b;
    Rectangle (double l,double b){
        this.l=l;
        this.b=b;
    }
    void area(){
        System.out.println(l*b);
    }
}

public class Main {
    public static void main(String[] args) {
        Circle c=new Circle(5);
        Rectangle r=new Rectangle(4,5);
        c.area();
        r.area();
    }
}
