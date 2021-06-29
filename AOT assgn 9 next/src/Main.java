
// q5
/*import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        try {
            throw new IOException();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}*/

// q9
import java.io.*;
class Super{
    void example() throws RuntimeException{

    }
}

class Sub extends Super{
    void example() throws ArithmeticException{
        throw new ArithmeticException();
    }
}

public class Main {
    public static void main(String[] args){
        try{
            Sub s=new Sub();
            s.example();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}


//q6
/*class UserDefinedExceptionUnchecked extends Exception{
    public String toString() {
        return "User defined unchecked exception";
    }
}
class UserDefinedExceptionChecked extends RuntimeException{
    public String toString() {
        return "User defined checked exception";
    }
}

public class Main {
    public static void main(String[] args) {
        try{
            throw new UserDefinedExceptionUnchecked();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}*/


// q6

/*import java.lang.*;
import java.util.*;

class PayOutOfBoundsException extends Exception{
    public String toString() {
        return " the monthly salary of a person is" +
                "less than Rs. 10,000 /-";
    }
}
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int salary=sc.nextInt();
        try{
            if(salary<10000)
                throw new PayOutOfBoundsException();
            else
                System.out.println(salary);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}*/


// q7

/*class UserDefinedException extends Exception{
    public String toString(){
        return "UserDefinedException";
    }
}

class UserDefinedException2 extends Exception{
    public String toString(){
        return "UserDefinedException 2";
    }
}

class Demo{
    public static void f() throws UserDefinedException2 {
        try{
            g();
        }catch(Exception e){
            System.out.println(e);
            throw new UserDefinedException2();
        }
    }
    public static void g() throws UserDefinedException {
        throw new UserDefinedException();
    }
}

class Main{
    public static void main(String[] args) {
        try{
            Demo.f();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}*/
