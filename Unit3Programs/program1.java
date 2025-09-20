package Unit3Programs;

/*
 * program on multi threading using java
 * time sharing , same program multiple threads run at the 
 * same time. When any game , multiple things happening at
 * same time, run parallel , share resources , will
 * be considered as a light weight process , smallest unit 
 * of a program
 * 
 * java lets you make threads , other frameworks just keep
 * you away and on building the software , it has many
 * underlying threads.
 * 
 * main will go to run the next statement until its early 
 * statement is completed.
 * make 2 classes and make them to print 5 times hello and hy
 * make them extends the thread class so that they now become thread
 * to make them run into parallel,main will be fifo manner 
 * executing its functions.To run in parallely.
 * 
 * start() calls run() so the show function earlier got replaced
 * with the run method
 * 
 * 
 */

class A extends Thread{
    public void run(){
        for(int i=0; i<=10;i++){
            System.out.println("Hello [Printed"+i+"]times");
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i=0; i<=10;i++){
            System.out.println("Hy [Printed"+i+"]times");
        }
    }
}

public class program1{
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        try{
            obj1.start();
            obj1.sleep(150);
            obj2.start();
            obj2.sleep(150);
        }catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
        
    }
 }