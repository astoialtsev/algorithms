package leetcode.easy;

/**
 * https://leetcode.com/problems/delete-node-in-a-linked-list/
 */
public class DeleteNodeInLinkedList {

    /**
     * Definition for singly-linked list. public class ListNode { int val; ListNode next; ListNode(int x) { val = x; }
     * }
     */
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}