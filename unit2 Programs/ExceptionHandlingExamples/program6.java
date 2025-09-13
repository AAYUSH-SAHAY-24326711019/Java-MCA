package ExceptionHandlingExamples;

import java.util.Scanner;

//Divide by zero infinite loop 


public class program6{
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        boolean key = true;
        int a,b,choice = 0;
        while(key){
            System.out.println("User follow :");
            System.out.println("press 1 to divide operation");
            System.out.println("press 2 for exit operation");
            System.out.println("User give input :");
            choice = z.nextInt();
            switch(choice){
                case 1: //for divide operation
                    try{
                        System.out.println("Give a:"); a=z.nextInt();
                        System.out.println("Give b:"); b=z.nextInt();
                        System.out.println("Result of division :"+(a/b));
                    }catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                break;

                case 2:
                    key=false;
                    System.out.println("Exiting the program ...");
                break;

                default:
                    System.out.println("User, kindly give proper input");
                
            }
        }

    }
}