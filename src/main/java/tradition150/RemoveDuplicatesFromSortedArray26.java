package tradition150;

public class RemoveDuplicatesFromSortedArray26 {
    private class TestCase {
        static int[] nums = {1,1,2};

    }

    public static void solution() {

    }

    /**
     * Solution
     * Time Complexity: O(n)
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums) {
        int slowPointer = 1;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[slowPointer - 1]) {
                nums[slowPointer++] = nums[i];
            }
        }
        return slowPointer;
    }
}
