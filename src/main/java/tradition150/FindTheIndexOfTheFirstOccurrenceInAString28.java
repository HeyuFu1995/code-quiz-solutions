package tradition150;

public class FindTheIndexOfTheFirstOccurrenceInAString28 {

    private class TestCase {
        static String haystack = "sadbutsad";

        static String needle = "sad";
    }

    public static void solution() {

    }

    /**
     * Solution
     * Time Complexity: O(n * m)
     * @param haystack
     * @param needle
     * @return
     */
    public int strStr(String haystack, String needle) {
        int hayLength =haystack.length();
        int needleLength = needle.length();

        for(int i = 0; i < hayLength - needleLength + 1; i++) {
            if(needle.equals(haystack.substring(i, i + needleLength))) {
                return i;
            }
        }
        return -1;
    }


}
