package ExceptionHandlingExamples;

//illustrates the idea of finally block
public class program10 {
    public static void main(String[] args) {
        try {
            int a=10,b=0;
            System.out.println("Division of A and B gives :"+(a/b));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
       finally{
         System.out.println("Bye");
       }
    }
}

/*Output : The program ends with executing code in the finally block. */
//Then list out the exception behind that
// Bye
// Exception in thread "main" java.lang.ArithmeticException: / by zero