package tradition150;

public class SearchInsertPosition35 {

    private class TestCase {

        static int[] nums = {1,3,5,6};

        static int target = 5;
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
    public int searchInsert(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > target) {
                return i;
            }
        }
        return nums.length;
    }
}
