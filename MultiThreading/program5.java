package MultiThreading;
import java.lang.Thread;

class Resource{
    int i;
    synchronized public void show(){
        for(i=0;i<=10;i++){
            System.out.println(i);
        }
        System.out.println("Outside Resource.show();");
    }
}

class A4 extends Thread{
    Resource r = null;
    public A4(Resource t){
        r= t;
    }
    public void run(){
        r.show();
    }
}

class B4 extends Thread{
    Resource r = null;
    public B4(Resource t){
        r= t;
    }
    public void run(){
        r.show();
    }
}

public class program5 {
    public static void main(String[] args) {
        Resource z =new Resource();
        A4 p = new A4(z);
        B4 q = new B4(z);
        p.start();
        q.start();
        
    }
}
