public class Main {
    public static void main(String[] args) {
        Rectangle r=new Rectangle(3,4);
        r.area();
        r.perimeter();
        Square s= new Square(6);
        s.area();
        s.perimeter();

        Square[] obj = new Square[10];
        for(int i=0;i<10;i++){
            obj[i]=new Square(5);
            obj[i].area();
        }
    }
}

class Rectangle{
    private int length;
    private int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public void area(){
        System.out.println("area is : "+(this.length*this.breadth));
    }
    public void perimeter(){
        System.out.println("perimeter is : "+2*(this.length+this.breadth));
    }
}

class Square extends Rectangle{
    public Square(int side) {
        super(side, side);
    }
}
