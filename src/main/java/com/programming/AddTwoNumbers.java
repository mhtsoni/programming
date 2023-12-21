package com.programming;

import java.util.Optional;

/**
 * Add Two Numbers
 * <a href="https://leetcode.com/problems/add-two-numbers/description/">...</a>
 */
public class AddTwoNumbers {

//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        int number1 = getIntegerFromLinkedList(l1);
//        int number2 = getIntegerFromLinkedList(l2);
//        return getLinkedListFromNumber(number1 + number2);
//    }
//
//    private int getIntegerFromLinkedList(ListNode l) {
//        int number = 0;
//        int multiplier = 1;
//        while(l != null) {
//            number += (l.val * multiplier);
//            multiplier *= 10;
//            l = l.next;
//        }
//        return number;
//    }
//
//    private ListNode getLinkedListFromNumber(int number) {
//        int divider = 1;
//        ListNode startingNode = new ListNode();
//        ListNode prev = new ListNode();
//        while(number >= divider) {
//            int value = ((int)(number/divider)) % 10;
//            ListNode l = new ListNode();
//            l.val = value;
//            prev.next = l;
//            if(divider == 1) {
//                startingNode = l;
//            }
//            if(divider == 10) {
//                startingNode = prev;
//            }
//            prev = l;
//            divider *= 10;
//        }
//        return startingNode;
//    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode prev = new ListNode();
        ListNode startNode = new ListNode();
        int iteration = 0;
        int carry = 0;
        while(l1 != null || l2 != null) {
            int l1Val = Optional.ofNullable(l1).map(x -> x.val).orElse(0);
            int l2Val = Optional.ofNullable(l2).map(x -> x.val).orElse(0);
            int sum = l1Val + l2Val + carry;
            if(sum > 9) {
                sum %= 10;
                carry = 1;
            }
            else {
                carry = 0;
            }
            ListNode l = new ListNode();
            l.val = sum;
            prev.next = l;
            if (iteration == 0) {
                startNode = l;
            }
            if (iteration == 1) {
                startNode = prev;
            }
            prev = l;

            l1 = Optional.ofNullable(l1).map(x -> x.next).orElse(null);
            l2 = Optional.ofNullable(l2).map(x -> x.next).orElse(null);
            System.out.println(l1);
            System.out.println(l2);
            iteration++;
        }
        if (carry == 1) {
            ListNode lastNode = new ListNode();
            lastNode.val = carry;
            prev.next = lastNode;
        }
        return startNode;
    }
}
