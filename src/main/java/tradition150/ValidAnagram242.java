package tradition150;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram242 {
    private class TestCase {
        static String s = "anagram";
        static String t = "nagaram";
    }

    public static void solution() {

    }

    /**
     * Solution 1
     * Time Complexity: O(n)
     * @param s
     * @param t
     * @return
     */
    public boolean isAnagram(String s, String t) {
        //Use two maps to record each character appearance in String
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();

        if(s.length() != t.length()) {
            return false;
        }

        for(char sChar: s.toCharArray()) {
            int charAppearance = sMap.getOrDefault(sChar, 0);
            sMap.put(sChar, charAppearance + 1);
        }

        for(char tChar: t.toCharArray()) {
            int charAppearance = tMap.getOrDefault(tChar, 0);
            tMap.put(tChar, charAppearance + 1);
        }

        //Compare the equals of two maps
        for(char c: sMap.keySet()) {
            if(!tMap.containsKey(c)) {
                return false;
            }
            if(!sMap.get(c).equals(tMap.get(c))) {
                return false;
            }
        }

        return true;
    }
}
