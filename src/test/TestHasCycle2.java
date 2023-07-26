package test;

import linkedlist.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static linkedlist.HasCycle2.hasCycle;


public class TestHasCycle2 {
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

        Assertions.assertEquals(hasCycle(head), secondNode);
    }

    @Test
    public void testHasCycle2(){
        ListNode head = new ListNode(3);

        Assertions.assertNull(hasCycle(head));
    }

    @Test
    public void testHasCycle3(){
        ListNode head = null;

        Assertions.assertNull(hasCycle(head));
    }

    @Test
    public void testHasCycle4(){
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);

        Assertions.assertNull(hasCycle(head));
    }
}
