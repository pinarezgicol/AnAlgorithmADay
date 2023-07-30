package test;

import linkedlist.ListNode;
import org.junit.jupiter.api.Test;

import static linkedlist.RemoveDuplicates.deleteDuplicates;
import static org.junit.jupiter.api.Assertions.*;

public class TestRemoveDuplicates {
    @Test
    public void testRemoveDuplicates(){
        ListNode head = new ListNode(1);
        ListNode secondNode = new ListNode(1);
        ListNode thirdNode = new ListNode(2);
        head.next = secondNode;
        secondNode.next = thirdNode;

        ListNode newHead = deleteDuplicates(head);

        assertEquals(1, head.val);
        assertEquals(newHead.next.val, 2);
    }

    @Test
    public void testRemoveDuplicates2(){
        ListNode head = null;
        assertNull(deleteDuplicates(head));
    }

    @Test
    public void testRemoveDuplicates3(){
        ListNode head = new ListNode(1);
        assertEquals(deleteDuplicates(head), head);
    }
}
