package MultiThreading;

class A3 extends Thread{
    public void run(){
        System.out.println("Thread 1 is running");
    }
}

class B3 extends Thread{
    public void run(){
        System.out.println("Thread 2 is running");
    }
}

class C3 extends Thread{
    public void run(){
        System.out.println("Thread 3 is running");
    }
}


public class program4 {
    public static void main(String[] args) {
        A3 p = new A3();
        B3 q = new B3();
        C3 r = new C3();

        p.setPriority(Thread.MIN_PRIORITY);
        //we wand that Thread q runs after Thread r
        //that means must have the priority more than p
        q.setPriority(p.getPriority()+1);
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