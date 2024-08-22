package tradition150;

import java.util.LinkedList;
import java.util.Queue;

public class SumRootToLeafNumbers129 {
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
        }

        public static void solution() {

        }

        /**
         * Solution
         * dfs
         * Time Complexity: O(n)
         * @param root
         * @return
         */
        public int sumNumbers(TreeNode root) {
            return dfs(root, 0);
        }

        public int dfs(TreeNode root, int prevNum) {
            if (root == null) {
                return 0;
            }
            int curNum = prevNum * 10 + root.val;
            if (root.left == null && root.right == null) {
                return curNum;
            }
            return dfs(root.left, curNum) + dfs(root.right, curNum);
        }

        /**
         * Solution 2
         * BFS
         * @param root
         * @return
         */
        public int sumNumbers2(TreeNode root) {
            if(root == null) {
                return 0;
            }
            int sum = 0;
            Queue<TreeNode> nodeQueue = new LinkedList<>();
            Queue<Integer> numQueue = new LinkedList<>();
            nodeQueue.offer(root);
            numQueue.offer(root.val);
            while(!nodeQueue.isEmpty()) {
                TreeNode node = nodeQueue.poll();
                int num = numQueue.poll();
                TreeNode left = node.left;
                TreeNode right = node.right;
                if(left == null && right == null) {
                    sum += num;
                } else {
                    if(left != null) {
                        nodeQueue.offer(left);
                        numQueue.offer(num * 10 + left.val);
                    }
                    if(right != null) {
                        nodeQueue.offer(right);
                        numQueue.offer(num * 10 + right.val);
                    }
                }
            }
            return sum;
        }
    }
}
