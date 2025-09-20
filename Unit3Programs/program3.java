package Unit3Programs;

//Making a program using Runnable interface

class MyClass2 implements Runnable{
//1. we need to make our class to inherit the interface Runnable
    @Override
    public void run(){
        //1.1 printing the values 1 to 5 and also the thread id.
        for(int i =1; i<=5; i++){
            System.out.println("Value"+i+" Thread id : "+Thread.currentThread().threadId());
        }
        try{Thread.sleep(100);
        
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}

public class program3 {
    public static void main(String[] args) {
        //2. make the object of the thread
            //2.1  we will pass the object created at runtime as the argument to it
            // That will be made by new keyword and the constructor of the class MyClass2
        Thread t1 = new Thread(new MyClass2());
        Thread t2 = new Thread(new MyClass2());
        t1.start();
        t2.start();
    }
}
/*Output
 * 
Value1 Thread id : 20
Value2 Thread id : 20
Value1 Thread id : 21
Value3 Thread id : 20
Value4 Thread id : 20
Value2 Thread id : 21
Value5 Thread id : 20
Value3 Thread id : 21
Value4 Thread id : 21
Value5 Thread id : 21
 */