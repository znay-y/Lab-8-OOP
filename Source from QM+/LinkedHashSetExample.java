import java.util.*;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<String> lh_set = new LinkedHashSet<String>();
        lh_set.add("This is Object");
        lh_set.add("Oriented");
        lh_set.add("Programming - love It!");
		System.out.println("Printing the linked hash set: " + lh_set);
    }
}
