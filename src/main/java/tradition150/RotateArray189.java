package tradition150;

public class RotateArray189 {
    private class TestCase {
        static int[] nums = {1,2,3,4,5,6,7};
        static int k = 3;

    }

    public static void solution() {

    }

    /**
     * Solution
     * Time Complexity: O(n^k)
     * @param nums
     * @param k
     */
    public void rotate(int[] nums, int k) {
        if(nums.length <= 1) {
            return;
        }
        for(int i = 0; i < k; i++) {
            int temp = nums[0];
            nums[0] = nums[nums.length - 1];
            for(int numIndex = nums.length - 1; numIndex > 1; numIndex--) {
                nums[numIndex] = nums[numIndex - 1];
            }
            nums[1] = temp;
        }
    }
}
