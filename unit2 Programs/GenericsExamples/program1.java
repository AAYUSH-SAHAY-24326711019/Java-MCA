package GenericsExamples;
import java.util.ArrayList;
public class program1 {

    public static void main(String[] args) {

        //making the array list 1st way
        ArrayList<Object> list = new ArrayList<>();
        list.add("Hello");
        list.add(123);
        String s  = (String)list.get(0);
        System.out.println("Value inside String s ="+s);

        //making it the other way where type casting not required
        ArrayList <String> List1 = new ArrayList<>();
        List1.add("Hello new String.");
        s = List1.get(0);
        System.out.println("new value of s = "+s);
    }
}
// Value inside String s =Hello
// new value of s = Hello new String.