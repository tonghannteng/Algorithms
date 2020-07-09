//  662. Maximum Width of Binary Tree

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class MaximumWidthBinaryTree {
    public int widthOfBinaryTree(TreeNode root) {
        List<TreeNode> q = new LinkedList<>();
        q.add(root);
        int max = 0;
        while (!q.isEmpty()) {
            int n = q.size();

            if (n > max) max = n;

            for (int i = 0; i < n; i++) {
                TreeNode treeNode = q.remove(0);

                if (treeNode != null) {
                    q.add(treeNode.left);
                    q.add(treeNode.right);
                } else {
                    q.add(null);
                    q.add(null);
                }
            }

            // trim the queue from left
            while (!q.isEmpty() && q.get(0) == null) {
                q.remove(0);
            }
            // trim the queue from right
            while (!q.isEmpty() && q.get(q.size() - 1) == null) {
                q.remove(q.size() - 1);
            }
        }

        return max;
    }
}
