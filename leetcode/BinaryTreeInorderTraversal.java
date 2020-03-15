//  94. Binary Tree In order Traversal

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class BinaryTreeInorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        traversalTree(root, result);
        return result;
    }

    public void traversalTree(TreeNode root, List<Integer> list) {
        if (root != null) {
            if (root.left != null) {
                traversalTree(root.left, list);
            }
            list.add(root.val);
            if (root.right != null) {
                traversalTree(root.right, list);
            }
        }
    }
}