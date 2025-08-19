// program to show the autoboxing , unboxing using Wrapper Classes
package WrapperClassExample;
import java.util.Scanner;

public class program2 {
    public static void main(String args[]){
        //convert the int to Integer 
        //Autoboxing : Convert primitive data type to the Wrapper class
        int x=10;
        Integer p = Integer.valueOf(x);
        System.out.println("The autoboxing [int to Integer] led p ="+p);


        //convert the Integer to int
        //Unboxing : Convert the Wrapper Class to the primitive Data
        Integer x1=20;
        int p1 = Integer.valueOf(x1);
        System.out.println("The unboxing [Integer to int] led p1 ="+p1);

    }   
}
// Test1
// The autoboxing [int to Integer] led p =10
// The unboxing [Integer to int] led p1 =20

