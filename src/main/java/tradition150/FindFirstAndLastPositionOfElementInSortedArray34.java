package tradition150;

public class FindFirstAndLastPositionOfElementInSortedArray34 {
    private class TestCase {
        static int[] nums = {5,7,7,8,8,10};

        static int target = 8;
    }

    public static void solution() {

    }

    /**
     * Solution
     * Time Complexity: O(n)
     * @param nums
     * @param target
     * @return
     */
    public int[] searchRange(int[] nums, int target) {
        int start = -1;
        int end = -1;
        boolean isTarget = false;
        for(int i = 0; i < nums.length; i++) {
            if(!isTarget && nums[i] == target) {
                start = i;
                isTarget = true;
            } else if(isTarget && nums[i] != target) {
                end = i - 1;
                isTarget = false;
            }
        }
        end = isTarget ? nums.length - 1: end;
        return new int[]{start, end};
    }


    /**
     * Solution 2
     * Time Complexity: O(log n)
     * @param nums
     * @param target
     * @return
     */
    public int[] searchRange2(int[] nums, int target) {
        int start = binarySearch(nums, target, true);
        if(start == nums.length) {
            return  new int[] {-1, -1};
        }
        int end = binarySearch(nums, target, false);
        return new int[]{start, end};
    }

    private int binarySearch(int[] nums, int target, boolean lower) {
        int left = 0;
        int right = nums.length - 1;
        int ans = nums.length;
        while(left <= right) {
            int mid = (left + right) / 2;
            if(nums[mid] == target){
                ans = mid;
            }
            if(nums[mid] > target || (lower && nums[mid] == target)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
}
