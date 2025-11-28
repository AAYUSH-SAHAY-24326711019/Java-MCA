public class Yield extends Thread { 
public Yield(String name) { 
super(name); 
} 
public void run() { 
for (int i = 1; i <= 5; i++) { 
System.out.println(getName() + " " + i); 
Thread.yield();   
// Suggest CPU to switch threads 
} 
} 
public static void main(String[] args) { 
Yield t1 = new Yield("1,"); 
Yield t2 = new Yield("2,"); 
t1.start(); 
t2.start(); 
} 
} 
