package test;

import linkedlist.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static linkedlist.HasCycle.hasCycle;

public class TestHasCycle {
    @Test
    public void testHasCycle(){
        ListNode head = new ListNode(3);
        ListNode secondNode = new ListNode(2);
        ListNode thirdNode = new ListNode(0);
        ListNode forthNode = new ListNode(-4);
        head.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = forthNode;
        forthNode.next = secondNode;

        Assertions.assertTrue(hasCycle(head));
    }

    @Test
    public void testHasCycle2(){
        ListNode head = new ListNode(3);

        Assertions.assertFalse(hasCycle(head));
    }

    @Test
    public void testHasCycle3(){
        ListNode head = null;

        Assertions.assertFalse(hasCycle(head));
    }

    @Test
    public void testHasCycle4(){
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);

        Assertions.assertFalse(hasCycle(head));
    }
}
