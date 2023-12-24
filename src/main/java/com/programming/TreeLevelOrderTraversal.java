package com.programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Binary Tree Level Order Traversal iterative and recursive solution
 * <a href="https://leetcode.com/problems/binary-tree-level-order-traversal/description/">...</a>
 */
public class TreeLevelOrderTraversal {
    public List<List<Integer>> levelOrderRecursiveSolution(TreeNode root) {
        HashMap<Integer, List<Integer> > m = new HashMap();
        traverseLevel(m,0,root);
        return new ArrayList<List<Integer>>(m.values());
    }

    public void traverseLevel(HashMap<Integer, List<Integer> > m, int level, TreeNode root) {
        if(root == null) return;
        if(!m.containsKey(level)) {
            m.put(level, new ArrayList<>(Arrays.asList(root.val)));
        }
        else {
            List<Integer> g = m.get(level);
            g.add(root.val);
            m.put(level, g);
        }
        traverseLevel(m, level+1, root.left);
        traverseLevel(m, level+1, root.right);
    }

    public List<List<Integer>> levelOrderIterativeSolution(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        List<List<Integer>> solution = new ArrayList<>();
        while(!q.isEmpty()) {
            int level = q.size();
            List<Integer> subSolution = new ArrayList();
            for(int i=0; i< level; i++) {
                TreeNode nodeOnTopOfQueue = q.poll();
                if(nodeOnTopOfQueue!=null) {
                    subSolution.add(nodeOnTopOfQueue.val);
                    if(nodeOnTopOfQueue.left!=null)
                        q.add(nodeOnTopOfQueue.left);
                    if(nodeOnTopOfQueue.right!=null)
                        q.add(nodeOnTopOfQueue.right);
                }
            }
            if(subSolution.size()>=1)
                solution.add(subSolution);
        }
        return solution;
    }
}
