package com.company;

public class VipCustomer {
    private String name;
    private int creditLimit;
    private String email;
    public VipCustomer (String name, int creditLimit, String email){
        this.name=name;
        this.creditLimit=creditLimit;
        this.email=email;
    }
    public VipCustomer (String name, int creditLimit){
        this(name, creditLimit, "default@gmail.com");
    }
    public VipCustomer (){
        this("Unknown", 0, "default@gmail.com");
    }
    public String getName(){
        return this.name;
    }
    public int getCreditLimit(){
        return this.creditLimit;
    }
    public String getEmail(){
        return this.email;
    }
}
