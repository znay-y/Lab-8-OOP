import java.util.HashMap;
import java.util.LinkedList;

public class quest4 {
    public static void main(String[] args) {
        LinkedList<String> a = new LinkedList<>();
        a.add("Java");
        a.add("Python");
        a.add("Java");
        a.add("C++");

        System.out.println(getCounts(a).toString());
    }

    public static HashMap<String, Integer> getCounts(LinkedList<String> xs) {

        HashMap<String, Integer> counts = new HashMap<>();

        for (int i = 0; i < xs.size(); i++) {
            String counting = xs.get(i);
            int count = 0;
            System.out.println("Looking for " + counting);

            for (int j = 0; j < xs.size(); j++) {
                if (counting.equals(xs.get(j))) {
                    System.out.println(counting + " found in xs array");
                    count++;
                }
            }
            counts.put(counting, count);
        }
        return counts;
    }
}
