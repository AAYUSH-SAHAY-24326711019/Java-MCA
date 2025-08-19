package Set_HashSets;

import java.util.HashSet;
import java.util.Set;
// set can contain a hash set.
//How to do that
public class program2 {
    public static void main(String args[]){
        Set<Integer> s = new HashSet<Integer>();
    for(int i=10;i<=100;i=i+10){
        s.add(i);
    }
    System.out.println(s);
    }
}

// Test1
// [80, 50, 20, 100, 70, 40, 10, 90, 60, 30]
