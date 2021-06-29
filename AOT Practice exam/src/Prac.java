import pTwo.*;
public class Prac {
    public static void main(String[] args) {
        try{
            new Hello().show();
            String s=args[0];
            int a=Integer.parseInt(args[1]);
            int b=Integer.parseInt(args[2]);
            StringBuilder sb=new StringBuilder();
            sb.append(s.substring(a,b));
            System.out.println(sb.reverse());
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }catch(NumberFormatException e){
            System.out.println(e);
        }catch(StringIndexOutOfBoundsException e){
            System.out.println(e);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}


// armstrong number in a given range
/*import java.util.Scanner;
public class Prac
{
    public static void main(String args[])
    {
        int num, start, end, i, rem, temp, counter=0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the start number: ");
        start = scanner.nextInt();
        System.out.print("Enter the end number: ");
        end = scanner.nextInt();
        scanner.close();

        //generate Armstrong numbers between start and end
        for(i=start+1; i<end; i++)
        {
            temp = i;
            num = 0;
            while(temp != 0)
            {
                rem = temp%10;
                num = num + rem*rem*rem;
                temp = temp/10;
            }
            if(i == num)
            {
                if(counter == 0)
                {
                    System.out.print("Armstrong Numbers Between "+start+" and "+end+": ");
                }
                System.out.print(i + "  ");
                counter++;
            }
        }
        // if no Armstrong number is found

        if(counter == 0)
        {
            System.out.print("There is no Armstrong number Between "+start+" and "+end);
        }
    }
}*/


/*import java.util.*;
public class Prac
{
    // Recursive function to return gcd of a and b
    static int gcd(int a, int b)
    {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    // Driver method
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("GCD of " + a +" and " + b + " is " + gcd(a, b));
    }
}*/


//Question-25(b)

/*class Out
{
    int x=10;
    void show_out()
    {
        System.out.println("Outer class");
    }
    class In
    {
        int y=5;
        void show_in()
        {
            System.out.println("Inner class");
            System.out.println("Outerclass member x:"+x);//No error
            System.out.println("Inner class member y:"+y);//No error
            show_out();
        }
    }
    public void check()
    {
//show_in(); -> will give error:cannot find symbol
        new In().show_in();
// System.out.println(y); -> will give error:cannot find symbol
        System.out.println("Inner class member:"+new In().y);
    }
}

public class Prac
{
    public static void main(String[] args)
    {
        Out.In ob=new Out().new In();
        System.out.println("From inner class:");
        ob.show_in();
        Out ob1=new Out();
        System.out.println("From outer class:");
        ob1.check();
    }
}*/
