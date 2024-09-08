package tradition150;

public class LongestIncreasingSubsequence300 {

    private class TestCase {
        static int[] nums = {10,9,2,5,3,7,101,18};
    }

    public static void solution() {

    }

    /**
     * Solution
     * Time Complexity: O(n)
     * @param nums
     * @return
     */
    public int lengthOfLIS(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        int[] maxLengthAtPosition = new int[nums.length];
        int ans = 1;
        maxLengthAtPosition[0] = 1;
        for(int i = 1; i < nums.length; i++) {
            maxLengthAtPosition[i] = 1;
            for(int j = 0; j < i; j++) {
                if(nums[i] > nums[j]) {
                    maxLengthAtPosition[i] = Math.max(maxLengthAtPosition[i], maxLengthAtPosition[j] + 1);
                }
            }
            ans = Math.max(ans, maxLengthAtPosition[i]);
        }
        return ans;
    }
}
