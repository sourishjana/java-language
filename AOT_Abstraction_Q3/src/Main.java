public class Main {
    public static void main(String[] args) {
        Curr_Acct a1=new Curr_Acct("abc",712812,"current",300);
        System.out.println(a1.getBalance());
        a1.deposit(5000);
        System.out.println(a1.getBalance());

        Savn_Acct b1=new Savn_Acct("xyz",7612762,"saving",89);
        System.out.println(b1.getBalance());
    }
}

class Account{
    String name;
    int accNumber;
    String accType;

    public Account(String name, int accNumber, String accType) {
        this.name = name;
        this.accNumber = accNumber;
        this.accType = accType;
    }
}

class Curr_Acct extends Account{
    private double balance=0;

    public Curr_Acct(String name, int accNumber, String accType, int balance) {
        super(name, accNumber, accType);
        this.balance=balance;
        if(balance<1000){
            penalty();
        }
    }
    private void interest(int time){
        this.balance=((this.balance)*(1+(double)(4/100)*time));
    }

    private void penalty(){
        this.balance-=100;
    }
    public void deposit(int amount){
        this.balance+=amount;
        if(this.balance<1000){
            penalty();
        }
    }
    public double getBalance() {
        return this.balance;
    }

    public void checkMinBalance(){
        System.out.println("1000 Rs");
    }
}

class Savn_Acct extends Account{
    private double balance=0;

    public Savn_Acct(String name, int accNumber, String accType, int balance) {
        super(name, accNumber, accType);
        this.balance=balance;
    }
    private void interest(int years,int time){
        this.balance=((this.balance)*Math.pow((double)(1+ (double)4/100),years*time)  );
    }
    public void deposit(int amount){
        this.balance+=amount;
    }
    public double getBalance() {
        return this.balance;
    }

    public void checkMinBalance(){
        System.out.println("0 Rs");
    }
}
