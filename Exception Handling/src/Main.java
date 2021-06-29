/*import java.io.IOException;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello");
        try{
            throw new IOException();
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Bye");
    }
}*/

/*import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello");
        throw new IOException();
    }
}*/

/*import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello");
        try{
            int i=100/0;
            //throw new FileNotFoundException();
        }catch(ArithmeticException e){
            System.out.println(e);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        //catch(IOException e){
        //   System.out.println(e);
        //}
        finally{
            System.out.println("hi");
        }
        System.out.println("Bye");
    }
}*/

