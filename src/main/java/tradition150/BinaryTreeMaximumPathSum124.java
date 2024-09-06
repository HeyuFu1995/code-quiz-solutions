package tradition150;

public class BinaryTreeMaximumPathSum124 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        private class TestCase {
            static int n = 3;
        }

        public static void solution() {

        }

        /**
         * Solution
         * Time Complexity: O(n)
         */
        int maxPathValue = Integer.MIN_VALUE;
        public int maxPathSum(TreeNode root) {
            maxContribute(root);
            return maxPathValue;
        }

        private int maxContribute(TreeNode root) {
            if(root == null) {
                return 0;
            }

            int leftGain = Math.max(maxContribute(root.left), 0);
            int rightGain = Math.max(maxContribute(root.right), 0);

            int priceNewPath = root.val + leftGain + rightGain;
            maxPathValue = Math.max(maxPathValue, priceNewPath);

            return root.val + Math.max(leftGain, rightGain);
        }
    }
}
