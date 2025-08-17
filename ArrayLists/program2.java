package ArrayLists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class program2 {
    public static void main(String args[]){
        System.out.println("Adding Elements in an ArrayList (unsorted manner)");
        ArrayList<Integer> z = new ArrayList<Integer>();
        z.add(10);
        z.add(30);
        z.add(50);
        z.add(20);
        z.add(40);
        System.out.println("Displaying the unsorted ArryList");
        for(int i=0; i<z.size();i++){
            System.out.print("{"+i+"|"+z.get(i)+"} ");
        }
        System.out.println("Sorting by Collections.sort(z) and displaying");
        Collections.sort(z);
        for(int i=0; i<z.size();i++){
            System.out.print("{"+i+"|"+z.get(i)+"} ");
        }
    }
}
// Test 1
// Adding Elements in an ArrayList (unsorted manner)
// Displaying the unsorted ArryList
// {0|10} {1|30} {2|50} {3|20} {4|40} 
// Sorting by Collections.sort(z) and displaying
// {0|10} {1|20} {2|30} {3|40} {4|50}