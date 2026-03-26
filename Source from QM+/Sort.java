import java.util.*;

public class Sort {
	private static final String nba_players[] = 
		{ "Antetokounmpo", "Embiid", "Doncic", "Jokic", "Curry", "Tatum", "Durant" };
      
	public static void main(String[] args) {

		// create ArrayList
		List<String> list = new ArrayList<>(Arrays.asList(nba_players));

		// output list
		System.out.println( "Unsorted array elements:\n" + list );

		Collections.sort( list ); // sort ArrayList
    
		// output list
		System.out.println( "Sorted array elements:\n" + list );
		
		
		Collections.sort(list, Comparator.comparingInt(String::length));
		
		// output list
		System.out.println( "Sorting by length:\n" + list );
	}
}
