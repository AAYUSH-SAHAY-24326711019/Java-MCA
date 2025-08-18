package CommandLineArgs;

public class program2 {
    public static void main(String args[]){
        int s=0;
        for(int i=0; i<args.length;i++){
            s=s+Integer.parseInt(args[i]);
        }
        System.out.println("The sum is ="+s);
    }
    
}
// Test1
// C:\Users\Dell\Desktop\Java-MCA\CommandLineArgs>java program2.java 
// The sum is =0

// C:\Users\Dell\Desktop\Java-MCA\CommandLineArgs>java program2.java 1 2 3 4 5
// The sum is =15