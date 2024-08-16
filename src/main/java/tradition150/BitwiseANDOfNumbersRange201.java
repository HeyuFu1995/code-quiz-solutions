package tradition150;

public class BitwiseANDOfNumbersRange201 {

    private class TestCase {
        static int left = 5;

        static int right = 7;
    }

    public static void solution() {

    }

    /**
     * Solution
     * Time Complexity: O(n)
     * @param left
     * @param right
     * @return
     */
    public int rangeBitwiseAnd(int left, int right) {
        int ans = Integer.MAX_VALUE;
        while(left < right) {
            ans &= left;
            left++;
        }
        return ans;
    }

    /**
     * Solution 2
     * Time Complexity: O(log n)
     * @param left
     * @param right
     * @return
     */
    public int rangeBitwiseAnd2(int left, int right) {
        int shift = 0;
        while(left < right) {
            left >>= 1;
            right >>= 1;
            shift++;
        }
        return left << shift;
    }
}
