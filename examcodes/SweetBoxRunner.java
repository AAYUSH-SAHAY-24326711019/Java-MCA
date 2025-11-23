import java.util.*;

class SweetBox {
    private int nSweet;

    public SweetBox(int nSweet) {
        this.nSweet = nSweet;
    }

    // synchronized method so only one student can eat at a time
    public void eatSweet(String sName) {
        synchronized (this) {
            if (nSweet > 0) {
                System.out.println(sName + " is eating 1 sweet...");
                nSweet--;
                
                try { Thread.sleep(500); } catch (Exception e) {}
                
                System.out.println("Sweets left: " + nSweet);
            } else {
                System.out.println("No sweets left for " + sName);
                
            }
        }
    }
}

class Student implements Runnable {
    SweetBox box;

    public Student(SweetBox box) {
        this.box = box;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();

        while (true) {
            box.eatSweet(name);

            try { Thread.sleep(300); } catch (Exception e) {}

            // if no sweets left, stop eating
            if(Thread.interrupted())
                 break;
        }
    }
}

public class SweetBoxRunner {

    public static void main(String[] args) {
        
        SweetBox box = new SweetBox(5);

        Student s = new Student(box);

        Thread A = new Thread(s);
        A.setName("A");

        Thread B = new Thread(s);
        B.setName("B");

        A.start();
        B.start();

        try { 
            A.join();
            B.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
