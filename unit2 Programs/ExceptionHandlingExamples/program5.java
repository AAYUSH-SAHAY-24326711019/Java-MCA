package ExceptionHandlingExamples;

/*We will make the program to fix the Number Format Exception
 * This will occur when a string is being type converted into an
 * integer
 */

public class program5 {
    public static void main(String[] args) {
        String demo = "Demo-String";
        int k =0; //sentinel value / flag value
        try{
            int demo_int = Integer.parseInt(demo);
            System.out.println("The value inside demo_int is :"+demo_int);
        }catch(Exception e){
            // System.out.println("Raised Exception : "+
            e.printStackTrace();
            k=1;
        }
        if(k==1){
            System.out.println("Completed with exceptions");
        }else{
            System.out.println("Successfull termination of program");
        }
    }
    
}
// output
// Raised Exception : java.lang.NumberFormatException: For input string: "Demo-String"
// Completed with exceptions