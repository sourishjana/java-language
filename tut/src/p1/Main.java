package p1;

/*

1) Encapsulation:
2) Abstraction:
3) Polymorphism:
4) Inheritance:

private default protected private

Access Modifier	    within class	within package	outside package by subclass only	outside package
Private	            Y	            N	            N	                                N
Default	            Y	            Y	            N	                                N
Protected	        Y	            Y	            Y	                                N
Public	            Y	            Y	            Y	                                Y

*/

/*public class Main {
    public static void main(String[] args){
        Mobile m=new Mobile();
        m.call("9123337578");
        //System.out.println(m.number);
        System.out.println(m.defaultNumber);
        System.out.println(m.protectedNumber);
        System.out.println(m.publicNumber);
    }
}*/


/*
2) Abstraction: Hiding implementation:

abstract classes:
1) when we donot know the implementation of some methods -> abstract method
2) We can not make objects of that class
3) if we extend an abstract class we need to implement all the abstract methods else itself declare itself
as abstract class
4) Abstract classes have constructors
5) Abstract classes can have concrete methods.
Abstract classes are not 100% abstract.
6) Abstract classes do not support multiple inheritance.


interface:
1) we have to implement interface
    one interface can extend from another interface
2) variable : public static final
    method : public abstract
3) 100% abstract -> it do not contains any concrete methods
4) do not have any constructors
5) Multiple inheritance :

interface supports multiple inheritance but abstract classes do not support multiple inheritance


*/







// Multiple inheritance:
/*

abstract class AquaticAnimal{
    public AquaticAnimal(){

    }
    public abstract void xyz();
}

abstract class TerrestrialAnimal{
    public TerrestrialAnimal(){

    }
    public abstract void xyz();
}

class Frog extends AquaticAnimal,TerrestrialAnimal{
    public Frog(){
        super();
    }
    @Override
    public void xyz(){
        System.out.println("Helo");
    }
}
*/


/*
interface AquaticAnimal{
    public abstract void xyz();
}

interface TerrestrialAnimal{
    public abstract void xyz();
}

class Frog implements AquaticAnimal,TerrestrialAnimal{
    public Frog(){
        super(); //
    }
    @Override
    public void xyz(){
        System.out.println("Helo");
    }
}
*/








interface Phone{
    int k=0; // public static final k=0;
    public abstract void call(String num); // method signature
    public abstract void camera(); // method signature
}

interface ApplePhone extends Phone{
    int num=90;
    abstract void game();
    abstract void calculator();
    abstract void calender();
}

abstract class AppleV1 implements ApplePhone{
    public void calculator(){
        // code
    }
}

abstract class AppleV2 extends AppleV1{
    public void game(){
        // code
    }
}

class AppleV3 extends AppleV2{
    public void calender(){

    }
    public void call(String num){

    }

    public void camera() {

    }
}

/*

abstract class Phone{
    private int number; // private
    int defaultNumber; // automatically default (package private)
    protected int protectedNumber; // protected
    public int publicNumber; // public
    public abstract void call(String num); // method signature
    public abstract void camera(); // method signature
}

abstract class Samsung extends Mobile{
    public void game(){ // method definition provided (concrete method)
        System.out.println("game");
    }
    abstract void nightMode(); // only method signature
}


abstract class ApplePhone extends Mobile{
    int num;
    abstract void game();
    abstract void calculator();
    abstract void calender();
}

abstract class AppleV1 extends ApplePhone{
    public void calculator(){
        // code
    }
}

abstract class AppleV2 extends AppleV1{
    public void game(){
        // code
    }
}

class AppleV3 extends AppleV2{
    public void calender(){

    }
}
*/


/*

class Test{
    int x=90;
    public Test(int num){
        System.out.println("Test cons");
    }
    public void xyz(){
        System.out.println("hiiii");
    }
    public void xy(){
        System.out.println("Hi");
    }
}

class Test2 extends Test{
    private int num,x=80;
    public Test2(){
        super(40);
        System.out.println("Test2 cons");
        System.out.println(super.x+" "+this.x);  // 80
    }
    public void xyz(){
        System.out.println("helo");
    }
    @Override
    public void xy(){
        this.xyz();
        System.out.println("Hello");
    }
}
*/

interface AquaticAnimal{
    default int xyz(){
        System.out.println("Aquatic animal");
        return 2;
    }
}

interface TerrestrialAnimal{
    default int xyz(){
        System.out.println("Terrestrial animal");
        return 3;
    }
}

class Frog implements AquaticAnimal,TerrestrialAnimal{
    public int xyz(){
        return AquaticAnimal.super.xyz();
    }
}

public class Main {
    public static void main(String[] args){
        Mobile m=new Mobile();
        //Phone p=new Phone();
        AppleV3 a=new AppleV3();

        Frog t=new Frog();
        t.xyz();
    }
}

