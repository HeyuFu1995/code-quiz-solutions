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
}
