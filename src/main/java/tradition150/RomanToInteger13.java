package tradition150;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger13 {
    private class TestCase {
        static String s = "MCMXCIV";
    }

    public static void solution() {

    }

    /**
     * Solution
     * Time Complexity: O(n)
     * @param s
     * @return
     */
    public int romanToInt(String s) {
        Map<Character, Integer> symbolIntegerMap = new HashMap<>(){
            {
                put('M', 1000);
                put('D', 500);
                put('C', 100);
                put('L', 50);
                put('X', 10);
                put('V', 5);
                put('I', 1);
            }
        };
        int num = 0;
        int pre = Integer.MAX_VALUE;
        for(int i = 0; i < s.length(); i++) {
            int cur = symbolIntegerMap.get(s.charAt(i));
            if(cur > pre) {
                num -= 2 * pre;
            }
            num += cur;
            pre = cur;
        }
        return num;
    }
}
