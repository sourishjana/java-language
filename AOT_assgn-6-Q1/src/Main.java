class A{
    {
        System.out.println("Instance A");
    }
    {
        System.out.println("Instance B");
    }
}

class B extends A{
    {
        System.out.println("1st instance init");
    }

    {
        System.out.println("2nd instance init");
    }

    static
    {
        System.out.println("2nd static init");
    }

    public static void main(String[] args)
    {
        new B();
    }
}
