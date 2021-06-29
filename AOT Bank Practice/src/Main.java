// q1 ----------------------------

/*import java.util.Scanner;
class BankAcc{
    int amount;
    BankAcc(){
        amount=50;
    }
    public void show(){
        System.out.println(amount);
    }
}
class AddAmount extends BankAcc{
    AddAmount(){}
    AddAmount(AddAmount ob,int n){
        ob.amount+=n;
    }
}
public class Main {
    public static void main(String args[]){
        AddAmount ob2=new AddAmount(new AddAmount(),100);
        AddAmount ob1=new AddAmount();
        int n;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("enter amount");
            n=sc.nextInt();
            if(n<0)
                break;
            new AddAmount(ob2,n);
        }while(true);
        ob2.show();
    }
}*/

// q2 --------------------------------

/*class Programming{
    String s="I love Programming languages";
    Programming(){
        System.out.println(s);
    }
    Programming(String x) {
        System.out.println(s.substring(0,s.indexOf("Programming languages"))+x);
    }
}
public class Main {
    public static void main(String args[]){
        Programming p1=new Programming();
        Programming p2=new Programming("java");
    }
}*/

// q3 ---------------------------

/*import java.io.*;
import java.util.*;
class BankAccount{
    String name_dep;
    String address_dep;
    String type;
    double bal;
    static int tran;
    static int u=1000;
    BankAccount(String name_dep,String address_dep,String type) {
        this.name_dep=name_dep;
        this.address_dep=address_dep;
        this.type=type;
    }
    String uni(){
        String t="BA"+u;
        u++;
        return t;
    }
    void disp(){
        System.out.println(name_dep+" "+address_dep+" "+bal);
    }
    void deposit(double x){
        bal+=x;
        tran++;
        System.out.println("deposited");
    }
    void withdraw(double x){
        if(bal<=x)
            System.out.println("less balance");
        else{
            bal-=x;
            tran++;
            System.out.println("withdrawn");
        }
    }
    void change_add(String add) {
        address_dep=add;
        System.out.println("address changed");
    }
}

public class Main {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        HashMap<String,BankAccount> hm=new HashMap<String,BankAccount>();
        BankAccount b1=new BankAccount("user1","A","Savings");
        BankAccount b2=new BankAccount("user2","B","Credit");
        String acc1=b1.uni();
        b1.disp();
        b1.deposit(1000);
        b1.disp();
        b1.withdraw(100);
        b1.disp();
        b1.change_add("AA");
        b1.disp();
        String acc2=b1.uni();
        b1.disp();
        b1.deposit(2000);
        b1.disp();
        b1.withdraw(100);
        b1.disp();
        b1.change_add("AA");
        b1.disp();
        System.out.println(BankAccount.tran);
        hm.put(acc1, b1);
        hm.put(acc2, b2);
        String Ac;
        System.out.println("enter account number");
        Ac=sc.nextLine();
        if(hm.containsKey(Ac)) {
            BankAccount ob=hm.get(Ac);
            ob.disp();
        }
        else
            System.out.println("Not found");
    }
}*/

