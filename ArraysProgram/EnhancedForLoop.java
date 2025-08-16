package ArraysProgram;
import java.util.Scanner;
public class EnhancedForLoop {
    
    public static void main(String args[]){
         Scanner z = new Scanner(System.in);
        int n[]; //creating a null / empty array
        int i,size;
        System.out.println("Specify Array Size :");
        size = z.nextInt();
        n=new int[size];

        System.out.println("Enter "+n.length+" values");
        for(i=0;i<size;i++){
            n[i]=z.nextInt();
        }
        System.out.println("Values inside the array");
        for(int m : n){
            System.out.println(m);
        }
    }
}
// Test 1
// Specify Array Size :
// 5
// Enter 5 values
// 1
// 2
// 3
// 4
// 5
// Values inside the array
// 1
// 2
// 3
// 4
// 5
