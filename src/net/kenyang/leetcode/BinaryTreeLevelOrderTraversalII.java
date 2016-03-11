package net.kenyang.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class BinaryTreeLevelOrderTraversalII {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    
    public class Solution {
        public List<List<Integer>> levelOrderBottom(TreeNode root) {
            List<List<Integer>> data = new ArrayList<>();
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            queue.offer(null);

            List<Integer> level = new ArrayList<Integer>();
            while (true) {
                final TreeNode node = queue.poll();
                if (node != null) {
                    level.add(node.val);
                    if (node.left != null) {
                        queue.offer(node.left);
                    }

                    if (node.right != null) {
                        queue.offer(node.right);
                    }
                    
                } else {
                    data.add(0,level);
                    level = new ArrayList<Integer>();
                    if (queue.isEmpty() == true)
                        break;
                    queue.offer(null);
                }
            }

            return data;
        }
    }

    public BinaryTreeLevelOrderTraversalII() {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);

        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);

        System.out.println(new Solution().levelOrderBottom(root));
    }

    public static void main(String[] args) {
        new BinaryTreeLevelOrderTraversalII();
    }

}
