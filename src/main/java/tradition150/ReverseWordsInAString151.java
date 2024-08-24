package tradition150;

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
}
