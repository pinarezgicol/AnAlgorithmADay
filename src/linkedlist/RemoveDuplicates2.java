package linkedlist;
/*
https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/description/
Given the head of a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list. Return the linked list sorted as well.
*/
public class RemoveDuplicates2 {
    public static ListNode deleteDuplicates2(ListNode head){
        if (head == null || head.next == null){
            return head;
        }
        ListNode dummy = new ListNode(-1000, head);

        ListNode curr = dummy;
        ListNode nextNode = curr.next;

        while (nextNode!=null){
            boolean hasDuplicate = nextNode.next != null && nextNode.val == nextNode.next.val;
            if (hasDuplicate){
                int value = nextNode.val;
                while (nextNode != null && nextNode.val == value){
                    nextNode = nextNode.next;
                }
                curr.next = nextNode;
            }
            else{
                curr = curr.next;
                nextNode = curr.next;
            }
        }
        return dummy.next;
    }
}
