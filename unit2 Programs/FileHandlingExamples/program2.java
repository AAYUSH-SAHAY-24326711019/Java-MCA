package FileHandlingExamples;

import java.io.File;
import java.io.IOException;

public class program2 {
    public static void main(String[] args) {
        try{
            File f = new File("C:\\Users\\Lenovo\\Desktop\\Java-MCA\\unit2 Programs\\FileHandlingExamples\\File-Sandbox\\create_file1.txt");
            if(f.exists()){
                System.out.println("File-Name : "+f.getName());
                System.out.println("Location of file : "+f.getPath());
                System.out.println("Absolute path "+f.getAbsolutePath());
                System.out.println("Readable ? : "+f.canRead());
                System.out.println("Writable? : "+f.canWrite());
                System.out.println("Executable ? : "+f.canExecute());
                System.out.println("Length of file : "+f.length());
            }
            else{
                System.out.println("File not exist...");
            }
        }catch(Exception ioe){
            System.out.println(ioe.getMessage());
        }
    }
}
