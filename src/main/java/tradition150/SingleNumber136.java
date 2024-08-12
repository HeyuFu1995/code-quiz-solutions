package tradition150;

public class SingleNumber136 {

    private class TestCase {
        static int[] nums = {4,1,2,1,2};
    }

    public static void solution() {

    }

    /**
     * Solution
     * Time Complexity: O(n)
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {
        int answer = 0;
        for(int num: nums) {
            answer ^= num;
        }
        return answer;
    }
}
