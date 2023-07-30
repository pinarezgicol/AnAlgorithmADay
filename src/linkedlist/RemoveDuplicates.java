package linkedlist;
/*
https://leetcode.com/problems/remove-duplicates-from-sorted-list/
Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.
 */
public class RemoveDuplicates {
    public static ListNode deleteDuplicates(ListNode head){
        if (head == null){
            return null;
        }
        ListNode prev = head;
        while (prev != null){
            ListNode curr = prev.next;
            if (curr != null && curr.val == prev.val){
                prev.next = curr.next;
            }
            else{
                prev = prev.next;
            }
        }
        return head;
    }
}
