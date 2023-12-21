package com.programming;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class AddTwoNumbersTest {
    @Test
    public void testAddTwoNumbers() {
        ListNode l1 = new ListNode();
        ListNode l2 = new ListNode();
        ListNode l3 = new ListNode();
        ListNode l4 = new ListNode();
        ListNode l5 = new ListNode();
        ListNode l6 = new ListNode();
        ListNode l7 = new ListNode();
        ListNode l8 = new ListNode();
        ListNode l9 = new ListNode();
        ListNode l10 = new ListNode();
        ListNode l11 = new ListNode();
        l1.val = 9;
        l2.val = 1;
        l3.val = 9;
        l4.val = 9;
        l5.val = 9;
        l6.val = 9;
        l7.val = 9;
        l8.val = 9;
        l9.val = 9;
        l10.val = 9;
        l11.val = 9;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        l6.next = l7;
        l7.next = l8;
        l8.next = l9;
        l9.next = l10;
        l10.next = l11;

        ListNode l = new AddTwoNumbers().addTwoNumbers(l1, l2);
        while (l != null) {
            System.out.print(l.val);
            l = l.next;
        }
        System.out.println("Tested");
    }

}