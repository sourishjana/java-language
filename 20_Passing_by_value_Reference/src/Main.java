public class Main {
    int data=20;
    void change(int data){
        data=data+10;
    }

    void change(Main op){
        op.data=op.data+10;
    }

    public static void main(String[] args) {
        Main x=new Main();
        System.out.println(x.data);
        x.change(20);  // change by value
        System.out.println(x.data);
        x.change(x);  // change by reference
        System.out.println(x.data);
    }
}
