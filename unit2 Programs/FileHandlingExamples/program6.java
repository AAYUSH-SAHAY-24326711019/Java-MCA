package FileHandlingExamples;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class program6 {
    public static void main(String[] args) throws IOException{
        String path = "C:\\Users\\Lenovo\\Desktop\\Java-MCA\\unit2 Programs\\FileHandlingExamples\\File-Sandbox\\create_file1.txt";
        FileInputStream  r = new FileInputStream(path);
        String new_path = "C:\\Users\\Lenovo\\Desktop\\Java-MCA\\unit2 Programs\\FileHandlingExamples\\File-Sandbox\\create_file2.txt";
        FileOutputStream w = new FileOutputStream(new_path);

        int i =0;
        while((i=r.read())!=-1){
            w.write((char)i);
        }

        System.out.println("File was written successfully");

    }
}
