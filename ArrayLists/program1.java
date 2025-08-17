package ArrayLists;
import java.util.ArrayList;
import java.util.Scanner;
public class program1 {
    public static void main(String args[]){
        //1. ArrayList always takes a wrapper class.
        //2. Declarations:
        //->ArrayList <WrapperType> object = new ArrayList <WrapperType>();
        //3. methods : add , set(at index), get(from index), remove(at index)
        //             and clear all the index

        boolean switch1 =true;
        int choice;
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> z = new ArrayList<Integer>();
        while(switch1){
            System.out.println("1.Add and element to array list");
            System.out.println("2.Print all elements of array list");
            System.out.println("3. To replace the element at index.");
            System.out.println("4.Specify the index and get the value.");
            System.out.println("5. Know the size of ArrayList");
            System.out.println("6.Clear the ArrayList");
            System.out.println("7.Exit the program");
            System.out.println("\nUser give choice:");
            choice=s.nextInt();
            switch(choice){
                case 1:
                    int input;
                    System.out.print("Input to arraylist ->");
                    input=s.nextInt();
                    z.add(input);
                    break;
                case 2:
                    System.out.println("Printing all the values:");
                    for(int i=0; i<z.size();i++){
                        System.out.println(i+" "+z.get(i));
                    }
                    break;
                case 3:
                    int in,index;
                    System.out.println("Replace value at index:");
                    System.out.print("index:");
                    index=s.nextInt();
                    System.out.print("value:");
                    in=s.nextInt();
                    System.out.println("Replacing using z.set("+in+"); Results:");
                    z.set(index,in);
                    for(int i=0; i<z.size();i++){
                        System.out.println(i+" "+z.get(i));
                    }
                    break;

                    case 4:
                    int idx;
                    System.out.println("Specify index:");
                    idx=s.nextInt();
                    System.out.println("obtaining value z.get("+idx+");=>"+z.get(idx)+"\n\n");
                    break;

                case 5:
                    System.out.println("The size of ArrayList is="+z.size());
                    break;
                
                case 6:
                    System.out.println("Clearing the ArrayList");
                    z.clear();
                    break;
                
                case 7:
                    System.out.println("Exiting the program");
                    switch1=false;
                    break;
                default:
                    System.out.println("Plz enter a valid choice");

            }
        }
    }
}
/*Test1
User give choice:
1
Input to arraylist ->10
1.Add and element to array list
2.Print all elements of array list
3. To replace the element at index.
4.Specify the index and get the value.
5. Know the size of ArrayList
6.Clear the ArrayList
7.Exit the program

User give choice:
1
Input to arraylist ->20
1.Add and element to array list
2.Print all elements of array list
3. To replace the element at index.
4.Specify the index and get the value.
5. Know the size of ArrayList
6.Clear the ArrayList
7.Exit the program

User give choice:
1
Input to arraylist ->30
1.Add and element to array list
2.Print all elements of array list
3. To replace the element at index.
4.Specify the index and get the value.
5. Know the size of ArrayList
6.Clear the ArrayList
7.Exit the program

User give choice:
1
Input to arraylist ->40
1.Add and element to array list
2.Print all elements of array list
3. To replace the element at index.
4.Specify the index and get the value.
5. Know the size of ArrayList
6.Clear the ArrayList
7.Exit the program

User give choice:
1
Input to arraylist ->50
1.Add and element to array list
2.Print all elements of array list
3. To replace the element at index.
4.Specify the index and get the value.
5. Know the size of ArrayList
6.Clear the ArrayList
7.Exit the program

User give choice:
2
Printing all the values:
0 10
1 20
2 30
3 40
4 50
1.Add and element to array list
2.Print all elements of array list
3. To replace the element at index.
4.Specify the index and get the value.
5. Know the size of ArrayList
6.Clear the ArrayList
7.Exit the program

User give choice:
3
Replace value at index:
index:0
value:100
Replacing using z.set(100); Results:
0 100
1 20
2 30
3 40
4 50
1.Add and element to array list
2.Print all elements of array list
3. To replace the element at index.
4.Specify the index and get the value.
5. Know the size of ArrayList
6.Clear the ArrayList
7.Exit the program

User give choice:
4
Specify index:
4
obtaining value z.get(4);=>50


1.Add and element to array list
2.Print all elements of array list
3. To replace the element at index.
4.Specify the index and get the value.
5. Know the size of ArrayList
6.Clear the ArrayList
7.Exit the program

User give choice:
5
The size of ArrayList is=5
1.Add and element to array list
2.Print all elements of array list
3. To replace the element at index.
4.Specify the index and get the value.
5. Know the size of ArrayList
6.Clear the ArrayList
7.Exit the program

User give choice:
6
Clearing the ArrayList
1.Add and element to array list
2.Print all elements of array list
3. To replace the element at index.
4.Specify the index and get the value.
5. Know the size of ArrayList
6.Clear the ArrayList
7.Exit the program

User give choice:
7
Exiting the program
 */