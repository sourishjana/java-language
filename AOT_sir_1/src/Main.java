public class Main {
    public static void main(String[] args) {
        Car m=new Car("abc","12332",987, 9);
        m.display();
        m.discount();
    }
}

class Motor{
    String modelName;
    String modelNumber;
    int modelPrice;
    public Motor(String modelName, String modelNumber, int modelPrice) {
        this.modelName = modelName;
        this.modelNumber = modelNumber;
        this.modelPrice = modelPrice;
    }
    void display(){
        System.out.println(modelName+ " "+modelNumber+ " "+ modelPrice);
    }
}

class Car extends Motor{
    int discountRate;
    public Car(String modelName, String modelNumber, int modelPrice, int discountRate) {
        super(modelName, modelNumber, modelPrice);
        this.discountRate = discountRate;
    }
    void display(){
        System.out.println(modelName+" "+modelNumber+" "+modelPrice+" "+discountRate);
    }
    void discount(){
        System.out.println(discountRate);
    }
}
