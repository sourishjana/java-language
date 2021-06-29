import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // ----------------------------------------- q1----------------------------------
        /*String s=sc.nextLine();
        char[] c=s.toCharArray();
        for(char i:c)
            System.out.print(i+" ");*/

        //------------------------------------------q2----------------------------------------
        //sc.nextLine();
        /*String s1=sc.nextLine();
        char[] s2=new char[40];
        int i;
        for(i=0;i<5;i++){
            s2[i]=sc.next().charAt(0);
        }
        for(int j=0;j<s1.length();j++){
            s2[i]=s1.charAt(j);
            i++;
        }
        for(char k:s2){
            System.out.print(k+" ");
        }*/

        //------------------------------------------q3----------------------------------------
        //sc.nextLine();
        /*String s4=sc.nextLine();
        System.out.println(s4.length());
        String s5=s4.trim();
        System.out.println(s5.length());*/


        //-----------------------------------------q4--------------------------------------------
        /*String s5="University of Technology";
        String sub="Tech";
        if(s5.contains(sub)){
            System.out.println(s5.indexOf(sub));
        }else {
            System.out.println("not present");
        }*/


        //-------------------------------------------q5---------------------------------------------
        /*String sentence=sc.nextLine();
        String[] words=sentence.split(" ");
        Arrays.sort(words);
        for(String s:words){
            System.out.print(s+" ");
        }*/

        //-------------------------------------------q6-----------------------------------------------
        /*StringBuilder sb=new StringBuilder();
        String name=sc.nextLine();
        String roll=sc.nextLine();
        String[] names=name.split(" ");
        if(names.length==3){
            sb.append(names[0].charAt(0));
            sb.append(names[1].charAt(0));
            sb.append(names[2].charAt(0));
            sb.append(roll.substring(roll.length()-4));
            System.out.println(sb.toString());
        }else if(names.length==2){
            sb.append(names[0].charAt(0));
            sb.append(names[1].charAt(0));
            sb.append(roll.substring(roll.length()-4));
            System.out.println(sb.toString());
        }*/

        //------------------------------------q7--------------------------------------------------
        /*String str = "Sourish";
        System.out.println(str.hashCode());
        str=str.concat("Jana");
        System.out.println(str.hashCode());
        System.out.println(str);

        StringBuffer sb = new StringBuffer("Sourish");
        System.out.println(sb.hashCode());
        sb=sb.append(" Jana");
        System.out.println(sb.hashCode());
        System.out.println(sb);*/

        //----------------------------------------q8----------------------------------------------
        /*String s=sc.nextLine();
        char[] c=s.toCharArray();
        Arrays.sort(c);
        System.out.println(c);*/


        //---------------------------------------q9-----------------------------------------------
        /*String s="University of Technology";
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.println(s.substring(n,n+m));*/

        //----------------------------------------q10-------------------------------------------------
        String s="Sourish";
        String s1=deleteMe(s,3);
        System.out.println(s1);
    }

    static String deleteMe(String s,int ind){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(i!=ind)
                sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
