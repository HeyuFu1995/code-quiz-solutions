package tradition150;

public class TrappingRainWater42 {

    private class TestCase {

        static int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
    }

    public static void solution() {

    }

    /**
     * Solution
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * @param height
     * @return
     */
    public int trap(int[] height) {
        int boardLength = height.length;
        int[] water = new int[boardLength];
        int leftMax = 0;
        for(int i = 0; i < boardLength; i++) {
            if(height[i] < leftMax) {
                water[i] = leftMax - height[i];
            } else {
                leftMax = height[i];
            }
        }
        int rightMax = 0;
        int ans = 0;
        for(int i = boardLength - 1; i >= 0; i--) {
            if(height[i] < rightMax) {
                ans += Math.min(rightMax - height[i], water[i]);
            } else {
                rightMax = height[i];
            }
        }

        return ans;
    }
}
