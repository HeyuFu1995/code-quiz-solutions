package tradition150;

public class HouseRobber198 {
    private class TestCase {
        static int[] nums = {1,2,3,1};
    }

    public static void solution() {

    }

    /**
     * Solution Wrong
     * Time Complexity: O(n)
     * @param nums
     * @return
     */
    public int rob(int[] nums) {
        int oddSum = 0;
        int evenSum = 0;
        for(int i = 0; i < nums.length; i++) {
            if(i % 2 == 0){
                oddSum += nums[i];
            } else {
                evenSum += nums[i];
            }
        }
        return Math.max(oddSum, evenSum);
    }

    /**
     * Solution
     * Time Complexity: O(n)
     * DP
     * @param nums
     * @return
     */
    public int rob2(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        if(nums.length == 1) {
            return nums[0];
        }
        int length = nums.length;
        int[] maxRobPerNum = new int[length];
        maxRobPerNum[0] = nums[0];
        maxRobPerNum[1] = Math.max(nums[0], nums[1]);
        for(int i = 2; i < length; i++) {
            maxRobPerNum[i] = Math.max(maxRobPerNum[i - 2] + nums[i], maxRobPerNum[i - 1]);
        }
        return maxRobPerNum[length - 1];
    }

}
