
public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    // calling super class constructor
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    public void chew(){
        System.out.println("dog is chewing. inside dog.chew()");
    }

    // method overriding from super class
    @Override
    public void eat() {
        chew();
        System.out.println("Inside dog.eat().");
        //super.eat();
    }

    public void walk(){
        System.out.println("Dog is walking. inside dog.walk()");
        move(5);  // takes move from Dog class
        // if there is no move method present in Dog class then it will go to super class
        // and will act same as super.move()
    }

    public void run(){
        System.out.println("Dog is running. inside dog.run()");
        move(10); // takes move from super class (Animal)
    }

    /*@Override
    public void move(int speed) {
        System.out.println("Dog is moving. inside dog.move()");
        super.move(speed);
    }*/
}
