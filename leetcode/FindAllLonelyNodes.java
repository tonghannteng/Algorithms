//  1469. Find All The Lonely Nodes

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
class FindAllLonelyNodes {
    public List<Integer> getLonelyNodes(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        if (root == null) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode current = queue.remove();
                if (current.left != null && current.right == null) {
                    result.add(current.left.val);
                    queue.add(current.left);
                } else if (current.left == null && current.right != null) {
                    result.add(current.right.val);
                    queue.add(current.right);
                } else if (current.left != null && current.right != null) {
                    queue.add(current.left);
                    queue.add(current.right);
                }
            }
        }
        return result;
    }
}