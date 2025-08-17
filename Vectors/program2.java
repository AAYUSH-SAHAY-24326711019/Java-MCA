package Vectors;

import java.util.Vector;
public class program2 {
    public static void main(String args[]){
        
        Vector v = new Vector();
        //it is a hetrogeneous list/collection of objects
        v.addElement("Aayush");
        v.addElement(128.46);
        v.addElement(true);
        v.addElement(156);

        System.out.println("Display elements using for loop");
        for(int i = 0; i<v.size();i++){
            System.out.println(i+" "+v.elementAt(i));
        }
        //removal : Since it does not work on the principle of index.
        // it will search the list then remove the element.

       System.out.println("Removing object 156");
       v.removeElement(156);
       System.out.println("Display elements using for loop"); 
        for(int i = 0; i<v.size();i++){
           System.out.println(i+" "+v.elementAt(i));
        }

        System.out.println("Removing all from vector");
       v.removeAllElements();
       System.out.println("Display elements using for loop"); 
        for(int i = 0; i<v.size();i++){
           System.out.println(i+" "+v.elementAt(i));
        }
    }
}
//Test 1
/*
Display elements using for loop
0 Aayush
1 128.46
2 true
3 156
Removing object 156
Display elements using for loop
0 Aayush
1 128.46
2 true
 */

 /*
Display elements using for loop
0 Aayush
1 128.46
2 true
3 156
Removing object 156
Display elements using for loop
0 Aayush
1 128.46
2 true
Removing all from vector
Display elements using for loop
  */