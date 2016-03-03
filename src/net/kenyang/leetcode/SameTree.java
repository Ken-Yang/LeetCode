package net.kenyang.leetcode;



/**
 * Given two binary trees, write a function to check if they are equal or not.
 * Two binary trees are considered equal if they are structurally identical and the nodes have the same value.
 * @author Ken Yang
 *
 */
public class SameTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }
    
    public static void main(String[] args) {
        new SameTree();
    }
    public SameTree() {

        TreeNode tree1 = new TreeNode(0);
        tree1.left = new TreeNode(1);
        tree1.right = new TreeNode(2);
        tree1.right.right = new TreeNode(3);

        TreeNode tree2 = new TreeNode(0);
        tree2.left = new TreeNode(1);
        tree2.right = new TreeNode(2);
        tree2.right.right = new TreeNode(3);
        tree2.right.left = new TreeNode(3);
        
        System.out.println(isSameTree(tree1, tree2));
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        if (p != null && q != null)
            return p.val==q.val && isSameTree(p.left, q.left) && isSameTree(p.right,q.right);

        return false;
    }
}
