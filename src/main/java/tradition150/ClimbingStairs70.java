package tradition150;

public class ClimbingStairs70 {
    private class TestCase {
        static int n = 5;


    }

    public static void solution() {

    }

    /**
     * Solution
     * Recursion
     * Time Complexity: O(2^n)
     * Space Complexity: O(2^n)
     * @param n
     * @return
     */
    public int climbStairs(int n) {
        if(n == 2) {
            return 2;
        }
        if(n == 1) {
            return 1;
        }
        return climbStairs(n - 1) + climbStairs(n - 2);

    }
}
