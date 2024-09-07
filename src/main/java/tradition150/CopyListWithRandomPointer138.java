package tradition150;

import java.util.HashMap;
import java.util.Map;

public class CopyListWithRandomPointer138 {

    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    private class TestCase {

    }

    public static void solution() {

    }

    /**
     * Solution
     * Time Complexity: O(n)
     * @param head
     * @return
     */
    public Node copyRandomList(Node head) {
        if(head == null) {
            return null;
        }
        Map<Node, Node> newOldMap = new HashMap<>();
        Node result = head;
        Node pre = null;
        while(head != null) {
            Node newNode = new Node(head.val);
            if(pre != null) {
                pre.next = newNode;
            }
            pre = newNode;
            newOldMap.put(head, newNode);
            head = head.next;
        }
        head = result;
        while(head != null) {
            newOldMap.get(head).random = newOldMap.get(head.random);
            head = head.next;
        }
        return newOldMap.get(result);
    }

}
