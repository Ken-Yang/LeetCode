package net.kenyang.leetcode;

/**
 * Given a binary tree, find its maximum depth. </br>
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 * @author Ken Yang
 *
 */
public class MaximumDepthOfBinaryTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        new MaximumDepthOfBinaryTree();
    }

    public MaximumDepthOfBinaryTree() {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        root.right.left = new TreeNode(3);
        root.right.left.left = new TreeNode(4);
        System.out.println(maxDepth(root));
    }

    public int maxDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int iRightDepth = maxDepth(root.right);
        int iLefttDepth = maxDepth(root.left);
        return (iRightDepth > iLefttDepth) ? iRightDepth + 1 : iLefttDepth + 1;
    }
}
