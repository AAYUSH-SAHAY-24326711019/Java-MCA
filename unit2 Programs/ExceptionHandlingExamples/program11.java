package ExceptionHandlingExamples;

import java.util.Scanner;

class MyTestException extends Exception{
    public MyTestException(String msg){
        super(msg);
    }
}

public class program11 {
    public static void main(String[] args) {
        int choice=0;
        Scanner z = new Scanner(System.in);
        try {
            while(true){
            System.out.println("1. Press 1 to throw the User made exception :");
            choice=z.nextInt();
            if(choice==1)
                throw new MyTestException("User Made Exception");
            else
                System.out.println("Exiting the program");
        }
        } catch (MyTestException e) {
            System.out.println(e.getMessage());
        }
        catch(Exception m){
            System.out.println(m.getMessage());
        }
       

    }
}
/*output */
// 1. Press 1 to throw the User made exception :
// 0
// Exiting the program
// 1. Press 1 to throw the User made exception :

// 1
// User Made Exception