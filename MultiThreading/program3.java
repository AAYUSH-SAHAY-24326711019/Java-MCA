package MultiThreading;

class A2 extends Thread{
    public void run(){
        System.out.println("Thread 1 is running");
    }
}

class B2 extends Thread{
    public void run(){
        System.out.println("Thread 2 is running");
    }
}

class C2 extends Thread{
    public void run(){
        System.out.println("Thread 3 is running");
    }
}


public class program3 {
    public static void main(String[] args) {
        A2 p = new A2();
        B2 q = new B2();
        C2 r = new C2();

        p.setPriority(Thread.MIN_PRIORITY);
        q.setPriority(Thread.NORM_PRIORITY);
        r.setPriority(Thread.MAX_PRIORITY);

        p.start();
        q.start();
        r.start();
    }
}
/*output
 * 
Thread 3 is running
Thread 2 is running
Thread 1 is running
 */