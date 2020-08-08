//  437. Path Sum III

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
class PathSumIII {
    int paths = 0;

    private void helper(TreeNode root, int sum) {

        if (root != null && root.val == sum) {
            ++paths;
        }
        if (root != null) {
            sum -= root.val;
            helper(root.left, sum);
            helper(root.right, sum);
        }
    }

    public int pathSum(TreeNode root, int sum) {

        if (root == null) {
            return 0;
        }
        helper(root, sum);
        pathSum(root.left, sum);
        pathSum(root.right, sum);
        return paths;
    }
}