package tradition150;

import java.util.ArrayList;
import java.util.List;

public class Combinations77 {
    private class TestCase {
        static int n = 4;

        static int k = 2;
    }

    public static void solution() {

    }

    /**
     * Solution
     * Time Complexity: O(n * k)
     */
    List<Integer> temp = new ArrayList<>();
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        backTrack(1, n, k);
        return ans;
    }

    public void backTrack(int cur, int n, int k) {
        if(temp.size() + (n - cur + 1) < k) {
            return;
        }
        if(temp.size() == k) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        temp.add(cur);
        backTrack(cur + 1, n, k);
        temp.remove(temp.size() - 1);
        backTrack(cur + 1, n, k);
    }
}
