package WrapperClassExample;

import java.util.Scanner;

public class program1 {
    public static void main(String args[]){
        Scanner z = new Scanner(System.in);
        Integer a,b;
        System.out.println("User, Enter 2 numbers:");
        a= z.nextInt();
        b=z.nextInt();
        System.out.print("The sum is ="+(a+b)+"\n");

        String name ;
        name = z.next();
        System.out.printf("User, Your name is %s",name);

    }
}
// Test 1
// User, Enter 2 numbers:
// 10
// 20
// The sum is =30
// Aayush Sahay
// User, Your name is Aayush