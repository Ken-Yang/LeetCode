package net.kenyang.leetcode;

public class SymmetricTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    
    public static void main(String[] args) {
        new SymmetricTree();
    }

    public SymmetricTree() {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(2);
        root.right.right = new TreeNode(2);
        System.out.println(isSymmetric(root));
    }
    
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        return isSymmetric(root.left, root.right);
    }

    public boolean isSymmetric(TreeNode leftNode, TreeNode rightNode) {
        if (rightNode == null && leftNode == null)
            return true;
        if (rightNode == null)
            return false;
        if (leftNode == null)
            return false;

        
        return leftNode.val == rightNode.val
                && isSymmetric(leftNode.left, rightNode.right)
                && isSymmetric(leftNode.right, rightNode.left);

    }
}
