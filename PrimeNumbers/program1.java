package PrimeNumbers;
import java.util.Scanner;
public class program1 {
    public static void main(String args[]){
        Scanner z = new Scanner(System.in);
        System.out.println("Enter a number to check prime:");
        int num = z.nextInt();
        boolean isPrime=true;
        if(num<=1)
            isPrime=false;
        else
            for(int i=2; i*i<=num;i++){
                if(num%i==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime==true)
                System.out.println("The number :"+num+" is prime number");
            else
                System.out.println("The number :"+num+" is not prime number");
    }
}
//Test 1
// PS C:\Users\Dell\Desktop\Java-MCA\PrimeNumbers> java .\program1.java
// Enter a number to check prime:
// 4
// The number :4 is not prime number
//Test 2
// PS C:\Users\Dell\Desktop\Java-MCA\PrimeNumbers> java .\program1.java
// Enter a number to check prime:
// 2
// The number :2 is prime number