/*// q1
import java.util.*;
public class Main {
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<Integer>();
        hs.add(2);
        hs.add(4);
        hs.add(5);
        hs.add(7);
        if(hs.contains(4))
            System.out.println("hashset contains 2");
        else
            System.out.println("Does not contains 2");
    }
}*/

/*// q2
import java.util.*;
public class Main {
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<Integer>();
        hs.add(12);
        hs.add(2);
        hs.add(4);
        hs.add(5);
        hs.add(7);
        TreeSet<Integer> ts=new TreeSet<Integer>(hs);
        System.out.println(ts);
    }
}*/

/*// q3
import java.util.*;
public class Main {
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<Integer>();
        hs.add(12);
        hs.add(2);
        hs.add(4);
        hs.add(5);
        hs.add(7);
        TreeSet<Integer> ts=new TreeSet<Integer>(hs);
        System.out.println(ts.descendingSet());
    }
}*/

/*// q4
import java.util.*;
public class Main {
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<Integer>();
        hs.add(12);
        hs.add(2);
        hs.add(4);
        hs.add(5);
        hs.add(7);
        HashSet<Integer> subhs=new HashSet<Integer>();
        subhs.add(12);
        subhs.add(2);
        subhs.add(1);
        subhs.add(15);
        subhs.add(17);
        hs.retainAll(subhs);
        System.out.println(hs);
    }
}*/

/*// q5
import java.util.*;
public class Main {
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<Integer>();
        hs.add(12);
        hs.add(2);
        hs.add(4);
        hs.add(5);
        hs.add(7);
        hs.removeIf(i -> i > 6);
        System.out.println(hs);
    }
}*/

/*// q6
import java.util.*;
public class Main {
    public static void main(String[] args) {
        HashSet<Integer> hs1=new HashSet<Integer>();
        hs1.add(12);
        hs1.add(2);
        hs1.add(4);
        hs1.add(5);
        hs1.add(7);
        HashSet<Integer> hs2=new HashSet<Integer>();
        hs2.add(12);
        hs2.add(2);
        hs2.add(4);
        hs2.add(5);
        hs2.add(7);
        if(hs1.equals(hs2))
            System.out.println("Equal");
        else
            System.out.println("Not equal");
    }
}*/

/*// q7
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedList<Integer> ls1=new LinkedList<Integer>();
        LinkedList<Integer> ls2=new LinkedList<Integer>();
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        for(int i=0;i<n1;i++)
            ls1.add(sc.nextInt());
        for(int i=0;i<n2;i++)
            ls2.add(sc.nextInt());
        ls1.addAll(ls2);
        System.out.println(ls1);
    }
}*/

/*// q8
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedList<Integer> ls=new LinkedList<Integer>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int element=sc.nextInt();
            if(!ls.contains(element))
                ls.add(element);
            else
                System.out.println(element+" is already present");
        }
        System.out.println(ls);
    }
}*/

/*// q9
import java.util.*;
public class Main {
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<Integer>();
        hs.add(12);
        hs.add(2);
        hs.add(4);
        hs.add(5);
        hs.add(7);
        System.out.println(hs);
        ArrayList<Integer> as=new ArrayList<Integer>(hs);
        System.out.println(as);
    }
}*/

/*// q10
import java.util.*;
public class Main {
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<Integer>();
        hs.add(12);
        hs.add(2);
        hs.add(4);
        hs.add(5);
        hs.add(7);
        System.out.println(hs);
        hs.clear();
        System.out.println(hs);
    }
}*/
