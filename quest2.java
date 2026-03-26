import java.util.ArrayList;

public class quest2 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);

        ArrayList<Integer> b = new ArrayList<>();
        b.add(3);
        b.add(2);

        System.out.println(getOverlap(a, b).toString());
    }

    public static ArrayList<Integer> getOverlap(ArrayList<Integer> left, ArrayList<Integer> right) {
        ArrayList<Integer> toReturn = new ArrayList<>();

        for (int leftInd = 0; leftInd < left.size(); leftInd++) {
            for (int rightInd = 0; rightInd < right.size(); rightInd++) {
                int leftValue = left.get(leftInd);
                int rightValue = right.get(rightInd);

                System.out.println("Checking " + leftValue + " with " + rightValue);

                if (leftValue == rightValue) {
                    toReturn.add(leftValue);
                }
            }
        }

        return toReturn;
    }
}
