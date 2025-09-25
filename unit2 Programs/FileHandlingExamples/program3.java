package FileHandlingExamples;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class program3 {
    public static void main(String[] args) throws IOException {
        Scanner z = new Scanner(System.in);
        FileWriter f = new FileWriter("C:\\Users\\Lenovo\\Desktop\\Java-MCA\\unit2 Programs\\FileHandlingExamples\\File-Sandbox\\create_file1.txt");

        String userMsg = null;
        System.out.println("[Give your input to write into file]\n");
        userMsg= z.nextLine();
        
        f.write(userMsg);

        System.out.println("Data written to the file");

        f.close();
        System.out.println("File is closed after writing");

    }
}
// User Input {Name : Aayush Sahay , Hobby : Programming} 
// Data written to the file
// File is closed after writing