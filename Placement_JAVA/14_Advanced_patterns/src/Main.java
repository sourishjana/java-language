import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();
        BasicPattern1 a=new BasicPattern1();
        a.show(n);

        System.out.println();

        BasicPattern2 b=new BasicPattern2();
        b.show(n);

        System.out.println("pascal star");

        AdvancedPattern1 c=new AdvancedPattern1();
        c.show(n);
        System.out.println();
        c.show1(n);

        System.out.println("pascal triangle :");

        AdvancedPattern2 d=new AdvancedPattern2();
        d.show(n);

        System.out.println();

        AdvPattern3 e=new AdvPattern3();
        e.show(n);

        System.out.println();

        AdvPattern4 f=new AdvPattern4();
        f.show(n);
    }
}
