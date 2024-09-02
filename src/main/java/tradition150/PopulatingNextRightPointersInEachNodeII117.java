package tradition150;

import java.util.LinkedList;
import java.util.Queue;

public class PopulatingNextRightPointersInEachNodeII117 {

    static class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }


    private class TestCase {

    }

    public static void solution() {

    }

    /**
     * Solution
     * Time Complexity: O(n)
     * @param root
     * @return
     */
    public Node connect(Node root) {
        if(root == null) {
            return null;
        }

        Node tempNode = root;

        Queue<Node> queue = new LinkedList<>();

        queue.offer(root);
        while(!queue.isEmpty()) {
            int length = queue.size();
            for(int i = 0; i < length; i++) {
                Node temp = queue.poll();
                if(temp.left != null) {
                    queue.offer(temp.left);
                }
                if(temp.right != null) {
                    queue.offer(temp.right);
                }
                temp.next = i == length - 1 ? null : queue.peek();
            }
        }

        return tempNode;
    }
}
