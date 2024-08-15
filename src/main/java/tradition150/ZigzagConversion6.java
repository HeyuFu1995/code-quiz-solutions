package tradition150;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ZigzagConversion6 {

    private class TestCase {
        static String s = "PAYPALISHIRING";

        static int numRows = 3;
    }

    public static void solution() {

    }

    /**
     * Solution
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * @param s
     * @param numRows
     * @return
     */
    public String convert(String s, int numRows) {
        List<Character>[] listArray = new List[numRows];
        for(int i = 0; i < numRows; i++) {
            listArray[i] = new ArrayList<>();
        }
        int iter = numRows > 2 ? numRows + numRows - 2 : numRows;
        for(int i = 0; i < s.length(); i++) {
            int count = i % iter;
            if(count < numRows) {
                listArray[count].add(s.charAt(i));
            } else {
                count = numRows - 1 - (count - numRows + 1);
                listArray[count].add(s.charAt(i));
            }
        }
        StringBuilder builder = new StringBuilder();
        for(List<Character> cList: listArray) {
            for(Character c: cList) {
                builder.append(c);
            }
        }
        return builder.toString();
    }


}
