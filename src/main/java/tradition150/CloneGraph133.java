package tradition150;

import java.util.*;

public class CloneGraph133 {
    class Node {
        public int val;
        public List<Node> neighbors;
        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }

    private class TestCase {

    }

    public static void solution() {

    }

    /**
     * Solution
     * Time Complexity: O(n * m) n = nums of Node, m = relations of Node
     * @param node
     * @return
     */
    public Node cloneGraph(Node node) {
        if(node == null) {
            return null;
        }
        Map<Node, Node> nodeMap = new HashMap<>();
        Queue<Node> queue = new LinkedList<>();
        queue.offer(node);
        while(!queue.isEmpty()) {
            Node cur = queue.poll();
            Node newNode = new Node(cur.val);
            nodeMap.put(cur, newNode);
            for (Node neighbor : cur.neighbors) {
                if(!nodeMap.containsKey(neighbor)) {
                    queue.offer(neighbor);
                }
            }
        }
        for (Map.Entry<Node, Node> nodeEntry : nodeMap.entrySet()) {
            for (Node neighbor : nodeEntry.getKey().neighbors) {
                nodeEntry.getValue().neighbors.add(nodeMap.get(neighbor));
            }
        }

        return nodeMap.get(node);
    }
}
