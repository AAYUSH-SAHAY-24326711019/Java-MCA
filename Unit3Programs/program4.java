package Unit3Programs;

//Create the thread without making any extra class

import java.util.concurrent.RunnableFuture;

public class program4 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            // give the code here for printing the values
            @Override
            public void run(){
                 for(int i =1; i<=5; i++){
                    System.out.println("["+Thread.currentThread().threadId()+"] Value : "+i);
                 }
                 try{
                    Thread.sleep(500);
                 }catch(InterruptedException e){
                    System.out.println(e.getMessage());
                 }
            }
        }); t1.start();

        Thread t2 = new Thread(new Runnable() {
            // give the code here for printing the values
            @Override
            public void run(){
                 for(int i =1; i<=5; i++){
                    System.out.println("["+Thread.currentThread().threadId()+"] Value : "+i+"HelloWorld");
                 }
                 try{
                    Thread.sleep(800);
                 }catch(InterruptedException e){
                    System.out.println(e.getMessage());
                 }
            }
        }); t2.start();

    }
}
/*Output */
// [20] Value : 1
// [20] Value : 2
// [21] Value : 1HelloWorld
// [20] Value : 3
// [21] Value : 2HelloWorld
// [20] Value : 4
// [20] Value : 5
// [21] Value : 3HelloWorld
// [21] Value : 4HelloWorld
// [21] Value : 5HelloWorld