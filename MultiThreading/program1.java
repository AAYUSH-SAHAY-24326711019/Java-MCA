package MultiThreading;
import java.lang.Thread;

class A extends Thread{
    public void run(){
        for(int i=1; i<100;i=i*2){
            System.out.println(i);
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i=1; i<10;i++){
            System.out.println(i);
        }
    }
}


class program1{
    public static void main(String[] args) {
        A objA = new A();
        B objB = new B();
        objA.start();
        objB.start();
    }
}