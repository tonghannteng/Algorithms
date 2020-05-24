//  1008. Construct Binary Search Tree from Preorder Traversal

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
class ConstructBinarySearchTreePreorderTraversal {
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = new TreeNode(preorder[0]);
        for (int i = 1; i < preorder.length; i++) {
            root = traversal(root, preorder[i]);
        }
        return root;
    }


    private TreeNode traversal(TreeNode root, int value) {
        if (root == null) {
            return new TreeNode(value);
        } else if (value < root.val) {
            root.left = traversal(root.left, value);
        } else {
            root.right = traversal(root.right, value);
        }
        return root;
    }
}