package tradition150;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII219 {
    private class TestCase {
        static int[] nums = {1,2,3,1};

        static int k = 3;
    }

    public static void solution() {

    }

    /**
     * Solution
     * Time Complexity: O(n)
     * @param nums
     * @param k
     * @return
     */
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> positionMap = new HashMap<>();
        int length = nums.length;
        int minLength = Integer.MAX_VALUE;
        for(int i = 0; i < length; i++) {
            if(positionMap.containsKey(nums[i])) {
                minLength = Math.min(minLength, i - positionMap.get(nums[i]));
            }
            positionMap.put(nums[i], i);
        }
        return minLength <= k;
    }
}
