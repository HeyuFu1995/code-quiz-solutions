package tradition150;

public class FindMinimumInRoatatedSortedArray153 {
    private class TestCase {
        static int[] nums = {3,4,5,1,2};
    }

    public static void solution() {

    }

    /**
     * Solution
     * Time Complexity: O(n)
     * @param nums
     * @return
     */
    public int findMin(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            int pre = i == 0 ? nums[nums.length - 1] : nums[i - 1];
            int post = i == nums.length - 1 ? nums[0] : nums[i + 1];
            if(nums[i] <= pre && nums[i] <= post) {
                return nums[i];
            }
        }
        return 0;
    }

    /**
     * Solution 2
     * Time Complexity: O(logn)
     * @param nums
     * @return
     */
    public int findMin2(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while(left < right) {
            int mid = (left + right) / 2;
            if(nums[mid] < nums[right]){
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return nums[left];
    }
}
