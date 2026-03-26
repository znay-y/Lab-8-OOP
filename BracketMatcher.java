import java.util.Stack;

public class BracketMatcher {
    public static void main(String[] args) {
        System.out.println(matchingBrackets("{[()]}")); // true
        System.out.println(matchingBrackets("((({{{[[]]}}})))")); // true
        System.out.println(matchingBrackets("(a + b]")); // false
        System.out.println(matchingBrackets("{[(])}")); // false
    }

    public static boolean matchingBrackets(String s) {
        Stack<Character> brackets = new Stack<>();

        char[] cArray = s.toCharArray();

        for (int i = 0; i < cArray.length; i++) {
            if (bracketMatch(cArray[i])) {
                brackets.push(cArray[i]);
            }
        }
        // System.out.println(brackets.toString());
        // After validating

        char[] bArray = new char[brackets.size()];

for (int i = 0; i < brackets.size(); i++) {
    bArray[i] = brackets.get(i);
}

        // System.out.println("The array is:");

        int right = bArray.length - 1;
        for (int j = 0; j < bArray.length; j++) {
            int left = j;
            right = right - j;
            System.out.println("Comparing " + bArray[left] + " with " + bArray[right]);

            if (bArray[left]==(bArray[right])) {
                System.out.println("They match");
                continue;

            } else {
                System.out.println("Don't match");
                return false;
            }

        }

        return true;

    }

    public static char[] arrayAppend(char[] cArray, char in) {
        char[] newArray = new char[cArray.length + 1];

        for (int i = 0; i < cArray.length; i++) {
            newArray[i] = cArray[i];
        }
        newArray[newArray.length - 1] = in;
        System.out.println("Added " + in + " to character array ");
        return newArray;
    }

    public static boolean bracketMatch(char key) {
        return (key == '{' || key == '}' || key == '[' || key == ']' || key == '(' || key == ')');
    }

}
