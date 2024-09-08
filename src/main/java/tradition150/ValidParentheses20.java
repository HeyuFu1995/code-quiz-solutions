package tradition150;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses20 {

    private class TestCase {
        static String s = "()[]{}";
    }

    public static void solution() {

    }

    /**
     * Solution
     * Time Complexity: O(n)
     * @param s
     * @return
     */
    public boolean isValid(String s) {
        Map<Character, Character> braketMap = new HashMap<>(){
            {
                put('}', '{');
                put(']', '[');
                put(')', '(');
            }
        };
        Stack<Character> braketStack = new Stack<>();
        for (char c : s.toCharArray()) {
            if(c == '(' || c == '[' || c == '{') {
                braketStack.push(c);
            }
            if(c == ')' || c == ']' || c == '}') {
                if(braketStack.isEmpty()) {
                    return false;
                }
                Character pairC = braketStack.pop();
                if(braketMap.get(c) != pairC) {
                    return false;
                }
            }
        }
        return braketStack.isEmpty();
    }
}
