package tradition150;

public class NumberOf1Bits191 {

    private class TestCase {

        static int n = 11;
    }

    public static void solution() {

    }

    /**
     * Solution
     * Time Complexity: O(log n)
     * @param n
     * @return
     */
    public int hammingWeight(int n) {
        return Integer.bitCount(n);
    }
}
