import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Integer> arrlist1 = new ArrayList<>();
        System.out.println("\nPrinting arrlist1 once created:\n" + arrlist1);
        for (int i=1;i<=5;i++){
            arrlist1.add(i);
        }
        System.out.println("\nPrinting arrlist1 after adding 1 to 5:\n" + arrlist1);
        arrlist1.remove(3);
        System.out.println("\nPrinting arrlist1 after removing the 4th item:\n" + arrlist1);
        System.out.println("\nNow printing each item on a separate line... ");
        for (int i=0;i<arrlist1.size();i++){
            System.out.println(arrlist1.get(i) );
        } 
        // insert the element 100 at the specified index 2 in the list
         arrlist1.add(2,100) ;
         System.out.println("\nPrinting arrlist1 after adding 100:\n" + arrlist1); 
         
        // Using the hasNext() method with the while loop to iterate through the arrlist1
        System.out.println("\n\nNow printing using the hasNext() method with the while loop to iterate through the arrlist1" ); 
        Iterator<Integer> itr = arrlist1.iterator(); // Get the iterator
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        
        
        // use enhanced loop
        System.out.println("\n\nUsing enhanced loop:" ); 
        for (Integer number : arrlist1)
		{
  			 System.out.println(number);
		}
    }
}
