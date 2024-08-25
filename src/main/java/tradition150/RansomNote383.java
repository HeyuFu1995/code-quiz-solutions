package tradition150;

public class RansomNote383 {
    private class TestCase {
        static String ransomNote = "aa";

        static String magazine = "aab";
    }

    public static void solution() {


    }

    /**
     * Solution
     * Time Complexity: O(m * n)
     * @param ransomNote
     * @param magazine
     * @return
     */
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] occurrences = new int[26];
        for(char c: magazine.toCharArray()) {
            occurrences[c - 'a']++;
        }
        for(char c: ransomNote.toCharArray()) {
            occurrences[c - 'a']--;
            if(occurrences[c - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}