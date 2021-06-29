package com.company;

public class Bank {
    private String accNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phnNumber;

    // Constructors :
    // Default constructor : ( constructor overloading )
    public Bank(){
        this("No acc No",0.0,"No name","No email"
                ,"No Phn number");
        System.out.println("An incomplete account has been created.");
    }

    // goto -> code -> generate -> constructors -> select fields -> done
    public Bank(String customerName, String email, String phnNumber) {
        System.out.println("Setting only customer name, email, phnNumber");
        this.customerName = customerName;
        this.email = email;
        this.phnNumber = phnNumber;
    }

    public Bank(String accNumber, double balance, String customerName,
                String email, String phnNumber){
        this.accNumber=accNumber;
        this.balance=balance;
        this.customerName=customerName;
        this.email=email;
        this.phnNumber=phnNumber;
        System.out.println("Account for "+this.customerName+" created.");
    }


    // Setters :
    public void setAccNumber(String accNumber){
        this.accNumber=accNumber;
    }
    public void setCustomerName(String customerName){
        this.customerName=customerName;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setPhnNumber(String phnNumber){
        this.phnNumber=phnNumber;
    }

    // Getters :
    public String getAccNumber(){
        return this.accNumber;
    }
    public double getBalance(){
        return this.balance;
    }
    public String getCustomerName(){
        return this.customerName;
    }
    public String getEmail(){
        return this.email;
    }
    public String getPhnNumber(){
        return this.phnNumber;
    }

    // Methods :
    public void depositFund(int fund){
        this.balance+=fund;
        System.out.println("Deposit of "+fund+" Rs made your balance Rs "+getBalance());
    }
    public double withdrawFund(double withdrawAmount){
        if(withdrawAmount<this.balance){
            this.balance-=withdrawAmount;
            System.out.println("After withdrawing Rs "+withdrawAmount+", remaining Rs"+this.balance);
            return withdrawAmount;
        }else{
            System.out.println("You have Rs "+this.balance+" in your account, You cant withdraw Rs"+withdrawAmount);
            return -1;
        }
    }
}
