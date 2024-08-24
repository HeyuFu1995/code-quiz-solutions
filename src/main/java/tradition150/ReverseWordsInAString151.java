package tradition150;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class ReverseWordsInAString151 {
    private class TestCase {
        static String s = "the sky is blue";
    }

    public static void solution() {

    }

    /**
     * Solution
     * Time Complexity: O(n)
     * @param s
     * @return
     */
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder builder = new StringBuilder();
        for(int i = words.length - 1; i >= 0; i--) {
            if(!words[i].isEmpty()) {
                builder.append(words[i]);
                builder.append(" ");
            }
        }
        if(!builder.isEmpty()) {
            builder.deleteCharAt(builder.length() - 1);
        }
        return builder.toString();
    }

    /**
     * Solution 2
     * @param s
     * @return
     */
    public String reverseWords2(String s) {
        s = s.trim();
        List<String> wordList = Arrays.asList(s.split("\\s+"));
        Collections.reverse(wordList);
        return String.join(" ", wordList);
    }

    /**
     * Solution 3
     * @param s
     * @return
     */
    public String reverseWords3(String s) {
        Stack<String> stringStack = new Stack<>();
        int start = -1;
        for(int i = 0; i < s.length(); i++) {
            if(start == -1 && s.charAt(i) != ' '){
                start = i;
            }
            if(start != -1 && (s.charAt(i) == ' ' || i == s.length() - 1)) {
                stringStack.push(i == s.length() - 1 && s.charAt(i) != ' '? s.substring(start) : s.substring(start, i));
                start = -1;
            }
        }
        StringBuilder builder = new StringBuilder();
        while(!stringStack.isEmpty()) {
            builder.append(stringStack.pop());
            if(!stringStack.isEmpty()) {
                builder.append(" ");
            }
        }
        return builder.toString();
    }
}
