package EnumerationClass;
import java.lang.Enum;
/*
 * we can also compare the components of the Enumerations
 * if and switch can use it for the comparisons.
 * here using the if and else
*/

enum Status{
    Running,Pending,Started,Failed,Success;
}

public class program2 {
    public static void main(String[] args){
        Status s = Status.Pending;

        if(s==Status.Running){
            System.out.println();
        }
        else if(s==Status.Failed){
            System.out.println("Try again");
        }
        else if(s==Status.Pending){
            System.out.println("please wait");
        }
        else{
            System.out.println("Done");
        }

    }
}
//output : please wait.