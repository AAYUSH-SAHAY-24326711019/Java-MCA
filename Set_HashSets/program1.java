package Set_HashSets;
import java.util.Scanner;
import java.util.HashSet;
public class program1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> s = new HashSet<Integer>();
        boolean flag =true;
        int input=0,choice=0;
        while(flag){
            System.out.println("1. To add an element to the Set.");
            System.out.println("2. To Know the size of the set.");
            System.out.println("3. Check whether an element is part of Set.");
            System.out.println("4. To remove an element from the set.");
            System.out.println("5. Simply print the set using sout(s)");
            System.out.println("6. Access all the elements individually.");
            System.out.println("7. To remove all the elements from the set.");
            System.out.println("8. To Exit.");
            System.out.println("\nUser Specify your choice -> \n");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.printf("\nUser Specify input ->");
                    input = sc.nextInt();
                    s.add(input);
                break;

                case 2:
                    System.out.printf("\nSize of the Set = "+s.size()+"\n");
                break;
                
                case 3:
                    System.out.printf("\nUser Specify input ->");
                    input = sc.nextInt();
                    System.out.println("\nThe element "+input+" is part of set ? :"+s.contains(input));
                break;

                case 4:
                     System.out.printf("\nUser Specify input(For deleting) ->");
                    input = sc.nextInt();
                    if(s.contains(input)){
                        s.remove(input);
                        System.out.println("Removed Value "+input);
                    }else{
                        System.out.println("The element "+input+" cannot be removed");
                        break;
                    }
                break;

                case 5:
                    System.out.println("Printing the Set s :");
                    System.out.println(s);
                break;

                case 6:
                    int ctr=0;
                    for(int i :s){
                        System.out.print(i+" ");
                        ctr=ctr+1;
                    }
                    System.out.println("\nTotal "+ctr+" elements in set s");
                break;

                case 7:
                    System.out.println("Clearing the Set s s.clear");
                    s.clear();
                break;

                case 8:
                    flag =false;
                break;

                default:
                    System.out.println("User give a valid choice...");
                
            }
        }

    }
}
