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

    /**
     * Solution 2
     * Time Complexity: O(n)
     * @param head
     * @return
     */
    public Node copyRandomList2(Node head) {
        if(head == null) {
            return null;
        }
        Node cur = head;
        while(cur != null) {
            Node newNode = new Node(cur.val);
            newNode.next = cur.next;
            cur.next = newNode;
            cur = cur.next.next;
        }

        cur = head;
        while(cur != null) {
            if(cur.random != null) {
                cur.next.random = cur.random.next;
            }
            cur = cur.next.next;
        }
        cur = head;
        Node answer = head.next;
        Node a = answer;
        while(cur != null) {
            cur.next = cur.next.next;
            cur = cur.next;
            if(answer.next != null) {
                answer.next = answer.next.next;
            }
            answer = answer.next;
        }
        return a;
    }

}
