package tradition150;

import java.util.*;

public class MergeKSortedLists23 {
     /**
     * Definition for singly-linked list.
     */
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }


    private class TestCase {
    }

    public static void solution() {

    }

    /**
     * Solution
     * Time Complexity: O(nlog(n)) Insertion on PriorityQyeye: O(logn)
     * @param lists
     * @return
     */
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode demoNode = new ListNode();
        ListNode pre = demoNode;
        Queue<ListNode> priorityQueue = new PriorityQueue<>(lists.length, Comparator.comparingInt(o -> o.val));
        for(ListNode node: lists) {
            if(node != null) {
                priorityQueue.offer(node);
            }
        }

        while(!priorityQueue.isEmpty()) {
            pre.next = priorityQueue.poll();
            pre = pre.next;
            if(pre.next != null) {
                priorityQueue.offer(pre.next);
            }
        }

        return demoNode.next;
    }
}
