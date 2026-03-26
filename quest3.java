import java.util.LinkedList;

public class quest3 {
    public static void main(String[] args) {
        LinkedList<String> a = new LinkedList<>();
        a.add("Alice");
        a.add("Bob");
        a.add("Charlie");

        System.out.println(toReversedArrayList(a).toString());
    }

    public static LinkedList<String> toReversedArrayList(LinkedList<String> xs) {
        LinkedList<String> toReturn = new LinkedList<>();

        for(int left =xs.size()-1 ; left>=0;left--){
           toReturn.add(xs.get(left));
        }
        return toReturn;
    }

}
