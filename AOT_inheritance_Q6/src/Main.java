public class Main {
    public static void main(String[] args) {
        Square x=new Square();
        x.printShape();
        x.printRect();
    }
}

class Shape{
    public void printShape(){
        System.out.println("This is shape");
    }
}

class Rectange extends Shape{
    public void printRect() {
        System.out.println("This is rectangle");
    }
}

class Circle extends Shape{
    public void printCircle() {
        System.out.println("This is circle");
    }
}
class Square extends Rectange{
    public void printSquare() {
        System.out.println("Square is a rectange");
    }
}

