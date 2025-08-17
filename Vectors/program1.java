package Vectors;
import java.util.Scanner;
import java.util.Vector;
public class program1 {
    public static void main(String args[]){
        // vector has no index.
        //1. Vector obj = new Vector(); one by one allocate memory(Slow)
        //2. Vector obj = new Vector(size); allocate at once , fast , chance
        //of memory wastage
        Vector v = new Vector();
        //it is a hetrogeneous list/collection of objects
        v.addElement("Aayush");
        v.addElement(128.46);
        v.addElement(true);
        v.addElement(156);

        System.out.println("Display elements using for each");
        for(Object z : v){
            System.out.println(z);
        }

        System.out.println("Display elements using for loop");
        for(int i = 0; i<v.size();i++){
            System.out.println(i+" "+v.elementAt(i));
        }

        System.out.println("Insert value at second index");
        v.insertElementAt("New-Value-At index", 2);
        System.out.println("New list becomes: ");
        for(int i = 0; i<v.size();i++){
            System.out.println(i+" "+v.elementAt(i));
        }

        System.out.println("Remove all values");
        v.removeAllElements();
        System.out.println("New list becomes: ");
        for(int i = 0; i<v.size();i++){
            System.out.println(v.elementAt(i));
        }

    }
}
//Test 1
// Display elements using for each
// Aayush
// 128.46
// true
// 156
// Display elements using for loop
// 0 Aayush
// 1 128.46
// 2 true
// 3 156
// Insert value at second index
// New list becomes: 
// 0 Aayush
// 1 128.46
// 2 New-Value-At index
// 3 true
// 4 156
// Remove all values
// New list becomes: