package com.programming;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * <a href="https://leetcode.com/problems/binary-tree-inorder-traversal/description/">...</a>
 * Binary Tree Inorder Traversal
 */
public class BinarySearchTreeInOrderTraversalIterativeSolution {
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> s = new Stack<TreeNode>();
        List<Integer> solution = new ArrayList();
        s.push(root);
        while(!s.empty()) {
            if(root != null && root.left != null) {
                s.push(root.left);
                root = root.left;
            }
            else {
                TreeNode nodeOnTopOfStack = s.pop();
                if(nodeOnTopOfStack != null ) {
                    solution.add(nodeOnTopOfStack.val);
                    if(nodeOnTopOfStack.right != null){
                        root = nodeOnTopOfStack.right;
                        s.push(root);
                    }
                }
            }
        }
        return solution;
    }
}
