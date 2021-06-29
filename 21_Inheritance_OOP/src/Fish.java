public class Fish extends Animal {
    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1,1, size, weight);
        this.gills = gills;
        this.eyes = eyes;  
        this.fins = fins;
    }

    private void rest(){
        System.out.println("Fish rests. inside fish.rest()");
    }
    private void moveMustles(){
        System.out.println("Fish move mustles. inside fish.moveMustles()");
    }
    private void moveBackFin(){
        System.out.println("Fish move backfin. inside fish.moveMustles()");
    }
    private void swim(int speed){
        moveMustles();
        moveBackFin();
        System.out.println("Fish swims.inside fish.swim()");
        super.move(speed);
    }

}
