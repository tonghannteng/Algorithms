//  129. Sum Root to Leaf Numbers

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class SumRootToLeafNumbers {
    String leaf = "";
    int result = 0;
    public int sumNumbers(TreeNode root) {
        if (root == null) return 0;
        DFS(root, leaf);
        return result;
    }

    private void DFS(TreeNode root, String leaf) {
        if (root == null) return;
        leaf+=root.val+"";
        if (root.left == null && root.right == null) {
            result+=Integer.parseInt(leaf);
        }
        if (root.left != null) {
            DFS(root.left, leaf);
        }
        if (root.right != null) {
            DFS(root.right, leaf);
        }

    }
}