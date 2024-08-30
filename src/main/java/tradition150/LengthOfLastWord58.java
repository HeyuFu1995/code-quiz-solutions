package tradition150;

public class LengthOfLastWord58 {

    private class TestCase {

        static String s = "Hello World";
    }

    public static void solution() {

    }

    /**
     * Solution
     * Time Complexity: O(n)
     * @param s
     * @return
     */
    public int lengthOfLastWord(String s) {
        int length = 0;
        for(int i = s.length() - 1; i >= 0; i++) {
            if(length != 0 && !Character.isLetter(s.charAt(i))){
                break;
            }
            if(Character.isLetter(s.charAt(i))) {
                length++;
            }
        }

        return length;
    }
}
