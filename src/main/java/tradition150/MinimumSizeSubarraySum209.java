package tradition150;

public class MinimumSizeSubarraySum209 {

    private class TestCase {
        static int[] nums = {2,3,1,2,4,3};
        static int target = 7;
    }

    public static void solution() {

    }

    /**
     *Time Complexity: O(n)
     * @param target
     * @param nums
     * @return
     */
    public int minSubArrayLen(int target, int[] nums) {
        //Fast and Slow two pointer
        int slowPointer = 0;
        int fastPointer = 0;
        int arrayLength = nums.length;
        //record the minimum sub array length
        int minLength = Integer.MAX_VALUE;

        if(arrayLength == 0) {
            return 0;
        }
        // record the sum of sub array
        int sum = 0;

        while(fastPointer < arrayLength) {
            //sub array add one item
            sum += nums[fastPointer++];
            //slow pointer can not faster than fast pointer and if sum < target keep add items in sub array
            while (sum >= target && slowPointer <= fastPointer) {
                minLength = Math.min(minLength, fastPointer - slowPointer);
                //reduce the first item of the sub array
                sum -= nums[slowPointer++];
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
