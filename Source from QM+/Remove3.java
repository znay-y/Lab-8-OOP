import java.util.*;

public class Remove3 {
    public static void main(String[] args) {
        List<Integer> arrlist1 = new ArrayList<>();
        System.out.println("\nPrinting arrlist1 once created:\n" + arrlist1);
        for (int i=1;i<=5;i++){
            arrlist1.add(i);
        }
        System.out.println("\nPrinting arrlist1 after adding 1 to 5:\n" + arrlist1);

		// Find the index of the element with value 3
		int indexToRemove = -1;
		for (int i = 0; i < arrlist1.size(); i++) {
  			if (arrlist1.get(i) == 3) {
     			indexToRemove = i;
      			break;
   			}
		}

		// If the element with value 3 was found, remove it
		if (indexToRemove != -1) {
    		arrlist1.remove(indexToRemove);
		}

        System.out.println("\nPrinting arrlist1 after removing the item with value 3:\n" + arrlist1);
        
        arrlist1.remove(Integer.valueOf(5));
        
        System.out.println("\nPrinting arrlist1 after removing the item with value 5:\n" + arrlist1);
    }
}



