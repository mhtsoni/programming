package com.programming;

import java.util.Stack;

/**
 * Validate Binary Search Tree
 * <a href="https://leetcode.com/problems/validate-binary-search-tree/description/">...</a>
 */
public class IsValidBst {
    public boolean isValidBST(TreeNode root) {
        Stack<TreeNode> s = new Stack<>();
        TreeNode lastPoppedNode = null;
        while(!s.isEmpty() || root!= null) {
            while(root!=null) {
                s.push(root);
                root = root.left;
            }
            TreeNode nodeOnTopOfStack = s.pop();
            if(lastPoppedNode!= null && lastPoppedNode.val>=nodeOnTopOfStack.val) return false;
            if(nodeOnTopOfStack!=null) {
                lastPoppedNode = nodeOnTopOfStack;
                root = nodeOnTopOfStack.right;
            }
        }
        return true;
    }
}
