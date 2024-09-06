package tradition150;

public class FactorialTrailingZeros172 {

    private class TestCase {
        static int n = 3;
    }

    public static void solution() {

    }

    /**
     * Solution
     * Time Complexity: O(n)
     * @param n
     * @return
     */
    public int trailingZeroes(int n) {
        int ans = 0;
        for(int i = 5; i <= n; i += 5){
            for(int x = i; x % 5 ==0; x /= 5){
                ans++;
            }
        }
        return ans;
    }

    /**
     * Solution
     * Time Complexity: O(log(n))
     * @param n
     * @return
     */
    public int trailingZeroes2(int n) {
        int ans = 0;
        while(n != 0) {
            n /= 5;
            ans += n;
        }
        return ans;
    }
}
