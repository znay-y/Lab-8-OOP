import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> students = new LinkedList<>();
        students.addLast("Diana");
        students.addLast("Mohammed");
        students.addLast("Li");
        students.addLast("Nadia");

		// Display the LinkedList
        System.out.println("Initial LinkedList: " + students);
        
        // Add an element at the beginning of the students LinkedList
        students.addFirst("Ali");
        System.out.println("After adding Ali at the beginning: " + students);
        
        // Add an element at the end of the LinkedList
        students.addLast("Claudia");
        System.out.println("After adding Claudia at the end: " + students);

        // Remove the first element from the LinkedList
        String firstElement = students.removeFirst();
        System.out.println("Removed first element: " + firstElement);
        System.out.println("LinkedList after removing first element: " + students);
        // can use this as well: 
        // students.remove();
   
        // Remove the last element from the LinkedList
        String lastElement = students.removeLast();
        System.out.println("Removed last element: " + lastElement);
        System.out.println("LinkedList after removing last element: " + students);

        // Print the first and last element
        String first = students.getFirst();
        String last = students.getLast();
        System.out.println("First element: " + first);
        System.out.println("Last element: " + last);
        
        // Check if an element exists in the LinkedList
        boolean containsDiana = students.contains("Diana");
        System.out.println("Does the LinkedList contain 'Diana'? " + containsDiana);
    }
}
