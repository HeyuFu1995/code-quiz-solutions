package tradition150;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters3 {

    private class TestCase {

        static String s = "abcabcbb";
    }

    public static void solution() {

    }

    /**
     * Solution
     * Time Complexity: O(n)
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> charPositionMap = new HashMap<>();
        int left = 0;
        int ans = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(charPositionMap.containsKey(c)) {
                int tempPosition = charPositionMap.get(c);
                while(left <= tempPosition) {
                    charPositionMap.remove(s.charAt(left));
                    left++;
                }
            }
            charPositionMap.put(c, i);
            ans = Math.max(ans, i - left + 1);
        }
        return ans;
    }
}
