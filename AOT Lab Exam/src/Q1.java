/*
* Demonstrate that a derived-class constructor cannot catch exceptions thrown by its base-class
constructor.
* */

/*class Base {
    Base() {
        throw new Exception();
    }
}

public class Q1 extends Base {

    Q1() throws Exception {}

    public static void main(String[] args) throws Exception {
        try {
            Q1 d = new Q1();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}*/

/*class Base {
    Base() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}

class Derived extends Base {

    Derived() throws CloneNotSupportedException, RuntimeException {}

    public static void main(String[] args) {
        try {
            Derived d = new Derived();
        }
        catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }
        catch(RuntimeException re){}
    }
}*/

/*class Time{
    private int hr;
    private int min;
    private int sec;
    public Time(int hr, int min, int sec) {
        this.hr = hr;
        this.min = min;
        this.sec = sec;
    }
    void show(){
        System.out.println(hr+" hrs : "+min+" min : "+sec+" sec");
    }
    Time add(Time t1){
        Time temp=new Time(0,0,0);
        temp.sec=sec+t1.sec;
        temp.min=min+t1.min;
        temp.hr=hr+t1.hr;
        if(temp.sec>=60){
            temp.min+=(temp.sec/60);
            temp.sec=temp.sec%60;
        }
        if(temp.min>=60){
            temp.hr+=temp.min/60;
            temp.min=temp.min%60;
        }
        return temp;
    }
}

public class Q1{
    public static void main(String[] args){
        Time t1=new Time (5,3,34);
        Time t2=new Time(3,4,12);
        Time add=t1.add(t2);
        add.show();
    }
}*/


/*import java.util.*;

public class Q1{
    static final int NO_OF_CHARS = 256;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int[] c=new int[NO_OF_CHARS];
        for(int i=0;i<s.length();i++){
            c[s.charAt(i)]++;
        }
        int first = 0, second = 0;
        for (int i = 0; i < NO_OF_CHARS; i++) {
            if (c[i] > c[first]) {
                second = first;
                first = i;
            }
            else if (c[i] > c[second] && c[i] != c[first])
                second = i;
        }
        System.out.println("Most frequent : "+(char)first);
        System.out.println("Second most frequent : "+(char)second);
    }
}*/

