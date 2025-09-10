package ExceptionHandlingExamples;
/*
 * 
 * Program 1 
 * Exception : unwanted / abnormal situation led to premature termination of program
 * To find the exception
 */
public class program1 {
    public static void main(String[] args) {
        int a =10, b=0;
        int c = a/b;
        System.out.println("Reached the end of program");
    }

}

// Output:
// PS C:unit2Programs\ExceptionHandlingExamples> java .\program1.java
// Exception in thread "main" java.lang.ArithmeticException: / by zero 
//         at ExceptionHandlingExamples.program1.main(program1.java:11)