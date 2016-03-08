package net.kenyang.leetcode;

/**
 * Reverse a singly linked list.</br>
 * </br>
 * A linked list can be reversed either iteratively or recursively. Could you
 * implement both?
 * 
 * @author Ken Yang
 *
 */
public class ReverseLinkedList {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ReverseLinkedList() {
        ListNode node0 = new ListNode(0);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);

        node0.next = node1;
        node1.next = node2;

        node0 = reverseList(node0);
        ListNode nodetmp = node0;
        while (nodetmp != null) {
            System.out.println(nodetmp.val);
            nodetmp = nodetmp.next;
        }

    }

    public static void main(String[] args) {
        new ReverseLinkedList();
    }

    public ListNode reverseList(ListNode head) {

//        ListNode current = head;
//        ListNode prevNode = null;
//        ListNode nextNode = null;
//        while (current != null) {
//            nextNode = current.next;
//            current.next = prevNode;
//            prevNode = current;
//            current = nextNode;
//        }
//        return prevNode;

        if (head == null || head.next == null) {
            return head;
        }

        ListNode tmp = reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return tmp;
    }

}
