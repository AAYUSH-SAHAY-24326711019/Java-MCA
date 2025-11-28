class Buffer { 
private int data; 
private boolean hasData = false; 
public synchronized void produce(int value) { 
try { 
while (hasData) 
wait(); 
data = value; 
System.out.println("Produced: " + data); 
hasData = true; 
notify(); 
} catch (Exception e) {} 
    } 
 
    public synchronized int consume() { 
        int value = 0; 
        try { 
            while (!hasData) 
                wait(); 
 
            value = data; 
            System.out.println("Consumed: " + value); 
            hasData = false; 
 
            notify(); 
        } catch (Exception e) {} 
 
        return value; 
    } 
} 
 
class Producer extends Thread { 
    Buffer b; 
    Producer(Buffer b) { this.b = b; } 
 
    public void run() { 
        for (int i = 0; i <= 5;) { 
            b.produce(i); 
        } 
    } 
} 
 
class Consumer extends Thread { 
    Buffer b; 
    Consumer(Buffer b) { this.b = b; } 
 
    public void run() { 
        for (int i = 1; i <= 6; i++) { 
            b.consume(); 
        } 
    } 
} 
 
public class ProducerConsumer { 
    public static void main(String[] args) { 
        Buffer b = new Buffer(); 
        new Producer(b).start(); 
        new Consumer(b).start(); 
    } 
} 