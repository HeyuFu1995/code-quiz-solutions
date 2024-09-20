package tradition150;

public class SqrtX69 {
    private class TestCase {
        static int x = 4;
    }

    public static void solution() {

    }

    /**
     *  Solution
     *  Time Complexity: O(logn)
     * @param x
     * @return
     */
    public int mySqrt(int x) {
        int l = 0;
        int r = x;
        int ans = -1;
        while(l <= r) {
            int mid = (l + r) / 2;
            if((long)mid * mid <= x) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }
}
