package tradition150;

public class LongestPalindromicSubstring5 {

    private class TestCase {
        static String s = "babad";
    }

    public static void solution() {


    }

    /**
     * Solution
     * Time Complexity: O(n^2)
     * @param s
     * @return
     */
    public String longestPalindrome(String s) {
        int length = s.length();
        //DP
        //Record from i to j is a Palindromic or not
        //Initial State: if(i == j) true;
        //state transfer formula: state[i][j] = state[i + 1][j - 1] && char(i) == char(j)
        //final state: longest (j - i) when state[i][j] == true
        boolean[][] subStrs = new boolean[length][length];
        for(int i = 0; i < length; i++) {
            subStrs[i][i] = true;
        }
        int maxLength = 1;
        int begin = 0;
        for(int row = length - 1; row >= 0; row--) {
            for(int col = row; col < length; col++) {
                if( ((col - row <= 1 || subStrs[row + 1][col - 1])) && s.charAt(row) == s.charAt(col)) {
                    subStrs[row][col] = true;
                    int subLength = col - row + 1;
                    if(subLength > maxLength) {
                        maxLength = subLength;
                        begin = row;
                    }
                }
            }
        }
        return s.substring(begin, begin + maxLength);
    }
}
