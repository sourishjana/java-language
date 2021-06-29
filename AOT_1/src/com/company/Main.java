package com.company;

class Another{
    static{
        System.out.println("First Another");
    }
    static{
        System.out.println("Second Another");
    }
}

public class Main extends Another {
    static{
        System.out.println("First");
    }
    static{
        System.out.println("Second");
    }
    public static void main(String[] args) {
        new Main();
    }
}
