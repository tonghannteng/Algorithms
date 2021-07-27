//  1448. Count Good Nodes in Binary Tree

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
class CountGoodNodesBinaryTree {

    public int goodNodes(TreeNode root) {
        if (root == null) return 0;
        int count = 1;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll();
                int value = current.val;
                if (current.left != null) {
                    if (current.left.val >= value) {
                        count++;
                    } else {
                        current.left.val = value;
                    }
                    queue.add(current.left);
                }
                if (current.right != null) {
                    if (current.right.val >= value) {
                        count++;
                    } else {
                        current.right.val = value;
                    }
                    queue.add(current.right);
                }
            }
        }
        return count;
    }

}