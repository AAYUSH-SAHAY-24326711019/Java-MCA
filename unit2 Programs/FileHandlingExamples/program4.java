package FileHandlingExamples;

import java.io.IOException;
import java.io.FileReader;

public class program4 {
    public static void main(String[] args) throws IOException {
        // To Read the contents of the file
        FileReader f = new FileReader("C:\\Users\\Lenovo\\Desktop\\Java-MCA\\unit2 Programs\\FileHandlingExamples\\File-Sandbox\\create_file1.txt");

        int i =0;

        System.out.println("\n... Start of File  ...");
        while((i=f.read())!=-1){
            System.out.print((char)i);
        }

        System.out.println("\n... End of File is reached ...");
        f.close();
        System.out.println("file is closed");
    }
}
//output
// ... Start of File  ...
// User Input {Name : Aayush Sahay , Hobby : Programming}
// ... End of File is reached ...
// file is closed 