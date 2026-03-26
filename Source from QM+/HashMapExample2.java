import java.util.*;

public class HashMapExample2 {
    public static void main(String args[]) {

        /* This is how to declare HashMap player name -> shirt number */
        HashMap<String, Integer> hmap = new HashMap<String, Integer>();

        /*Adding elements to HashMap*/
        hmap.put("Salah", 11);
        hmap.put("Messi", 30);
        hmap.put("Kylian Mbappe", 7);
        hmap.put("Lee Kang-in", 19);
        hmap.put("Neymar", 10);
        hmap.put("Ronaldo", 7);

        /* Display content using Iterator*/
        Set set = hmap.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry)iterator.next();
            System.out.print("key (player name) is: "+ mentry.getKey() + " & Value (shirt number) is: ");
            System.out.println(mentry.getValue());
        }

        /* Get values based on key*/
        Integer var= hmap.get("Messi");
        System.out.println("\nValue (shirt number) of Messi is: " + var);

        /* Remove values based on key*/
        hmap.remove("Neymar");
        System.out.println("\nMap key and values after removal of Neymar:");
        Set set2 = hmap.entrySet();
        Iterator iterator2 = set2.iterator();
        while(iterator2.hasNext()) {
            Map.Entry mentry2 = (Map.Entry)iterator2.next();
            System.out.print("Key is: "+mentry2.getKey() + " & Value is: ");
            System.out.println(mentry2.getValue());
        }
    }
}
