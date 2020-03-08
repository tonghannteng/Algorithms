//  671. Second MinimumNode In BinaryTree

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class SecondMinimumNodeInBinaryTree {

    public int findSecondMinimumValue(TreeNode root) {
        if (root == null) return -1;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int small = root.val;
        int secondSmall = -1;
        int level = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            level++;
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.remove();
                if (level > 1) {
                    if (node.val < small && secondSmall == -1) {
                        secondSmall = small;
                        small = node.val;
                    } else if (node.val > small && secondSmall == -1) {
                        secondSmall = node.val;
                    } else if (node.val > small && node.val < secondSmall) {
                        secondSmall = node.val;
                    } else if (node.val < small && node.val < secondSmall) {
                        secondSmall = small;
                        small = node.val;
                    }
                }
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }
        return secondSmall;
    }
}