package com.programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/merge-k-sorted-lists/">...</a>
 * Merge k Sorted Lists
 */
public class MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        List<ListNode> li =
                Arrays.stream(lists).flatMap(listNode -> getListOfAllNodesStartingFromHead(listNode).stream()).sorted(Comparator.comparingInt(a -> a.val)).toList();
        for(int i =0; i< li.size()-1; i++) {
            li.get(i).next = li.get(i + 1);
        }
        if(li.size() == 0 )
            return null;
        return li.get(0);
    }

    private List<ListNode> getListOfAllNodesStartingFromHead(ListNode listNode) {
        List<ListNode> li = new ArrayList<ListNode>();
        while (listNode!=null) {
            li.add(listNode);
            listNode = listNode.next;
        }
        return li;
    }
}
