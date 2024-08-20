package tradition150;

import java.util.*;

public class BinaryTreeZigzagLevelOrderTraversal103 {

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
     * Solution
     * Time Complexity: O(n)
     * BFS
     * @param root
     * @return
     */
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new LinkedList<>();
        if(root == null) {
            return ans;
        }
        Deque<TreeNode> headQueue = new LinkedList<>();
        Deque<TreeNode> tailQueue = new LinkedList<>();
        headQueue.offer(root);

        while(!headQueue.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            while (!headQueue.isEmpty()) {
                TreeNode node = headQueue.poll();
                list.add(node.val);
                if (node.left != null) {
                    tailQueue.offer(node.left);
                }
                if (node.right != null) {
                    tailQueue.offer(node.right);
                }
            }
            ans.add(list);
            if(!tailQueue.isEmpty()) {
                list = new ArrayList<>();
                while (!tailQueue.isEmpty()) {
                    TreeNode node = tailQueue.pollLast();
                    list.add(node.val);
                    if (node.right != null) {
                        headQueue.offerFirst(node.right);
                    }
                    if (node.left != null) {
                        headQueue.offerFirst(node.left);
                    }
                }
                ans.add(list);
            }
        }
        return ans;
    }

    /**
     * Solution 2
     * @param root
     * @return
     */
    public List<List<Integer>> zigzagLevelOrder2(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) {
            return ans;
        }
        Queue<TreeNode> nodeQueue = new ArrayDeque<>();
        nodeQueue.offer(root);
        boolean isLeft = true;
        while(!nodeQueue.isEmpty()) {
            Deque<Integer> levelList = new LinkedList<>();
            int size = nodeQueue.size();
            for(int i = 0; i < size; i++) {
                TreeNode curNode = nodeQueue.poll();
                if(isLeft) {
                    levelList.offerLast(curNode.val);
                } else {
                    levelList.offerFirst(curNode.val);
                }
                if(curNode.left != null) {
                    nodeQueue.offer(curNode.left);
                }
                if(curNode.right != null) {
                    nodeQueue.offer(curNode.right);
                }
            }
            ans.add(new ArrayList<>(levelList));
            isLeft = !isLeft;
        }
        return ans;
    }
}
