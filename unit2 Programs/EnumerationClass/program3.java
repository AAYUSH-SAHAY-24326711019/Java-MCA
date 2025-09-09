package EnumerationClass;


import java.lang.Enum;
import java.util.Scanner;
/*
 * we can also compare the components of the Enumerations
 * if and switch can use it for the comparisons.
 * here using the switch , we pass the number , and get the status
*/

enum Status{
    Running,Pending,Started,Failed,Success;
}

public class program3 {
    public static void main(String[] args){
    int input=0;
    Scanner z = new Scanner(System.in);

    // make an array
    Status [] ss = Status.values();

     while(true){
        System.out.println("User give your number(0 to 4) :");
        input=z.nextInt();
        switch(ss[input].ordinal()){
            case 0: System.out.println(Status.Running); break;
            case 1: System.out.println(Status.Failed); break;
            case 2: System.out.println(Status.Started); break;
            case 3: System.out.println(Status.Pending); break;
            case 4: System.out.println(Status.Success); break;
            default:
                System.out.println("input 0 to exit");
                input = z.nextInt();
                if(input==0)
                    break;
                
        }
     }
}
}

/*output
 * User give your number(0 to 4) :
0
Running
User give your number(0 to 4) :
1
Failed
User give your number(0 to 4) :
2
Started
User give your number(0 to 4) :
3
Pending
User give your number(0 to 4) :
4
Success
 */