public class Main {
    public static void main(String[] args) {
        // Q1
        Student s=new Student();
        System.out.println(s.name);
        Student s1=new Student("Rohit");
        System.out.println(s1.name);

        // Q2
        Rectangle r1=new Rectangle();
        Rectangle r2=new Rectangle(7);
        Rectangle r3=new Rectangle(8,9);
        r1.area();
        r2.area();
        r3.area();
    }

}

class Student{
    String name;

    public Student(String name) {
        this.name = name;
    }
    public Student(){
        this("unknown");
    }
}

class Rectangle{
    int length;
    int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public Rectangle(int length){
        this(length, length);
    }
    public Rectangle(){
        this(0,0);
    }

    public void area(){
        System.out.println("Area of rectangle : "+(length*breadth));
    }

}
