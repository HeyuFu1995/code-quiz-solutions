package tradition150;

public class JumpGame55 {
    private class TestCase {
        static int[] nums = {2,3,1,1,4};
    }

    public static void solution() {

    }

    /**
     * Solution
     * Time Complexity: O(n * k)
     * @param nums
     * @return
     */
    public boolean canJump(int[] nums) {
        int length = nums.length;
        boolean[] reachable = new boolean[length];
        reachable[0] = true;

        for(int i = 0; i < length; i++) {
            if (reachable[i]) {
                for(int distance = 0; distance <= nums[i] && i + distance < length; distance++) {
                    reachable[distance + i] = true;
                }
            }
        }
        return reachable[length - 1];
    }

    /**
     * Solutuion 2
     * Time Complexity: O(n)
     * @param nums
     * @return
     */
    public boolean canJump2(int[] nums) {
        int length = nums.length;
        int rightMost = 0;

        for(int i = 0; i < length; i++) {
            if (i <= rightMost) {
                rightMost = Math.max(rightMost, i + nums[i]);
            }
            if(rightMost >= length - 1) {
                return true;
            }
        }
        return false;
    }
}
