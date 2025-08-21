package MethodsUnderCollections;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
public class program1 {
    public static void main(String args[]){
        List<Integer> z = new ArrayList<Integer>();
        System.out.println("\nAdding to the ArrayList z as :\nz.add(10); z.add(20);");
        z.add(10); z.add(20);
        System.out.println("\\n" + //
                        "Adding many values at once:\nCollections.addAll(z,30,40,50,70,60,80,100,90);\r\n" + //
                        "");
        Collections.addAll(z,30,40,50,70,60,80,100,90);
        System.out.println("The List becomes like : \n");
        for(Integer m : z){
            System.out.print(m+" ");
        }
        System.out.println("\\n" + //
                        "Sorting the ArrayList using:\nCollections.sort(z);");
        Collections.sort(z);
        System.out.println("The List becomes like : \n");
        for(Integer m : z){
            System.out.print(m+" ");
        }
        System.out.println();
        System.out.println("\\n" + //
                        "Reversing the list as :\nCollections.reverse(z);");
        Collections.reverse(z);
        System.out.println("The List becomes like : \n");
        for(Integer m : z){
            System.out.print(m+" ");
        }
        System.out.println();
        System.out.println("\\n" + //
                        "The minimum of the ArrayList is "+Collections.min(z));
        System.out.println("\\n" + //
                        "The maximum of the ArrayList is "+Collections.max(z));

        System.out.println("\n In requrirement to find the element 100's index :\nint idx = Collections.binarySearch(z,100);");
        int idx = Collections.binarySearch(z,100);
        System.out.println("The index value is :"+idx);



    }
}
// Test1
// PS C:\Users\Dell\Desktop\Java-MCA\MethodsUnderCollections> java .\program1.java

// Adding to the ArrayList z as :
// z.add(10); z.add(20);
// \nAdding many values at once:
// Collections.addAll(z,30,40,50,70,60,80,100,90);

// The List becomes like :

// 10 20 30 40 50 70 60 80 100 90 
//Sorting the ArrayList using:
// Collections.sort(z);
// The List becomes like :
// 10 20 30 40 50 60 70 80 90 100
// \nReversing the list as :
// Collections.reverse(z);
// The List becomes like :

// 100 90 80 70 60 50 40 30 20 10
// \nThe minimum of the ArrayList is 10
// \nThe maximum of the ArrayList is 100

//  In requrirement to find the element 100's index :
// int idx = Collections.binarySearch(z,100);
// The index value is :-11