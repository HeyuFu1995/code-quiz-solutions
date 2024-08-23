package tradition150;

public class ConvertSortedArrayToBinarySearchTree108 {

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
        static int[] nums = {-10,-3,0,5,9};
    }

    public static void solution() {

    }

    /**
     * Solution
     * Time Complexity: O(n)
     * @param nums
     * @return
     */
    public TreeNode sortedArrayToBST(int[] nums) {
        return dfs(nums, 0, nums.length - 1);
    }

    private TreeNode dfs(int[] nums, int left, int right) {
          if(left > right) {
              return null;
          }

          int mid = (left + right) / 2;

          TreeNode root = new TreeNode(nums[mid]);
          root.left = dfs(nums, left, mid - 1);
          root.right = dfs(nums, mid + 1, right);
          return root;
    }
}
