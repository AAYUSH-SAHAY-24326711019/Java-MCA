class MyTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Task running: " + Thread.currentThread().getName());
    }
}

public class Demo {
    public static void main(String[] args) {
        Runnable r = new MyTask();
        Thread t = new Thread(r);
        Thread t2 = new Thread(r);
        Thread t3 = new Thread(r);
        t.start();
        t2.start();
        t3.start();
    }
}