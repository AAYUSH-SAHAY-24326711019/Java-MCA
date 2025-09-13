package ExceptionHandlingExamples;

import java.util.Scanner;

/*
 * Program to show the use of the multiple catch block
 */
public class program9 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        int choice =0; 
        boolean key =true;
        while(key){
            System.out.println("==User follow to perform ==:");
            System.out.println("1. to Divide 2 number.");
            System.out.println("2. To access elements from an array");
            System.out.println("3. To convert lcase string to ucase");
            System.out.println("PRESS 0 to exit");
            System.out.println("==User provide choice==   "); choice =z.nextInt();
            try{
                switch(choice){
                case 0: key = false; System.out.println("exiting program ..."); break;

                case 1:
                    int a,b;
                    System.out.println("Give a:"); a=z.nextInt();
                    System.out.println("Give b:"); b=z.nextInt();
                    System.out.println("Division result : "+(a/b));
                break;

                case 2:
                    int arr[]={10,20,30,40,50};
                    System.out.println("\nint arr[]={10,20,30,40,50};\n");
                    System.out.println("See the above array , give index from 0 to"+(arr.length-1)+"=>");
                    int idx = z.nextInt();
                    System.out.println("Value at index("+idx+"),arr["+idx+"] = "+arr[idx]);
                break;

                case 3:
                    String userString = null;
                    System.out.println("User give a string in lcase =>");
                    //userString=z.next();
                    System.out.println("Converted string into UCASE : "+userString.toUpperCase());
                break;

                default:
                    System.out.println("User Follow instructions to give input \n\n");
            }
            }

            catch(ArithmeticException e){
                System.out.println("Exception Occurred, Try again :"+e.getMessage());
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e.getMessage());
            }
            catch(NullPointerException e){
                System.out.println(e.getMessage());
            }
            
        }
    }
}
