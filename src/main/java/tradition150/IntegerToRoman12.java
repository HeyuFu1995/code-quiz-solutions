package tradition150;

public class IntegerToRoman12 {

    private class TestCase {
        static int num = 3749;
    }

    public static void solution() {

    }

    /**
     * Solution
     * Time Complexity: O(n)
     * @param num
     * @return
     */
    public String intToRoman(int num) {
        int comboNum = 13;
        String[] symbols = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values = new int[] {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < comboNum; i++) {
            while(num - values[i] >= 0) {
                builder.append(symbols[i]);
                num -= values[i];
            }
        }
        return builder.toString();
    }
}
