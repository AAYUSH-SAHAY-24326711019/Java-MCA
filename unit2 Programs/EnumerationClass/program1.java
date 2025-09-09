/* enums are named constants: like showing definite messages*/
package EnumerationClass;

import java.lang.Enum;
enum Status{//simpple like a class
    Running,Failed,Pending,Success;
}

public class program1{
    public static void main(String[] args){
        int i=5;
        Status s = Status.Running;
        System.out.println("Current Status is ="+s);
        //pick status on the basis of number:
        System.out.println("Index number is ="+s.ordinal());
        //ordinal means the sequence number.


        //2. to get all of them
        Status[] z = Status.values();
        // here values will return an array
        System.out.println("Printing all values inside status:");
        for(Status m: z){
            System.out.println(m+"- ordinal no. "+m.ordinal()); //here gives the index number through ordinal function
        }
    
    }
}

// Current Status is =Running
// Index number is =0
// Printing all values inside status:
// Running- ordinal no. 0
// Failed- ordinal no. 1
// Pending- ordinal no. 2
// Success- ordinal no. 3