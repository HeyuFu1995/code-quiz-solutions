package tradition150;

public class PalindromeNumber9 {
    private class TestCase {

               static int x = 121;
    }

    public static void solution() {

    }

    /**
     * Solution
     * Time Complexity: O(n)
     * @param x
     * @return
     */
    public boolean isPalindrome(int x) {
        return isPalindrome(String.valueOf(x));
    }

    private boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while(left <= right) {
            if(s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
