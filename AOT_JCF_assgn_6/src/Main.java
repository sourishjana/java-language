/*// q1
import java.util.*;
public class Main {
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("first",1);
        hm.put("second",2);
        hm.put("third",3);
        System.out.println(hm);
    }
}*/

/*// q2
import java.util.*;
public class Main {
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("first",1);
        hm.put("second",2);
        hm.put("third",3);
        hm.put("fourth",2);
        hm.put("fifth",1);
        HashSet<Integer> hs=new HashSet<>(hm.values());
        System.out.println(hs);
    }
}*/


/*// q3
import java.util.*;
public class Main {
    public static void main(String[] args) {
        HashMap<Integer,Integer> store=new HashMap<>();
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("first",1);
        hm.put("second",2);
        hm.put("third",3);
        hm.put("fourth",2);
        hm.put("fifth",1);
        hm.put("sixth",1);
        System.out.println(hm);
        for (Map.Entry<String, Integer> stringIntegerEntry : hm.entrySet()) {
            Map.Entry mapElement = stringIntegerEntry;
            if(store.containsKey(mapElement.getValue()))
                store.put((Integer)mapElement.getValue(),store.get((Integer)mapElement.getValue())+1);
            else
                store.put((Integer)mapElement.getValue(),1);
        }
        System.out.println(store);
        HashMap<Object, Object> hmcopy=new HashMap<>();
        for (Map.Entry<String, Integer> stringIntegerEntry : hm.entrySet()) {
            Map.Entry mapElement = stringIntegerEntry;
            if(store.get((Integer)mapElement.getValue())>1){
                hmcopy.put(mapElement.getKey(),(Integer)mapElement.getValue()*2);
            }else{
                hmcopy.put(mapElement.getKey(),(Integer)mapElement.getValue());
            }
        }
        System.out.println("new hashmap : ");
        System.out.println(hmcopy);
    }
}*/


/*// q4
import java.util.*;
public class Main {
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("first",1);
        hm.put("second",2);
        hm.put("third",3);
        hm.put("fourth",2);
        hm.put("fifth",1);
        if(hm.containsKey("second")){
            System.out.println("Yes key is present");
        }else{
            System.out.println("Not present");
        }
    }
}*/


/*// q5
import java.util.*;
public class Main {
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("first",1);
        hm.put("second",2);
        hm.put("third",3);
        hm.put("fourth",2);
        hm.put("fifth",1);
        if(hm.containsValue(2)){
            System.out.println("Yes value is present");
        }else{
            System.out.println("Not present");
        }
    }
}*/


/*// q6
import java.util.*;
public class Main {
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("first",1);
        hm.put("second",2);
        hm.put("third",3);
        hm.put("fourth",2);
        hm.put("fifth",1);
        System.out.println(hm.get("second"));
    }
}*/


/*// q7
import java.util.*;
public class Main {
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("first",1);
        hm.put("second",2);
        hm.put("third",3);
        hm.put("fourth",2);
        hm.put("fifth",1);
        for ( String key : hm.keySet() ) {
            System.out.println( key );
        }
    }
}*/


/*// q8
import java.util.*;
public class Main {
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("first",1);
        hm.put("second",2);
        hm.put("third",3);
        hm.put("fourth",2);
        hm.put("fifth",1);
        System.out.println(hm.values());
    }
}*/
