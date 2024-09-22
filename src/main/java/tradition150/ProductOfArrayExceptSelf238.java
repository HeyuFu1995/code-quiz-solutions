package tradition150;

public class ProductOfArrayExceptSelf238 {

    private class TestCase {
        static int[] nums = {1,2,3,4};
    }

    public static void solution() {

    }

    /**
     * Solution
     * Time Complexity: O(n^2)
     * @param nums
     * @return
     */
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            int prod = 1;
            for(int j = 0; j < nums.length; j++) {
                if(j != i) {
                    prod *= nums[j];
                }
            }
            ans[i] = prod;
        }
        return ans;
    }

    /**
     * Solution 2
     * Time Complexity: O(n)
     * @param nums
     * @return
     */
    public int[] productExceptSelf2(int[] nums) {
        int length = nums.length;
        int[] ans = new int[length];

        ans[0] = 1;
        for(int i = 1; i < length; i++) {
            ans[i] = nums[i - 1] * ans[i - 1];
        }

        int r = 1;
        for(int i = length - 1; i >= 0; i--) {
            ans[i] = ans[i] * r;
            r *= nums[i];
        }
        return ans;
    }
}
