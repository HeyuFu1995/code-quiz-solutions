package tradition150;

public class RemoveElement27 {

    private class TestCase {
        static int[] nums = {3,2,2,3};
        static int val = 3;
    }

    public static void solution() {

    }

    /**
     * Solution one
     * time complexity: O(n)
     * @param nums
     * @param val
     * @return
     */
    public int removeElement(int[] nums, int val) {
        int arrayLength = nums.length;
        int slowPointer = 0;
        for(int fastPointer = 0; fastPointer < arrayLength; fastPointer++){
            if(nums[fastPointer] != val){
                nums[slowPointer] = nums[fastPointer];
                slowPointer++;
            }
        }
        return slowPointer;
    }

    /**
     * Solution two
     * time complexity: O(n)
     * @param nums
     * @param val
     * @return
     */
    public int removeElement2(int[] nums, int val) {
        int left = 0;
        int right = nums.length;
        while(left < right){
            if(nums[left] == val) {
                nums[left] = nums[right - 1];
                right--;
            } else {
                left++;
            }
        }
        return left;
    }
}
