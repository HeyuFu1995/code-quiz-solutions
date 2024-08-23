package tradition150;

public class FindPeakElement162 {

    private class TestCase {
        static int[] nums = {1,2,3,1};
    }

    public static void solution() {

    }

    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while(left < right) {
            int mid = (left + right) / 2;
            if(mid == 0 || nums[mid] <= nums[mid - 1]) {
                right = mid;
            }
            else if(mid == nums.length - 1 || nums[mid] <= nums[mid + 1]) {
                left = mid;
            } else {
                left++;
            }
        }
        return left;
    }
}
