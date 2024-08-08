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

    /**
     * Solution 2
     * Time Complexity: O(n)
     * @param nums
     * @return
     */
    public int majorityElement2(int[] nums) {
        int times = 1;
        int num = nums[0];

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == num) {
                times++;
            } else if(times > 0) {
                times--;
            } else {
                times = 1;
                num = nums[i];
            }
        }
        return num;
    }
}
