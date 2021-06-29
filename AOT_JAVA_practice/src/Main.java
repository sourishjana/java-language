
class Bank{
    private String name;
    private String address;
    private String typeOfAccount;
    private int balance;
    private int noOfTransactions;
    private String accNumber;
    private static int accValue=0;
    private int minBalance;

    public Bank(String name, String address, String typeOfAccount, int balance, int noOfTransactions) {
        this.name = name;
        this.address = address;
        this.typeOfAccount = typeOfAccount;
        this.balance = balance;
        this.noOfTransactions = noOfTransactions;
        this.accNumber=generateAccNumber();
        this.minBalance=1000;
    }

    private String generateAccNumber(){
        return ("BA100"+(accValue++));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTypeOfAccount() {
        return typeOfAccount;
    }

    public void setTypeOfAccount(String typeOfAccount) {
        this.typeOfAccount = typeOfAccount;
    }

    public int getBalance() {
        return balance;
    }

    public int getNoOfTransactions() {
        return noOfTransactions;
    }

    public String getAccNumber() {
        return accNumber;
    }

    public String getAccountDetails(String accNumber) {
        if(!accNumber.equals(this.accNumber))
            return "Wrong acc number";
        return "Bank{" +
                "name='" + name + '\'' +
                "\n, address='" + address + '\'' +
                "\n, typeOfAccount='" + typeOfAccount + '\'' +
                "\n, balance=" + balance +
                "\n, noOfTransactions=" + noOfTransactions +
                "\n, accNumber='" + accNumber + '\'' +
                '}';
    }

    public int withdraw(String accNumber,int amount){
        if(accNumber.equals(this.accNumber)){
            if(amount<=balance){
                this.balance-=amount;
                System.out.println("Rs "+amount+" deducted from your account");
                return amount;
            }else{
                System.out.println("You do not have that much money to withdraw");
                return -1;
            }
        }else {
            System.out.println("Your acc number does not matches");
            return -1;
        }
    }
    public void deposit(String accNumber,int amount){
        if(accNumber.equals(this.accNumber)){
            this.balance+=amount;
            System.out.println("Rs "+amount+" successfully deposited to your account");
        }else {
            System.out.println("Your acc number does not matches");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Bank person1=new Bank("Person 1","address 1","Savings",1000,0);
        System.out.println(person1.getAccountDetails(person1.getAccNumber()));
        Bank person2=new Bank("Person 2","address 2","Kids",2000,0);
        System.out.println(person2.getAccountDetails(person2.getAccNumber()));

        person1.deposit(person1.getAccNumber(),20000);
        System.out.println(person1.getAccountDetails(person1.getAccNumber()));
        person1.withdraw(person1.getAccNumber(),1000);
        System.out.println(person1.getAccountDetails(person1.getAccNumber()));
        person1.setAddress("New address 1");
        System.out.println(person1.getAccountDetails(person1.getAccNumber()));
        System.out.println(person1.getAccountDetails(person2.getAccNumber()));

    }
}
