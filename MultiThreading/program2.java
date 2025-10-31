package MultiThreading;
import java.lang.Thread;
import java.lang.Runnable;

class A1 implements Runnable{
    @Override
    public void run(){
        for(int i = 0; i<10; i++){
            System.out.println(i);
        }
        System.out.println("exit from A");
    }
}

class B1 implements Runnable{
    @Override
    public void run(){
        for(int i = 0; i<10; i++){
            System.out.println(i);
        }
        System.out.println("exit from B");
    }
}

public class program2 {
    public static void main(String[] args) {
        A1 a1=new A1();
        B1 b1=new B1();
        Thread t1 = new Thread(a1);
        Thread t2 = new Thread(b1);
        t1.start();
        t2.start();
    }
}
