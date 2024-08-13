package tradition150;

public class ReverseBits190 {
    private class TestCase {
        static int num = 0b00000010100101000001111010011100;
    }

    public static void solution() {

    }

    /**
     *
     * @param n
     * @return
     */
    public int reverseBits(int n) {
        int res = 0;
        for(int i = 0; i < 32 && n != 0; ++i) {
           res |= (n & 1) << (31 - i);
           n >>>= 1;
        }
        return res;
    }

}
