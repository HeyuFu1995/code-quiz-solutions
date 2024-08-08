package tradition150;

import java.util.Arrays;

public class MajorityElement169 {
    private class TestCase {
        static int[] nums = {3,2,3};
    }

    public static void solution() {
    }

    /**
     * Solution
     * Time Complexity: O(nlogn) Fast Sort
     * @param nums
     * @return
     */
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
