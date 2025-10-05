package DataInputStreamExample;

import java.io.DataInputStream;
import java.io.IOException;

public class program1 {
    @SuppressWarnings("deprecation")
    public static void main(String args[]) throws IOException{
        DataInputStream obj = new DataInputStream(System.in);
        int a ,b;
        a= Integer.parseInt(obj.readLine());
        b= Integer.parseInt(obj.readLine());
        System.out.println("The sum of ("+a+"+"+b+") is ="+(a+b));
    }
    
}
// Test 1
// 10
// 20
// The sum of (10+20) is =30