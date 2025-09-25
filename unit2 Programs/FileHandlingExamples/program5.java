package FileHandlingExamples;

import java.io.File;
import java.io.IOException;
import java.text.FieldPosition;
import java.util.Scanner;
public class program5 {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Lenovo\\Desktop\\Java-MCA\\unit2 Programs\\FileHandlingExamples\\File-Sandbox\\create_file1.txt";
        File f = new File(path);
        Scanner z = new Scanner(System.in);
        String s = null;
        System.out.println("Renaming the  new file :");
        System.out.println(" new name of the file(txt):");
        s=z.next();
        path = "C:\\Users\\Lenovo\\Desktop\\Java-MCA\\unit2 Programs\\FileHandlingExamples\\File-Sandbox\\"+s+".txt";
        File r =new File(path);
        if (f.exists()) {
            System.out.println("Rename file :["+f.getName()+"] to "+s+" "+f.renameTo(r));
        }else{
            System.out.println("File-Not-Found");
        }


    }
}
// Renaming the  new file :
//  new name of the file(txt):
// Hello
// Rename file :[create_file1.txt] to Hello true