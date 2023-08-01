package linkedlist;

/*
https://leetcode.com/problems/add-two-numbers/

You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode curr1 = l1;
        ListNode curr2 = l2;

        ListNode dummy = new ListNode();
        ListNode curr = dummy;
        int leading = 0;

        while (curr1 != null || curr2 != null || leading != 0){
            int val1 = 0;
            int val2 = 0;
            if (curr1 != null){
                val1 = curr1.val;
            }
            if (curr2 != null){
                val2 = curr2.val;
            }
            int sum = val1 + val2 + leading;
            ListNode newNode = new ListNode(sum % 10);
            curr.next = newNode;
            curr = newNode;
            leading = sum / 10;
            if (curr1 != null)
                curr1 = curr1.next;
            if (curr2 != null)
                curr2 = curr2.next;
        }
        return dummy.next;
    }
}
