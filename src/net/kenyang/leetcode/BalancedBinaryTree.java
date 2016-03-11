package net.kenyang.leetcode;

public class BalancedBinaryTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public class Solution {
        public boolean isBalanced(TreeNode root) {
            if (root == null) return true;
            return (getHeight(root) != -1);
        }

        public int getHeight(TreeNode root) {

            if (root == null) {
                return 0;
            }

            int iLeftHeight = getHeight(root.left);
            int iRightHeight = getHeight(root.right);
            if (iLeftHeight == -1 || iRightHeight == -1) {
                return -1;
            }
            
            if (Math.abs(iLeftHeight - iRightHeight) > 1) {
                return -1;
            }

            return (iLeftHeight > iRightHeight) ? iLeftHeight + 1 : iRightHeight + 1;
        }
    }

    public BalancedBinaryTree() {

        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(1);

        root.left.right = new TreeNode(2);
        root.left.left = new TreeNode(2);

        System.out.println(new Solution().isBalanced(root));
        
        TreeNode root2 = new TreeNode(0);
        root2.right = new TreeNode(1);
        root2.right.right = new TreeNode(2);
        System.out.println(new Solution().isBalanced(root2));
        
        TreeNode root3 = new TreeNode(1);
        root3.left = new TreeNode(2);
        root3.left.left = new TreeNode(3);
        root3.left.left.left = new TreeNode(4);
        root3.right = new TreeNode(2);
        root3.right.right = new TreeNode(3);
        root3.right.right.right = new TreeNode(4);
        System.out.println(new Solution().isBalanced(root3));

        
    }

    public static void main(String[] args) {
        new BalancedBinaryTree();
    }

}
