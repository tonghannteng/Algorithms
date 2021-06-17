//  543. Diameter of Binary Tree

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class DiameterBinaryTree {
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return 0;

        int hl = findHeight(root.left);
        int hr = findHeight(root.right);

        int dl = diameterOfBinaryTree(root.left);
        int dr = diameterOfBinaryTree(root.right);
        int d = Math.max(dl, dr);
        return Math.max(d, hl + hr);

    }

    public int findHeight(TreeNode root) {
        if (root == null) return 0;
        int l = findHeight(root.left);
        int r = findHeight(root.right);
        return Math.max(l, r) + 1;
    }
}