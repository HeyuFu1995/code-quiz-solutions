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
     * Time Complexity: O(log(a +b))
     * @param a
     * @param b
     * @return
     */
    public String addBinary(String a, String b) {
        long aNum = Long.parseLong(a, 2);
        long bNum = Long.parseLong(b, 2);
        return Long.toBinaryString(aNum + bNum);
    }

    /**
     * Solution 2
     * Time Complexity: O(max(a,b))
     * @param a
     * @param b
     * @return
     */
    public String addBinary2(String a, String b) {
        StringBuffer result = new StringBuffer();
        boolean carry = false;
        int lengthA = a.length();
        int lengthB = b.length();
        int maxLength = Math.max(lengthB, lengthA);
        for(int i = 0; i < maxLength; i++) {
            int sum = carry ? 1 : 0;
            if(i < lengthA) {
                sum += a.charAt(lengthA - i - 1) - '0';
            }
            if(i < lengthB) {
                sum += b.charAt(lengthB - i - 1) - '0';
            }
            result.insert(0, sum % 2);
            carry = sum / 2 != 0;

        }
        if(carry) {
            result.insert(0, "1");
        }
        return result.toString();
    }
}
