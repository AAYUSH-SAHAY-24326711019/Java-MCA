package LinkedListExample;
import java.util.Scanner;
import java.util.LinkedList;
public class program1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        // to add the elements in the Linked List
        list.add("A");
        list.add("B");

        //Defining the head and the tail of the Linked List
        list.addFirst("Start");
        list.addLast("End");

        //Printing the Linked List
        System.out.println("LinkedList: " + list);

        //Get the head and the tail of the linked list
        System.out.println("First: " + list.getFirst());
        System.out.println("Last: " + list.getLast());

        //Removing the head and the tail of the linked list
        list.removeFirst();
        list.removeLast();

        // seeing the list after the removal
        System.out.println("After removal: " + list);

        // Now the head and the tail is
        System.out.println("new First: " + list.getFirst());
        System.out.println("new Last: " + list.getLast());

    }
    
}
//Test1
// LinkedList: [Start, A, B, End]
// First: Start
// Last: End
// After removal: [A, B]
// new First: A
// new Last: B
