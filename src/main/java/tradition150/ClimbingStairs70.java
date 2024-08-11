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

    /**
     * Solution 2
     * Dynamic Programming
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * @param n
     * @return
     */
    public int climbStairs2(int n) {
        if(n == 2) {
            return 2;
        }
        if(n == 1) {
            return 1;
        }
        int[] resultArray = new int[n];
        resultArray[0] = 1;
        resultArray[1] = 2;
        for(int i = 2; i < n; i++) {
            resultArray[i] = resultArray[i - 1] + resultArray[i - 2];
        }
        return resultArray[n - 1];
    }

    /**
     * Solution 2
     * Advanced Dynamic Programming
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     * @param n
     * @return
     */
    public int climbStairs3(int n) {
        if(n == 2) {
            return 2;
        }
        if(n == 1) {
            return 1;
        }
        int result1 = 1;
        int result2 = 2;
        for(int i = 2; i < n; i++) {
            int result = result1 + result2;
            result1 = result2;
            result2 = result;
        }
        return result2;
    }
}
