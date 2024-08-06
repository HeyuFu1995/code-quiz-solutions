package tradition150;

public class RemoveDuplicatesFromSortedArrayII80 {
    private class TestCase {
        static int[] nums = {1,1,1,2,2,3};
    }

    public static void solution() {
    }

    /**
     * Solution
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }

        int times = 0;
        int slowPointer = 1;
        int count = 1;

        for(int index = 1; index < nums.length; index++) {
            if(nums[index] == nums[index - 1] && times >= 1) {
                continue;
            } else if(nums[index] != nums[index - 1]) {
                times = 0;
                nums[slowPointer++] = nums[index];
                count++;
            } else {
                times = 1;
                nums[slowPointer++] = nums[index];
                count++;
            }
        }
        return count;
    }

}
