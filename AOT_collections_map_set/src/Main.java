// linkedList

// q1
/*import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        LinkedList<Integer> arr=new LinkedList<>();
        for(int i=0;i<n;i++)
            arr.add(sc.nextInt());
        int start=sc.nextInt();
        arr.add(0,start);
        System.out.println(arr);
        int end=sc.nextInt();
        arr.add(end);
        System.out.println(arr);
        int anyIndex=sc.nextInt();
        int val=sc.nextInt();
        arr.add(anyIndex,val);
        System.out.println(arr);
    }
}*/


// q2
/*import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        LinkedList<Integer> arr=new LinkedList<>();
        for(int i=0;i<n;i++)
            arr.add(sc.nextInt());
        arr.removeFirst();
        System.out.println(arr);
        arr.removeLast();
        System.out.println(arr);
        int removeAny=sc.nextInt();
        arr.remove(removeAny);
        System.out.println(arr);
    }
}*/


// q3
/*import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        LinkedList<Integer> arr=new LinkedList<>();
        for(int i=0;i<n;i++)
            arr.add(sc.nextInt());
        System.out.println(arr);
        System.out.println(arr.getFirst());
        System.out.println(arr.getLast());
        int anyPos=sc.nextInt();
        System.out.println(arr.get(anyPos));
    }
}*/


// q4
/*import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        LinkedList<Integer> arr=new LinkedList<>();
        for(int i=0;i<n;i++)
            arr.add(sc.nextInt());
        int pos=sc.nextInt();
        for(int i=pos;i<arr.size(); i++)
            System.out.print(arr.get(i) +" ");
    }
}*/


// q5
/*import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        LinkedList<Integer> arr=new LinkedList<>();
        for(int i=0;i<n;i++)
            arr.add(sc.nextInt());
        int pos=sc.nextInt();
        for(int i=pos;i>=0; i--)
            System.out.print(arr.get(i) +" ");
    }
}*/


// JCF assignment 4

// q1
/*import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        LinkedList<Integer> arr=new LinkedList<>();
        for(int i=0;i<n;i++)
            arr.add(sc.nextInt());
        for(int i=arr.size()-1;i>=0; i--)
            System.out.print("("+arr.get(i) +","+arr.indexOf(arr.get(i))+") ");
    }
}*/


// q2
/*import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        LinkedList<Integer> arr=new LinkedList<>();
        for(int i=0;i<n;i++)
            arr.add(sc.nextInt());
        int first=sc.nextInt();
        int second=sc.nextInt();
        Collections.swap(arr,first,second);
        System.out.println(arr);
    }
}*/


// q3
/*import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        LinkedList<Integer> arr=new LinkedList<>();
        for(int i=0;i<n;i++)
            arr.add(sc.nextInt());
        Collections.sort(arr);
        System.out.println(arr);
    }
}*/


// q4
/*import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        LinkedList<Integer> arr=new LinkedList<>();
        for(int i=0;i<n;i++)
            arr.add(sc.nextInt());
        arr.sort(Collections.reverseOrder());
        System.out.println(arr);
    }
}*/


// q5
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        LinkedList<Integer> arr=new LinkedList<>();
        for(int i=0;i<n;i++)
            arr.add(sc.nextInt());
        int element=sc.nextInt();
        System.out.println("Found at index : "+arr.indexOf(element));
    }
}
