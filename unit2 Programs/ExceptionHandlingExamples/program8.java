package ExceptionHandlingExamples;

/*
 * We have to use multiple try catch block.
 * Since , one exception does not depend on other exception
 */

public class program8 {
    public static void main(String[] args) {
        try {
            int a =10,b=0;
            System.out.println("Result of Division is ="+(a/b));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        try {
            int arr[] = {10,20,30,40,50};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}

/* Hence able to add more than one try catch block
 *(For simplicity always try to use one try-catch block)
 *multiple try-catch leads to ambiguity
 * / by zero
 *Index 5 out of bounds for length 5
 */
