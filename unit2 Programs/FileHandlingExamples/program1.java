package FileHandlingExamples;

import java.io.File;
import java.io.IOException;

public class program1 {
    public static void main(String[] args) {
        try{
            File f = new File("C:\\Users\\Lenovo\\Desktop\\Java-MCA\\unit2 Programs\\FileHandlingExamples\\File-Sandbox\\create_file1.txt");

            if(f.createNewFile()){
                System.out.println("File was successfully made");
            }else{
                System.out.println("File exists / creation failure");
            }

        }catch(IOException ioe){
            System.out.println(ioe.getMessage());
        }
    }
}
