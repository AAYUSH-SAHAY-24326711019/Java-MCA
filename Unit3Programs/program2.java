package Unit3Programs;

class MyClass extends Thread{
    @Override
    public void run(){
        for(int i =1; i<=10;i++){
            System.out.println("value :"+i+" Thread id"+Thread.currentThread().threadId());
        }
        //3. code for adding the concurrency in thread execution
        try{ // to pause a thread , exception handling is required.
        Thread.sleep(100); // will pause the method in 500 ms
        }catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}

public class program2{
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.start(); // creates the thread and auto. calls run()
        //how to know it [we make a new instance (thread) and run them parallely]
        MyClass myClass1 = new MyClass();
        myClass1.start();
        //1. running the above code will sequentially call the run() for thread.

        //2. code below to check the concurrency , check 3
    } 
}
/*output
 * value :1 Thread id21
value :2 Thread id21
value :1 Thread id20
value :2 Thread id20
value :3 Thread id21
value :3 Thread id20
value :4 Thread id21
value :5 Thread id21
value :4 Thread id20
value :6 Thread id21
value :7 Thread id21
value :5 Thread id20
value :6 Thread id20
value :8 Thread id21
value :9 Thread id21
value :10 Thread id21
value :7 Thread id20
value :8 Thread id20
value :9 Thread id20
value :10 Thread id20
 */