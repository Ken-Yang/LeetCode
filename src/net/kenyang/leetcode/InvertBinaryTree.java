package net.kenyang.leetcode;



/**
 * Invert a binary tree.
 * </br>
 *      4 
 *    /   \ 
 *   2     7
 *  / \   / \ 
 * 1   3 6   9
 * to
 *      4
 *    /   \
 *   7     2
 *  / \   / \
 * 9   6 3   1
 * 
 * 
 * @author Ken Yang
 *
 */
public class InvertBinaryTree {
    
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    
    public InvertBinaryTree() {
    }

    public static void main(String[] args) {
        new InvertBinaryTree();
    }
    
    public TreeNode invertTree(TreeNode root) {
        if (root != null) {
            final TreeNode tmp = root.left;
            root.left = invertTree(root.right);
            root.right = invertTree(tmp);
        }

        return root;
    }

}
