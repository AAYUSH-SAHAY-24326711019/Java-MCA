package ExceptionHandlingExamples;

public class program7 {
    public static void main(String[] args) {
        try{
            int a =10, b=0;
            System.out.println("Result ="+(a/b));
            // 1. we will throw ArithematicException
        }catch(NullPointerException e){
            //2. but we are trying to catch the null pointer exception.
            //3. Since, exception thrown by the try block is incompatible
            //4. will not lead to the running of finally block
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Finally block code runs");
        }
        System.out.println("Code of main method");
    }
}
/*
 * output
 * / by zero
Finally block code runs
Code of main method  
 */
