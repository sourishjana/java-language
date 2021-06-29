package pTwo;
import pOne.*;

public class pTwo extends pOne{
    public int y=34;
    public void displayTwo(){
        displayOne();
        System.out.println("Inside pTwo , "+y+" "+x);
    }
}



