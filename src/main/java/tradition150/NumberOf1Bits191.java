package tradition150;

public class NumberOf1Bits191 {

    private class TestCase {

        static int n = 11;
    }

    public static void solution() {

    }

    /**
     * Solution
     * Time Complexity: O(1)
     * @param n
     * @return
     */
    public int hammingWeight(int n) {
//        n = n - ((n >>> 1) & 0x55555555);
//        n = (n & 0x33333333) + ((n >>> 2) & 0x33333333);
//        n = (n + (n >>> 4)) & 0x0f0f0f0f;
//        n = n + (n >>> 8);
//        n = n + (n >>> 16);
//        return n & 0x3f;
        return Integer.bitCount(n);
    }

    /**
     * Solution 2
     * Time Complexity: O(32) = O(1)
     * @param n
     * @return
     */
    public int hammingWeight2(int n) {
        int ret = 0;
        for(int i = 0; i < 32; i++) {
            if((n & (1 << i)) == 1) {
                ret++;
            }
        }
        return ret;
    }

    /**
     * Solution 3
     * Time Complexity: O(log n)
     * @param n
     * @return
     */
    public int hammingWeight3(int n) {
        int ret = 0;
        while(n != 0) {
            n &= n - 1;
            ret++;
        }
        return ret;
    }
}
