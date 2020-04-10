//  1161. Maximum Level Sum of a Binary Tree


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class MaximumLevelSumBinaryTree {
    public int maxLevelSum(TreeNode root) {
        if (root == null) return 0;
        int max = Integer.MIN_VALUE;
        int level = 0;
        int result = 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            int sum = 0;
            level++;
            for (int i = 0; i < size; i++) {
                TreeNode treeNode = queue.remove();
                sum += treeNode.val;
                if (treeNode.left != null) {
                    queue.add(treeNode.left);
                }
                if (treeNode.right != null) {
                    queue.add(treeNode.right);
                }
            }
            if (sum > max) {
                max = sum;
                result = level;
            }
        }
        return result;
    }
}