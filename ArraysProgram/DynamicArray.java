package ArraysProgram;
import java.util.Scanner;
public class DynamicArray {
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
        for(i=0;i<size;i++){
            System.out.println(n[i]);
        }
    }
}

//Test 1
// Specify Array Size :
// 3
// Enter 3 values
// 1
// 2
// 3
// Values inside the array
// 1
// 2
// 3
