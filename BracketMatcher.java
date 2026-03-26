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
            System.out.println(brackets.toString());
            if (bracketInMatch(cArray[i])) {
                brackets.push(cArray[i]);
            } else if (cArray[i] == '}' && brackets.peek() == '{') {
                brackets.pop();
            } else if (cArray[i] == ']'&& brackets.peek() == '[') {
                brackets.pop();
            } else if (cArray[i] == ')' && brackets.peek() == '(') {
                brackets.pop();
            } else if (cArray[i] == '}' || cArray[i] == ']' || cArray[i] == ')') {
                return false;
            }
        }
     

        return true;

    }

    /*
     * public static char[] arrayAppend(char[] cArray, char in) {
     * char[] newArray = new char[cArray.length + 1];
     * 
     * for (int i = 0; i < cArray.length; i++) {
     * newArray[i] = cArray[i];
     * }
     * newArray[newArray.length - 1] = in;
     * System.out.println("Added " + in + " to character array ");
     * return newArray;
     * }
     */

    public static boolean bracketInMatch(char key) {
        return (key == '{' || key == '[' || key == '(');
    }

}
