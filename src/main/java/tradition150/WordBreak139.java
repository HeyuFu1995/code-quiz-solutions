package tradition150;

import java.util.*;

public class WordBreak139 {

    private class TestCase {
    }

    public static void solution() {

    }

    /**
     * Solution
     * Time Complexity: O(mn^2) m = s.length n = wordDict.size()
     * @param s
     * @param wordDict
     * @return
     */
    public boolean wordBreak(String s, List<String> wordDict) {
        Map<Character, List<String>> collect = new HashMap<>();
        for (String string : wordDict) {
            char c = string.charAt(0);
            List<String> cList = collect.getOrDefault(c, new ArrayList<>());
            cList.add(string);
            collect.put(c, cList);
        }
        return backtrack(s, collect, "");
    }

    public boolean backtrack(String s, Map<Character, List<String>> wordDict, String curStr) {
        if(curStr.length() > s.length()) {
            return false;
        }
        if(s.length() == curStr.length()) {
            return curStr.equals(s);
        }
        char startChar = s.charAt(curStr.length());
        List<String> strings = wordDict.getOrDefault(startChar, new ArrayList<>());
        boolean isResult = false;
        for(String dicStr: strings) {
            isResult = isResult || backtrack(s, wordDict, curStr + dicStr);
        }
        return isResult;
    }

    /**
     * Solution 2
     * USE DP reduce the complexity
     * Time Complexity: O(n^2)
     * @param s
     * @param wordDict
     * @return
     */
    public boolean wordBreak2(String s, List<String> wordDict) {
        Set<String> wordDictSet = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for(int i = 0; i <= s.length(); i++) {
            for(int j = 0; j < i; j++) {
                if(dp[j] && wordDictSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}
