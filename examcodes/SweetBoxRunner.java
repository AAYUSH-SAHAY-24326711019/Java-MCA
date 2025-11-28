class SweetBox { 
int sweets; 
SweetBox(int sweets) { this.sweets = sweets; } 
synchronized void eatSweet(String name) { 
if (sweets > 0) { 
System.out.println(name + " ate a sweet."); 
sweets--; 
System.out.println("Sweets left: " + sweets); 
} else { 
System.out.println("No sweets left for " + name); 
} 
} 
} 
class Student extends Thread { 
SweetBox box; 
Student(String name, SweetBox box) { 
super(name); 
this.box = box; 
} 
public void run() { 
box.eatSweet(getName()); 
} 
} 
public class SweetBoxRunner { 
public static void main(String[] args) { 
SweetBox box = new SweetBox(2); 
Student A = new Student("A", box); 
Student B = new Student("B", box); 
Student C = new Student("C", box); 
A.start(); 
B.start(); 
C.start();
} 
} 