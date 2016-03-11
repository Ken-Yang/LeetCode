package net.kenyang.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Given a binary tree, return the level order traversal of its nodes' values.
 * (ie, from left to right, level by level).
 * 
 * @author Ken Yang
 *
 */
public class BinaryTreeLevelOrderTraversal {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    // solution
    public class Solution1 {
        public List<List<Integer>> levelOrder(TreeNode root) {
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
                    data.add(level);
                    level = new ArrayList<Integer>();
                    if (queue.isEmpty() == true)
                        break;
                    queue.offer(null);
                }
            }

            return data;
        }

    }

    // recursive solution
    public class Solution2 {
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> data = new ArrayList<>();
            levelOrder(root, 0, data);
            return data;
        }

        public void levelOrder(TreeNode root, int level,
                List<List<Integer>> data) {
            if (root == null) {
                return;
            }

            if (data.size() == level) {
                data.add(new ArrayList<>());
            }

            data.get(level).add(root.val);

            levelOrder(root.left, level + 1, data);
            levelOrder(root.right, level + 1, data);

            return;
        }
    }

    public BinaryTreeLevelOrderTraversal() {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);

        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);

        System.out.println(new Solution1().levelOrder(root));
        System.out.println(new Solution2().levelOrder(root));
    }

    public static void main(String[] args) {
        new BinaryTreeLevelOrderTraversal();
    }

}
