/*
* Write a JAVA Program to find Area and Circumference of Circle using Constructors.
* */

import java.util.Scanner;
class Circle{
    private double r;
    private double pi=3.14;
    private double area;
    private double perimeter;
    public Circle(double r) {
        this.r = r;
        this.area=pi*(r*r);
        this.perimeter=2*pi*r;
    }
    public double getArea() {
        return area;
    }
    public double getPerimeter() {
        return perimeter;
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r=sc.nextInt();
        Circle c=new Circle(r);
        System.out.println("Area of circle is : "+c.getArea());
        System.out.println("Circumference of circle is : "+c.getPerimeter());
    }
}
