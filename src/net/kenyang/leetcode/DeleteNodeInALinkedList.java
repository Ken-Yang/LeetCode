package net.kenyang.leetcode;

/**
 * Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.
 * </br></br>
 * Supposed the linked list is 1 -> 2 -> 3 -> 4 and you are given the third node with value 3, 
 * the linked list should become 1 -> 2 -> 4 after calling your function.
 * @author Ken Yang
 *
 */
public class DeleteNodeInALinkedList {

    public DeleteNodeInALinkedList() {
        ListNode node0 = new ListNode(0);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        node0.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = null;
        deleteNode(node1);
        System.out.println(node1.val);
    }

    public static void main(String[] args) {
        new DeleteNodeInALinkedList();
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

}
