package LoopStructures;
import java.util.Scanner;
public class factorial {
    public static void main(String args[]){
        Scanner z = new Scanner(System.in);
        int n, i,f=1;
        System.out.println("Enter a number ->");
        n= z.nextInt();
        if(n==0 || n<0){
            System.out.println("Factorial =1");
        }
        else{
        for(i=1; i<=n;i++){
            f=f*i;
        }
        System.out.println("Factorial value = "+f);
    }
    }
}
// Test 1
//Enter a number ->
// 5
// Factorial value = 120

//Test 2
//Enter a number ->
// 0
// Factorial =1

//Test 3
// Enter a number ->
// -4
// Factorial =1