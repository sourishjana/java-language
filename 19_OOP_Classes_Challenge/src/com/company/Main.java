package com.company;

public class Main {

    public static void main(String[] args) {
        Bank myAcc= new Bank(/*"873128129",0.0,*/"Sourish","sou@gmail.com",
                "9831480019");
        System.out.println(myAcc.getCustomerName());
        System.out.println(myAcc.getAccNumber());
        System.out.println(myAcc.getBalance());
        System.out.println(myAcc.getEmail());
        System.out.println(myAcc.getPhnNumber());


        myAcc.withdrawFund(689);
        System.out.println(myAcc.getBalance());

        myAcc.depositFund(90);
        System.out.println(myAcc.withdrawFund(100));

        myAcc.depositFund(45);
        System.out.println(myAcc.withdrawFund(100));


        System.out.println("-------------------------------------------------------");
        //------------------------------------------------------------------------------------------------

        VipCustomer me= new VipCustomer("sourish",98498);
        System.out.println(me.getCreditLimit());
        System.out.println(me.getEmail());
        System.out.println(me.getName());

    }
}
