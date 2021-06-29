/*public class Main extends Thread{
    public static void main(String[] args) {
        Main nt=new Main();
        System.out.println(nt);
        Thread t=Thread.currentThread();
        System.out.println(t);
        nt.start();
        try{
            //Thread.sleep(1000);
            nt.join();
            System.out.println("Main thread");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void run(){
        Thread t=Thread.currentThread();
        System.out.println(t);
        System.out.println("Child thread");
    }
}*/


// q1

/*public class Main extends Thread{
    Main(){
        System.out.println("Start up");
    }
    public static void main(String[] args) {
        Main nt=new Main();
        nt.start();
        for(int i=0;i<3;i++){
            System.out.println("Main thread");
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
    public void run(){
        for(int i=0;i<3;i++){
            Thread t=Thread.currentThread();
            System.out.println(t);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}*/

//q2
/*public class Main implements Runnable{
    Main(){
        System.out.println("Start up");
    }
    public static void main(String[] args) {
        Main n=new Main();
        Thread nt=new Thread(n);
        Main n1=new Main();
        Thread nt1=new Thread(n1);
        Main n2=new Main();
        Thread nt2=new Thread(n2);
        nt.start();
        nt1.start();
        nt2.start();
        for(int i=0;i<3;i++){
            System.out.println("Main thread");
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
    public void run(){
        for(int i=0;i<3;i++){
            Thread t=Thread.currentThread();
            System.out.println(t);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}*/


// q3
/*public class Main extends Thread{
    Main(){
        System.out.println("Start up");
    }
    public static void main(String[] args) {
        Main nt=new Main();
        Main nt1=new Main();
        Main nt2=new Main();
        Main nt3=new Main();
        Main nt4=new Main();
        nt.setPriority(2);
        nt1.setPriority(1);
        nt2.setPriority(7);
        nt3.setPriority(3);
        nt4.setPriority(5);
        nt.start();
        nt1.start();
        nt2.start();
        nt3.start();
        nt4.start();
        for(int i=0;i<3;i++){
            System.out.println("Main thread");
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
    public void run(){
        for(int i=0;i<3;i++){
            Thread t=Thread.currentThread();
            System.out.println(t);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}*/


//q4
/*public class Main implements Runnable{
    Main(){
        System.out.println("Start up");
    }
    public static void main(String[] args) {
        Main n=new Main();
        Main n1=new Main();
        Main n2=new Main();
        Main n3=new Main();
        Main n4=new Main();
        Thread nt=new Thread(n);
        Thread nt1=new Thread(n1);
        Thread nt2=new Thread(n2);
        Thread nt3=new Thread(n3);
        Thread nt4=new Thread(n4);
        nt.setPriority(2);
        nt1.setPriority(1);
        nt2.setPriority(7);
        nt3.setPriority(3);
        nt4.setPriority(5);
        nt.start();
        nt1.start();
        nt2.start();
        nt3.start();
        nt4.start();
        for(int i=0;i<3;i++){
            System.out.println("Main thread");
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
    public void run(){
        for(int i=0;i<3;i++){
            Thread t=Thread.currentThread();
            System.out.println(t);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}*/

// q5
/*public class Main implements Runnable{
    static Main s=new Main();
    public static void main(String[] args) {
        Thread t1=new Thread(s);
        t1.setName("First");
        Thread t2=new Thread(s);
        t2.setName("Second");
        Thread t3=new Thread(s);
        t3.setName("Third");
        Thread t4=new Thread(s);
        t4.setName("Fourth");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
    public void run(){
        call();
    }
    synchronized void call(){
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}*/


// q6
public class Main extends Thread{
    public static void main(String[] args) {
        Main t1=new Main();
        Main t2=new Main();
        t1.start();
        System.out.println(t1.isAlive());
        try{
            t1.join();
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println(t1.isAlive());
        t2.start();
        System.out.println(t2.isAlive());
        try{
            t2.join();
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println(t2.isAlive());
    }
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName());
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}


// q7
/*public class Main extends Thread{
    int n;
    boolean valueSet = false;
    synchronized void put(int n){ //For producer
        if(valueSet)
            try {
                Thread.sleep(1000);
                wait();
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        this.n = n;
        valueSet = true;
        System.out.println("Put: " + n);
        notify();
    }
    synchronized void get(){ //For Consume
        if(!valueSet)
            try {
                Thread.sleep(1000);
                wait();
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        System.out.println("Got: " + n);
        valueSet = false;
        notify();
    }
    public static void main(String args[]){
        System.out.println("Press Control-C to stop the thread");
        Main q = new Main();
        Thread t1=new Thread(){
            public void run(){
                int i = 0;
                while(true)
                    q.put(i++); //0
            }
        };
        Thread t2=new Thread(){
            public void run(){
                while(true)
                    q.get();
            }
        };
        t1.start();
        t2.start();
    }
}*/


// deadlock

/*public class Main extends Thread {
    public static void main(String[] args) {
        String resource1="resource1";
        String resource2="resource2";
        Thread X = new Thread() {
            public void run() {
                synchronized (resource1) {
                    System.out.println("Thread 1 locked resource 1");
                    synchronized (resource2) {
                        System.out.println("Thread 1 tries to locked resource 2");
                    }
                }
            }
        };
        Thread Y = new Thread() {
            public void run() {
                synchronized (resource2) {
                    System.out.println("Thread 2 locked resource 2");
                    synchronized (resource1) {
                        System.out.println("Thread 2 tries to locked resource 1");
                    }
                }
            }
        };
        X.start();
        Y.start();
    }
}*/


// daemon thread

/*public class Main extends Thread{
    public void run(){
        if(Thread.currentThread().isDaemon()){	//checking for daemon thread
            try{
                for(int i=0;i<50;i++){
                    System.out.println("Daemon thread work");
                    Thread.sleep(1000);
                }
            }catch(Exception e){}
        }else{
            try{
                for(int i=0;i<50;i++){
                    System.out.println("User thread work");
                    Thread.sleep(1000);
                }
            }catch(Exception e){}
        }
    }
    public static void main(String[] args){
        Main t1=new Main(); //Creating threads
        Main t2=new Main();
        t1.setDaemon(true);	//now t1 is daemon thread
        //Starting Threads
        t1.start();
        t2.start();
        //System.out.println(t1.getPriority());
    }
}*/
















