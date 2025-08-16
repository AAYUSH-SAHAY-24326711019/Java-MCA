package LoopStructures;
import java.util.Scanner;
public class NoOfDigits {
    public static void main(String args[]){
        Scanner z =new Scanner(System.in);
        boolean flag = true;
        int num=0; //number of digits
        System.out.println("Enter the number");
        int inp = z.nextInt();
        int inp1=inp;
        while(flag){

            if(inp1==0){
                System.out.println("No. of digits in "+inp+" ="+1);
                break;
            }

            inp1=inp1/10;
            num=num+1;
            if(inp1==0)
                flag=false;
        }
        if(flag==false)
            System.out.println("No. of digits in "+inp+" ="+num);

       
}
}
// Test 1
//Enter the number
// 4444
// No. of digits in 4444 =4

//Test 2
//Enter the number
// 0
// No. of digits in 0 =1