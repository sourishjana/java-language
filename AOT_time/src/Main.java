import java.time.LocalTime; // import the LocalTime class

public class Main {
    public static void main(String[] args) throws InterruptedException {
        for (;;) {
            LocalTime myObj = LocalTime.now();
            System.out.println(myObj);
            Thread.sleep(1000);
        }

    }
}