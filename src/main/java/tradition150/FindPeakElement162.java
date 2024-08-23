package tradition150;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindPeakElement162 {

    private class TestCase {
        static int[] nums = {1,2,3,1};
    }

    public static void solution() {

    }

    /**
     * Solution
     * Time Complexity: O(logn)
     * @param nums
     * @return
     */
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while(left <= right) {
            int mid = (left + right) / 2;
            if(mid == 0) {
                if(mid != nums.length - 1) {
                    if (nums[mid + 1] < nums[mid]) {
                        return mid;
                    } else {
                        left = mid + 1;
                    }
                } else {
                    return mid;
                }
            } else if(mid == nums.length - 1) {
                if(nums[mid - 1] < nums[mid]) {
                    return mid;
                } else {
                    right = mid - 1;
                }
            } else {
                if (nums[mid - 1] < nums[mid] && nums[mid + 1] < nums[mid]) {
                    return mid;
                }
                if (nums[mid + 1] > nums[mid]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return 0;
    }
}
