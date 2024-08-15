package tradition150;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence128 {

    private class TestCase {
        static int[] nums = {100,4,200,1,3,2};
    }

    public static void solution() {

    }

    /**
     * Solution
     * Time Complexity: O(n)
     * @param nums
     * @return
     */
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        int longStreak = 0;

        for(int num: nums) {
            numSet.add(num);
        }

        for(int num: numSet) {
            if(!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while(numSet.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                longStreak = Math.max(longStreak, currentStreak);
            }
        }
        return longStreak;
    }
}
