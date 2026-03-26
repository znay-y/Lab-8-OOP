import java.util.*;
public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String,String> Map1 = new HashMap<String,String>();
        
        // Insert elements to the map
        Map1.put("Salah", "Barcelona");
        // overwrite the previous 
        Map1.put("Salah", "Liverpool");
        Map1.put("Messi", "Inter Miami");
        Map1.put("Kylian Mbappe", "Paris Saint-Germain");
        Map1.put("Lee Kang-in", "Paris Saint-Germain");
        Map1.put("Neymar", "Al Hilal");
        Map1.put("Ronaldo", "Al-Nassr");
        
        System.out.println("\n\nThere are " + Map1.size() + " key-value pairs in the map\n");
        System.out.println("Map Elements:");
        System.out.println(Map1 + "\n");
        
        // iterate all the keys of the Map via its keySet() method and using the key 'Iterator'
		Iterator<String> iterator = Map1.keySet().iterator();
		System.out.println("Printing keys and values using entrySet() and Iterator:");
		while(iterator.hasNext()) {
 			String key   = iterator.next();
			String value = Map1.get(key);
   			System.out.println("Key:" + key + ", Value:" + value);
		} 
		
		// Printing keys and values using entrySet() and a for-each loop
		System.out.println("\n\nKeys and values using entrySet() and a for-each loop:");
		for (Map.Entry<String, String> entry : Map1.entrySet()) {
    		System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}
		
		// iterate all values stored in Map
		System.out.println("\n\nIterating and printing values only:");
		Iterator<String> iterator2 = Map1.values().iterator();
		while(iterator2.hasNext()) {
    		System.out.println(iterator2.next());
		} 
		
		// iterate the values stores in the Map via the for-each loop
		System.out.println("\n\nIterating the values via the for-each loop:");
		for(String value : Map1.values()){
    		System.out.println(value);
		} 
		
		/* The forEach() is a method from the Iterable class, and it accepts only a 
		 * Consumer as the parameter.
		 * The for-each method iterates through the elements in the HashMap until they 
		 * are exhausted as it prints them out using System.out.println.
		 */
		System.out.println("\n\nPrinting the entries using the forEach() method:");
		Map1.entrySet().forEach(System.out::println);
    }
}