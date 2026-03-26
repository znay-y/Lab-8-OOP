import java.util.*;

public class HashSetExample1 {
    public static void main(String[] args) {
        Set<String> h_set = new HashSet<String>();
        h_set.add("This is Object");
        h_set.add("Oriented");
        h_set.add("Programming - love It!");
		System.out.println("Printing the hash set: " + h_set);

        Iterator<String> itr = h_set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        
        
        // use enhanced loop
        System.out.println("\n\nUsing enhanced loop:" ); 
        for (String entry : h_set)
		{
  			 System.out.println(entry);
		}
    }
}
