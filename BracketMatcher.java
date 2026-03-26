import java.util.Stack;

public class BracketMatcher {
    public static void main(String[] args) {
        System.out.println(matchingBrackets("{[()]}")); // true
        System.out.println(matchingBrackets("((({{{[[]]}}})))")); // true
        System.out.println(matchingBrackets("(a + b]")); // false
        System.out.println(matchingBrackets("{[(])}")); // false
    }

    public static boolean matchingBrackets(String s) {

    }

}
