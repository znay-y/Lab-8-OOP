import java.util.*;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<String> t_set = new TreeSet<String>();
        t_set.add("This is Object");
        t_set.add("Oriented");
        t_set.add("Programming - love It!");

		System.out.println("Printing the hash set: " + t_set);

        Iterator<String> itr = t_set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}