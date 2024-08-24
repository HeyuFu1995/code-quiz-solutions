package tradition150;

public class MaximumSubarray53 {
    private class TestCase {
        static int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
    }

    public static void solution() {

    }

    /**
     * Solution
     * Time Complexity: O(n)
     * DP
     * @param nums
     * @return
     */
    public int maxSubArray(int[] nums) {
        int pre = 0;
        int maxValue = nums[0];
        for(int num : nums) {
            pre = Math.max(pre + num, num);
            maxValue = Math.max(maxValue, pre);
        }
        return maxValue;
    }
}
