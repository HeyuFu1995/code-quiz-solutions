package tradition150;

public class AddBinary67 {

    private class TestCase {

        static String a = "11";

        static String b = "1";
    }

    public static void solution() {

    }

    /**
     * Solution
     * Time Complexit: O(log(a +b))
     * @param a
     * @param b
     * @return
     */
    public String addBinary(String a, String b) {
        long aNum = Long.parseLong(a, 2);
        long bNum = Long.parseLong(b, 2);
        return Long.toBinaryString(aNum + bNum);
    }
}
