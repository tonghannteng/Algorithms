//  872. Leaf Similar Trees

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class LeafSimilarTrees {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null) return false;
        LinkedList<Integer> list = new LinkedList<>();
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.add(root1);
        stack2.add(root2);
        while (!stack1.isEmpty()) {
            TreeNode node = stack1.pop();
            if (node.left == null && node.right == null) {
                list.add(node.val);
            } else {
                if (node.left != null) {
                    stack1.push(node.left);
                }
                if (node.right != null) {
                    stack1.push(node.right);
                }
            }
        }
        while (!stack2.isEmpty()) {
            TreeNode node = stack2.pop();
            if (node.left == null && node.right == null) {
                if (list.peek() == node.val) {
                    list.poll();
                }
            } else {
                if (node.left != null) {
                    stack2.push(node.left);
                }
                if (node.right != null) {
                    stack2.push(node.right);
                }
            }
        }
        return list.isEmpty();
    }
}