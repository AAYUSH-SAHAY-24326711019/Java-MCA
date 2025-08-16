package ArraysProgram;
import java.util.Scanner;
public class BasicArray {
    public static void main(String args[]){
        Scanner z = new Scanner(System.in);
        int n[]= new int[5];
        int i;
        System.out.println("Enter "+n.length+" values");
        for(i=0;i<n.length;i++){
            n[i]=z.nextInt();
        }
        System.out.println("Values inside the array");
        for(i=0;i<n.length;i++){
            System.out.println(n[i]);
        }
    }
}
/*
Enter 5 values
1
2
3
4
5
Values inside the array
1
2
3
4
5
 */