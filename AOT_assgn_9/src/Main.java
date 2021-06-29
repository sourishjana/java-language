
/*public class Main {
    void display(){
        System.out.println("Disp");
    }
    public static void main(String[] args){
        try{
            int i=9/0;
        }catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}*/

/*public class Main {
    void display(){
        System.out.println("Disp");
    }
    public static void main(String[] args){
        try{
            int[] arr={9,8};
            arr[3]=8;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}*/

/*public class Main {
    void display(){
        System.out.println("Disp");
    }
    public static void main(String[] args){
        try{
            int[] arr=new int[-9];
        }catch(NegativeArraySizeException e){
            System.out.println(e);
        }
    }
}*/

/*public class Main {
    void display(){
        System.out.println("Disp");
    }
    public static void main(String[] args){
        Main m=null;
        try{
            m.display();
        }catch(NullPointerException e){
            System.out.println(e);
        }
    }
}*/

public class Main {
    void display(){
        System.out.println("Disp");
    }
    public static void main(String[] args){
        // q8
        try{
            String s="sourish";
            int a=2;
            int b=14;
            StringBuilder sb=new StringBuilder();
            sb.append(s.substring(a,b));
            System.out.println(sb.reverse());
            System.out.println(args[0].substring(Integer.parseInt(args[1]),Integer.parseInt(args[1])));
            // arrayIndexout of bound exception -> sourish 1
            // Numberformat exception           -> sourish 1 2b
            // StringIndexOutOfBoundsException  -> sourish 1 23
        }catch(Exception e){
            System.out.println(e);
        }
    }
}



