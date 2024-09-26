package tradition150;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevelsInBinaryTree637 {

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
    private class TestCase {
        static int[][] intervals = {{1,3},{6,9}};

        static int[] newInterval = {2,5};
    }

    public static void solution() {

    }

    /**
     * Solution
     * Time Complexity: O(n)
     * @param root
     * @return
     */
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new ArrayList<>();
        if(root == null) {
            return ans;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            int n = queue.size();
            long sum = 0;
            for(int i = 0; i < n; i++){
                TreeNode cur = queue.poll();
                sum += cur.val;
                if(cur.left != null) {
                    queue.offer(cur.left);
                }
                if(cur.right != null) {
                    queue.offer(cur.right);
                }
            }
            ans.add((double)sum / n);
        }
        return ans;
    }
}
