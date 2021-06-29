import java.util.*;
public class First {
    public int sum(int x, int y)
    {
        return (x + y);
    }
    public double sum(int x, int y)
    {
        return (x + y +0.89);
    }
    public static void main(String[] args){
        First f=new First();
        f.sum(3,4);
    }
}


