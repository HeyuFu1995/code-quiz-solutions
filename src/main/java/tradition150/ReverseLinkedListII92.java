package tradition150;

import java.util.Stack;

public class ReverseLinkedListII92 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    private class TestCase {
        ListNode[] head = {new ListNode(1), new ListNode(2),new ListNode(3),new ListNode(4),new ListNode(5)};

        int left = 2;

        int right = 4;
    }

    public static void solution() {
    }

    /**
     * Solution
     * Time Complexity : O(n)
     * Space Complexity: O(right -left)
     * @param head
     * @param left
     * @param right
     * @return
     */
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode pre = new ListNode();
        ListNode tail = null;

        Stack<ListNode> nodeStack = new Stack<>();
        ListNode cur = head;
        int nodeIndex = 1;
        while(cur != null) {
            if(nodeIndex == left - 1) {
                pre = cur;
            }
            if(nodeIndex >= left && nodeIndex <= right){
                nodeStack.push(cur);
            }
            if(nodeIndex == right + 1) {
                tail = cur;
            }
            cur = cur.next;
            nodeIndex++;
        }

        pre.next = nodeStack.pop();
        cur = pre.next;
        while(!nodeStack.isEmpty()) {
            cur.next = nodeStack.pop();
            cur = cur.next;
        }
        cur.next = tail;
        return pre.val == 0 ? pre.next: head;
    }


    /**
     * Solution 2
     * Time Complexity : O(n)
     * Space Complexity: O(1)
     * @param head
     * @param left
     * @param right
     * @return
     */
    public ListNode reverseBetween2(ListNode head, int left, int right) {
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;
        ListNode pre = dummyNode;

        for(int i = 0; i < left - 1; i++) {
            pre = pre.next;
        }
        ListNode cur = pre.next;
        ListNode next;
        //First sign cur.next value to next
        //then which value was signed change which pointer until next value has been signed
        for(int i = 0; i < right - left + 1; i++) {
            //1 pointer next -> cur.next
            next = cur.next;
            //2 cur.next -> next.next
            cur.next = next.next;
            //3 next.next -> pre.next
            next.next = pre.next;
            //4 pre.next -> next
            pre.next = next;
        }

        return dummyNode.next;
    }

}
