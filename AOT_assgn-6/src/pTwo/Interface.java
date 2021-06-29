package pTwo;
import pOne.*;

public class Interface implements POneInterface {

    @Override
    public void interfaceOne() {
        System.out.println("Interface one");
    }

    @Override
    public void interfaceTwo() {
        System.out.println("Interface two");
    }

    @Override
    public void interfaceThree() {
        System.out.println("Interface three");
    }
}
