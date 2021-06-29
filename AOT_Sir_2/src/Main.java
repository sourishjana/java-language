public class Main {
    public static void main(String[] args) {
        Boxshipment a=new Boxshipment(3,4,5,9,23);
        a.volume();
    }
}

class Box{
    double height;
    double width;
    double depth;

    public Box(double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }
    void volume(){
        System.out.println(height*width*depth);
    }
}

class Boxweight extends Box{
    double weight;
    public Boxweight(double height, double width, double depth, double weight) {
        super(height, width, depth);
        this.weight = weight;
    }
}
class Boxshipment extends Boxweight{
    double cost;
    public Boxshipment(double height, double width, double depth, double weight, double cost) {
        super(height, width, depth, weight);
        this.cost = cost;
    }
}
