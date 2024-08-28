package tradition150;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle141 {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
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
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        do {
            if(fast == null || fast.next == null) {
                return false;
            }
            fast = fast.next.next;
            slow = slow.next;
        } while (fast != slow);
        return true;
    }

    /**
     * Solution 2
     * Time Complexity: O(n)
     * @param head
     * @return
     */
    public boolean hasCycle2(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while(head != null) {
            if(set.contains(head)) {
                return true;
            }
            set.add(head);
            head = head.next;
        }
        return false;
    }



}
