//  404. Sum of Left Leaves

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class SumLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int sum = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll();
                if (current.left != null) {
                    queue.add(current.left);
                    if (current.left.left == null && current.left.right == null) {
                        sum+=current.left.val;
                    }
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
            }
        }
        return sum;
    }
}