package tradition150;

public class RotateArray189 {
    private class TestCase {
        static int[] nums = {1,2,3,4,5,6,7};
        static int k = 3;

    }

    public static void solution() {

    }

    /**
     * Solution 1
     * Time Complexity: O(n^k)
     * @param nums
     * @param k
     */
    public void rotate(int[] nums, int k) {
        if(nums.length <= 1) {
            return;
        }
        for(int i = 0; i < k; i++) {
            int temp = nums[0];
            nums[0] = nums[nums.length - 1];
            for(int numIndex = nums.length - 1; numIndex > 1; numIndex--) {
                nums[numIndex] = nums[numIndex - 1];
            }
            nums[1] = temp;
        }
    }

    /**
     * Solution 2
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * @param nums
     * @param k
     */
    public void rotate2(int[] nums, int k) {
        int length = nums.length;
        int[] tempArray = new int[length];
        for(int i = 0; i < length; i++) {
            tempArray[(i + k) % length] = nums[i];
        }
        System.arraycopy(tempArray, 0, nums, 0, length);
    }

    /**
     * Solution 3
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     * @param nums
     * @param k
     */
    public void rotate3(int[] nums, int k) {
        int length = nums.length;
        k %= length;
        //Reverse Array
        reverse(nums, 0, length - 1);
        //Reverse former half
        reverse(nums, 0, k - 1);
        //Reverse latter half
        reverse(nums, k, length - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    /**
     * Solution 4
     * loop substitute
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     * @param nums
     * @param k
     */
    public void rotate4(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        int loopCount = gcd(k, n);
        //The gcd of k and nums.length indicates how many loops in the iteration
        //For replace all the numbers in the array, must go through every loop
        for(int start = 0; start < loopCount; start++) {
            //For each loop, replace the number with k % n number before.
            int current = start;
            int prev = nums[start];
            do{
                int next = (current + k) % n;
                int temp = nums[next];
                nums[next] = prev;
                prev = temp;
                current = next;
            } while (start != current);

        }
    }

    private int gcd(int x, int y) {
        return y > 0 ? gcd(y, x % y) : x;
    }


}
