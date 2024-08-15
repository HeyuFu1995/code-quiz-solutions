package tradition150;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings205 {

    private class TestCase {
        static String s = "egg";

        static String t = "add";
    }

    public static void solution() {

    }

    /**
     * Solution
     * Time Complexity: O(n)
     * @param s
     * @param t
     * @return
     */
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        Map<Character, Character> sToTMap = new HashMap<>();
        Map<Character, Character> tToSMap = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(!sToTMap.getOrDefault(sChar, tChar).equals(tChar) || !tToSMap.getOrDefault(tChar, sChar).equals(sChar)) {
                return false;
            }
            sToTMap.put(sChar, tChar);
            tToSMap.put(tChar, sChar);
        }

        return true;
    }
}
