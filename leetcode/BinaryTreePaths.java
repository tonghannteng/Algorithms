//  257. Binary Tree Paths

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class BinaryTreePaths {

    List<String> result = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        DFS(root, "");
        return result;
    }

    private void DFS(TreeNode root, String s) {
        if (root == null) return;
        s += root.val + "";
        if (root.left == null && root.right == null) {
            result.add(s);
        }
        s += "->";
        if (root.left != null) {
            DFS(root.left, s);
        }
        if (root.right != null) {
            DFS(root.right, s);
        }

    }
}