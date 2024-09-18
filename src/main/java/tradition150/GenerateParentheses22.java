package tradition150;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses22 {

    private class TestCase {
        static int n = 3;
    }

    public static void solution() {

    }

    /**
     * Solution
     * Time Complexity: O(2^n)
     * @param n
     * @return
     */
    public List<String> generateParenthesis(int n) {
        List<String> combinations = new ArrayList<>();
        generateAll(new char[2 * n], 0, combinations);
        return combinations;
    }

    private void generateAll(char[] current, int pos, List<String> result) {
        if(pos == current.length) {
            if(valid(current)) {
                result.add(new String(current));
            }
        } else {
            current[pos] = '(';
            generateAll(current, pos + 1, result);
            current[pos] = ')';
            generateAll(current, pos + 1, result);
        }
    }

    private boolean valid(char[] current) {
        int balance = 0;
        for(char c: current) {
            if(c == '(') {
                balance++;
            } else {
                balance--;
            }
            if(balance < 0) {
                return false;
            }
        }
        return balance == 0;
    }

    /**
     * Solution 2
     * Time Complexity: O(4 ^ n / sqrt(n))
     * @param n
     * @return
     */
    public List<String> generateParenthesis2(int n) {
        List<String> combinations = new ArrayList<>();
        StringBuilder builder = new StringBuilder();
        backtrack(builder, 0,0, combinations, n);
        return combinations;
    }

    private void backtrack(StringBuilder builder, int open, int close, List<String> results, int n) {
        if(builder.length() == 2 * n) {
            results.add(builder.toString());
            return;
        }
        if(open < n) {
            builder.append('(');
            backtrack(builder, open + 1, close, results, n);
            builder.deleteCharAt(builder.length() - 1);
        }
        if(close < open) {
            builder.append(')');
            backtrack(builder, open, close + 1, results, n);
            builder.deleteCharAt(builder.length() - 1);
        }
    }
}
