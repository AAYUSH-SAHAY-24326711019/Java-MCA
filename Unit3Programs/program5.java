package Unit3Programs;
//use of the join keyword in java
 //join will pause the execution of the current thread until and unless the other thread
 //is dead

 //Use of the synchronised keyword. It will put a lock such that one thread is able to be
 //access the variable at single time.

public class program5 {
    private static int count = 0;
    public static synchronized void inccount(){
        count++;
    }
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable(){
            @Override
            public void run(){
                for(int i =0; i<=10000; i++){
                    //count++;
                    inccount();
                }
            }
        });

        Thread t2 = new Thread(new Runnable(){
            @Override
            public void run(){
                for(int i =0; i<=10000; i++){
                    count++;
                }
            }
        });
        t1.start();
        t2.start();
        //output : 0 

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        //both threads are sharing the static variable count
        System.out.println("value : "+count);
    }
}
