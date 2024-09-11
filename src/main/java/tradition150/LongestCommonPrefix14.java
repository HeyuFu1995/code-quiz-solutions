package tradition150;

public class LongestCommonPrefix14 {

    private class TestCase {
        static String[] strs = {"flower","flow","flight"};
    }

    public static void solution() {

    }

    /**
     * Solution
     * Time Complexity: O(m * n)
     * @param strs
     * @return
     */
    public String longestCommonPrefix(String[] strs) {
        StringBuilder builder = new StringBuilder(strs[0]);
        for(String s: strs) {
            int length = Math.min(s.length(), builder.length());
            if(length != builder.length()) {
                builder.delete(length, builder.length());
            }
            for(int i = 0; i < length; i++) {
                if(s.charAt(i) != builder.charAt(i)) {
                    builder.delete(i, builder.length());
                    i = length;
                }
            }
        }
        return builder.toString();
    }
}
