package ExceptionHandlingExamples;
/*
 * 
 * Program 2
 * Exception : we will keep the risky code inside the try block.
 * Then we will also implement the catch block , and will print the
 * message behind the exception.
 * We will lead the program to a successful termination by
 * exception handling
 */
public class program2{
    public static void main(String[] args) {
        try{
            int a =10, b=0;
            int c = a/b;
        }catch(Exception e){
            System.out.println("Raised :"+e.getMessage());
        }
        
        System.out.println("Successful termination of the program");
    }

}

// Output:
// Raised :/ by zero
// Successful termination of the program