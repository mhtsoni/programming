package com.programming;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * Binary Tree Zigzag Level Order Traversal
 * <a href="https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/description/">...</a>
 */
public class ZigZagOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Deque<TreeNode> q = new ArrayDeque<>();
        boolean isOrderInversed = false;
        if(root!=null)
            q.offer(root);
        List<List<Integer>> solution = new ArrayList<>();
        while(q.size() > 0) {
            List<Integer> subSolution = new ArrayList<>();
            int level = q.size();
            for(int i=0;i<level; i++) {

                TreeNode nodeOnTop = null;
                if(isOrderInversed) {
                    nodeOnTop = q.pollLast();
                }
                else {
                    nodeOnTop = q.pollFirst();
                }
                if(nodeOnTop != null) {
                    subSolution.add(nodeOnTop.val);
                    if(isOrderInversed) {
                        if(nodeOnTop.right!=null) q.offerFirst(nodeOnTop.right);
                        if(nodeOnTop.left!=null) q.offerFirst(nodeOnTop.left);
                    }
                    else {
                        if(nodeOnTop.left!=null) q.offerLast(nodeOnTop.left);
                        if(nodeOnTop.right!=null) q.offerLast(nodeOnTop.right);
                    }
                }
            }
            isOrderInversed = !isOrderInversed;
            if(subSolution.size()>0)
                solution.add(subSolution);
        }
        return solution;
    }
}
