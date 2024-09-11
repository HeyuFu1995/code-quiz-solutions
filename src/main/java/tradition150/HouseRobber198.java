package tradition150;

public class HouseRobber198 {
    private class TestCase {
        static int[] nums = {1,2,3,1};
    }

    public static void solution() {

    }

    /**
     * Solution
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

}
