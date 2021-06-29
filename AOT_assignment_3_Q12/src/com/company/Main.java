package com.company;

public class Main {
    public static void main(String[] args) {
	    Box b1=new Box(6);
	    b1.volumeCube(9);
	    b1.volumeCone(7,8);
    }
}
class Box{
    private int l;
    private int h;
    public Box(int l, int h) {
        //System.out.println("first constructor called");
        this.l = l;
        this.h = h;
    }
    public Box(int l) {
        //System.out.println("second contructor called");
        this.l = l;
    }
    void volumeCube(int l){
        System.out.println(l*l*l);
    }
    void volumeCone(int l,int h){
        System.out.println((l*l*h)/3);
    }
}
