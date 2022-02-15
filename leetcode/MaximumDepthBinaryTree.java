//  104. Maximum Depth of Binary Tree

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class MaximumDepthBinaryTree {

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int left_h = maxDepth(root.left);
        int right_h = maxDepth(root.right);
        return Math.max(left_h, right_h) + 1;
    }
}