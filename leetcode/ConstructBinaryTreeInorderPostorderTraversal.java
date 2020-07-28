//  106. Construct Binary Tree from Inorder and Postorder Traversal

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
class ConstructBinaryTreeInorderPostorderTraversal {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder.length == 0 || postorder.length == 0) return null;
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
            stack.push(postorder[i]);
        }
        return buildTree(stack, map, 0, inorder.length - 1);
    }

    private TreeNode buildTree(Stack<Integer> stack, Map<Integer, Integer> map, int start, int end) {
        if (start > end) return null;
        TreeNode root = new TreeNode(stack.pop());
        if (start == end) {
            return root;
        }
        int index = map.get(root.val);
        root.right = buildTree(stack, map, index + 1, end);
        root.left = buildTree(stack, map, start, index - 1);
        return root;
    }
}