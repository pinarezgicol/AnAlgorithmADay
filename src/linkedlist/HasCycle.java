package linkedlist;

/*
https://leetcode.com/problems/linked-list-cycle/

Given head, the head of a linked list, determine if the linked list has a cycle in it.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.

Return true if there is a cycle in the linked list. Otherwise, return false.
 */

public class HasCycle {
    public static boolean hasCycle(ListNode head) {
        ListNode slowRunner = head;
        ListNode fastRunner = head;

        while (slowRunner != null && fastRunner != null){
            slowRunner = slowRunner.next;
            fastRunner = fastRunner.next;
            if (fastRunner == null){
                return false;
            }
            fastRunner = fastRunner.next;

            if (slowRunner == fastRunner){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        ListNode secondNode = new ListNode(2);
        ListNode thirdNode = new ListNode(0);
        ListNode forthNode = new ListNode(-4);
        head.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = forthNode;
        forthNode.next = secondNode;
    }
}