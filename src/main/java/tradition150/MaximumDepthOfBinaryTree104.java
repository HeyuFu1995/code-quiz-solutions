package tradition150;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumDepthOfBinaryTree104 {
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
    }

    private class TestCase {

    }

    public static void solution() {

    }

    /**
     * Solution BFS
     * Time Complexity: O(n)
     * @param root
     * @return
     */
    public int maxDepth(TreeNode root) {
        int depth = 0;
        if(root == null) {
            return depth;
        }
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.offer(root);
        while(!nodeQueue.isEmpty()) {
            depth++;
            int size = nodeQueue.size();
            for(int i = 0; i < size; i++) {
                TreeNode node = nodeQueue.poll();
                if(node.left != null) {
                    nodeQueue.offer(node.left);
                }
                if(node.right != null) {
                    nodeQueue.offer(node.right);
                }
            }
        }
        return depth;
    }
}
