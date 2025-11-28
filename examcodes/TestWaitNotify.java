class WaitNotifyDemo { 
    synchronized void process() { 
        try { 
            System.out.println("Thread waiting..."); 
            wait();  // releases lock 
            System.out.println("Thread resumed after notify"); 
        } catch (Exception e) {} 
    } 
 
    synchronized void resumeProcess() { 
        System.out.println("Notifying waiting thread..."); 
        notify(); 
    } 
} 
 
class Worker1 extends Thread { 
    WaitNotifyDemo obj; 
    Worker1(WaitNotifyDemo obj) { this.obj = obj; } 
 
    public void run() { 
        obj.process(); 
    } 
} 
 
class Worker2 extends Thread { 
    WaitNotifyDemo obj; 
    Worker2(WaitNotifyDemo obj) { this.obj = obj; } 
 
    public void run() { 
        try { Thread.sleep(2000); } catch(Exception e){} 
        obj.resumeProcess(); 
    } 
} 
public class TestWaitNotify { 
public static void main(String[] args) { 
WaitNotifyDemo wn = new WaitNotifyDemo(); 
new Worker1(wn).start(); 
new Worker2(wn).start(); 
} 
} 