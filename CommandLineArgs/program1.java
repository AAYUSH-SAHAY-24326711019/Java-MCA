package CommandLineArgs;

public class program1 {
    public static void main(String args[]){
        int a,b;
        if(args.length<2 || args.length>2){
            System.out.println("Bad Command / Invalid (Sum 2 numbers only)");
            return;
        }
        else{
            a=Integer.parseInt(args[0]);
            b=Integer.parseInt(args[1]);
            System.out.println("The sum of ("+a+"+"+b+")="+(a+b));
        }
            
        
    }
}
// Test 1
// C:\Users\Dell\Desktop\Java-MCA\CommandLineArgs>java program1.java 10 20
// The sum of (10+20)=30