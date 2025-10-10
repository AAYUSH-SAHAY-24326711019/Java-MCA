package ExceptionHandlingExamples;

/*
 * For Null pointer Exception handling
 * 1. When string is NULL , you try to make it ToUpperCase
 * 2. We will obtain the null pointer exception by string
 * 
 * 3. Reason , we made a String object and did not assign
 * it any memory in String pool inside the heap memory
 */

public class program4 {
    public static void main(String[] args) {
        int k=0;
        String demo="abc";
        try{
            System.out.println(demo.toUpperCase());
        }catch(Exception e){
            System.out.println("raised exception :"+e.getMessage());
            k=1;
        }
        if(k==1){
            System.out.println("Completed program with exceptions");
        }
        else{
            System.out.println("Completed the program without Exception");
        }
        
    }
}   
// raised exception :Cannot invoke "String.toUpperCase()" because "<local2>" is null
// Completed program with exceptions