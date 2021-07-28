//  1302. Deepest Leaves Sum

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
class DeepestLeavesSum {

    public int deepestLeavesSum(TreeNode root) {
        if (root == null) return 0;
        int height = getHeightBinaryTree(root);
        int sum = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        Map<TreeNode, Integer> map = new HashMap<>();
        int level = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            level++;
            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll();
                if (current.left != null) {
                    queue.add(current.left);
                    map.put(current.left, level);
                }
                if (current.right != null) {
                    queue.add(current.right);
                    map.put(current.right, level);
                }
            }
        }
        for (Map.Entry<TreeNode, Integer> entry: map.entrySet()) {
            if (entry.getValue() == height - 1) {
                sum+=entry.getKey().val;
            }
        }
        return sum;
    }

    private int getHeightBinaryTree(TreeNode root) {
        if (root == null) return 0;
        return maxValue(getHeightBinaryTree(root.left), getHeightBinaryTree(root.right)) + 1;
    }

    private int maxValue(int a, int b) {
        return Math.max(a, b);
    }
}