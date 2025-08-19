package Set_HashSets;
import java.util.HashSet;
public class program3 {
    public static void main(String args[]){
        System.out.println("Adding the elements of other set to our Main Set");

        HashSet<Integer> Main = new HashSet<Integer>();
        HashSet<Integer> Other = new HashSet<Integer>();

        // main is the set having even no. in range 1 to 10
        for(int i=2;i<=10;i=i+2){
            Main.add(i);
        }
        System.out.println("Printing Main Set : "+Main);
        // other is the set having odd no. in range 1 to 10
        for(int i=1;i<=10;i=i+2){
            Other.add(i);
        }
        System.out.println("Printing Other Set : "+Other);


        // Adding the Other set to the Main set
        
        System.out.println("Adding Other set to the Main Set Main.addAll(Other); : ");
        Main.addAll(Other);
        System.out.println("Now, the Main Set Became as :"+Main);

    }
}
// Test
// Adding the elements of other set to our Main Set
// Printing Main Set : [2, 4, 6, 8, 10]
// Printing Other Set : [1, 3, 5, 7, 9]
// Adding Other set to the Main Set Main.addAll(Other); :      
// Now, the Main Set Became as :[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]