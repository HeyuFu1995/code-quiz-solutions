package tradition150;

import java.util.HashMap;
import java.util.Map;

public class TwoSum1 {
    private class TestCase {
        static int[] nums = {2,7,11,15};

        static int target = 9;
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
    public int[] twoSum(int[] nums, int target) {
        //Num and index mapping
        Map<Integer, Integer> numIndexMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(numIndexMap.containsKey(nums[i])) {
                return new int[] {numIndexMap.get(nums[i]), i};
            }
            numIndexMap.put(target - nums[i], i);
        }
        return new int[0];
    }
}
