
// JCF1 q1
/*import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> arr=new ArrayList<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
            arr.add(sc.nextInt());
        int sum = 0;
        for(int i=0;i<n;i++)
            sum+=arr.get(i);
        System.out.println(sum);
    }
}*/

//JCF1 q2
/*import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> arr=new ArrayList<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
            arr.add(sc.nextInt());
        Collections.sort(arr);
        System.out.println(arr);
    }
}*/

//JCF1 q3
/*import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> arr=new ArrayList<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
            arr.add(sc.nextInt());
        Collections.sort(arr,Collections.reverseOrder());
        System.out.println(arr);
    }
}*/

//JCF1 q4
/*import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        for (String arg : args) {
            arr.add(Integer.parseInt(arg));
        }
        Collections.shuffle(arr);
        for(Integer i:arr)
            System.out.print(i+" ");
    }
}*/

//JCF2 q1
/*import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> arr=new ArrayList<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
            arr.add(sc.nextInt());
        try{
            System.out.println(arr.get(3));
            System.out.println(arr.get(10));
        }catch(Exception e){
            System.out.println(e);
        }
    }
}*/

//JCF2 q2
/*import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>(Arrays.asList(args));
        System.out.println(arr);
    }
}*/

//JCF2 q3
/*import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>(Arrays.asList(args));
        System.out.println(arr);
        int del=sc.nextInt();
        arr.remove(del);
        System.out.println(arr);
        int addIndex=sc.nextInt();
        sc.nextLine();
        arr.add(addIndex,sc.nextLine());
        System.out.println(arr);
        arr.add(sc.nextLine());
        System.out.println(arr);
    }
}*/

//JCF2 q4
/*import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> arr=new ArrayList<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
            arr.add(sc.nextInt());
        int addIndex=sc.nextInt();
        int addItem=sc.nextInt();
        arr.set(addIndex,arr.get(addIndex)+addItem);
        System.out.println(arr);
    }
}*/

//JCF2 q5
/*import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> arr=new ArrayList<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
            arr.add(sc.nextInt());
        arr.add(arr.remove(2));
        System.out.println(arr);
    }
}*/

//JCF2 q6
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> arr=new ArrayList<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
            arr.add(sc.nextInt());
        int search=sc.nextInt();
        if(arr.contains(search)){
            System.out.println("Found at index : "+arr.indexOf(search));
        }else{
            System.out.println("not found");
        }
    }
}

