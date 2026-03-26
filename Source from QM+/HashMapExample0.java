import java.util.*;
public class HashMapExample0 {
	public static void main(String[] args) {
        HashMap<String, String> Map1 = new HashMap<>(Map.of(
                "Salah",			"Liverpool",
                "Messi",			"Inter Miami",
                "Kylian Mbappe",	"Paris Saint-Germain",
                "Lee Kang-in", 		"Paris Saint-Germain",
                "Neymar",			"Al Hilal",
                "Ronaldo",			"Al-Nassr"        
        ));
        System.out.println(Map1);
	}
}