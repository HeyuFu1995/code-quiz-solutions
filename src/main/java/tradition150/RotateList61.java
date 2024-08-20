package tradition150;

import java.util.LinkedList;
import java.util.List;

public class RotateList61 {
    
    public class ListNode {
       int val;
       ListNode next;
       ListNode() {}
       ListNode(int val) { this.val = val; }
       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
   }

    private class TestCase {

        static String s = "abcabcbb";
    }

    public static void solution() {

    }

    /**
     * Solution
     * Time Complexity: O(n)
     * @param head
     * @param k
     * @return
     */
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) {
            return head;
        }

        List<ListNode> listNode = new LinkedList<>();
        while(head != null) {
            listNode.add(head);
            head = head.next;
        }

        k %= listNode.size();

        if(k == 0) {
            return listNode.get(0);
        }

        listNode.get(listNode.size() - 1).next = listNode.get(0);
        listNode.get(listNode.size() - k - 1).next = null;
        return listNode.get(listNode.size() - k);
    }
}
