package PrimeNumbers;
import java.util.Scanner;
public class program2 {
    public static void main(String args[]){
        Scanner z = new Scanner(System.in);
        System.out.println("Enter a number (generate prime no. before it):");
        int num = z.nextInt();
        boolean isPrime;
        
        for(int i=2; i<=num;i++){
            isPrime=true;
            for(int j=2;j*j<=i;j++){
                if(i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime==true)
                System.out.print(" "+i);
        }

    }
}
//Test 1
// Enter a number (generate prime no. before it):
// 10
//  2 3 5 7
