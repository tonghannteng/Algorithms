//  101. Symmetric Tree


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.remove();
                if (node.left != null) {
                    queue.add(node.left);
                    list.add(node.left.val);
                } else {
                    list.add(-1);
                }
                if (node.right != null) {
                    queue.add(node.right);
                    list.add(node.right.val);
                } else {
                    list.add(-1);
                }
            }
            if (!checkIsReverse(list)) {
                return false;
            }
        }
        return true;
    }

    private boolean checkIsReverse(List<Integer> list) {
        for (int i = 0; i < list.size() / 2; i++) {
            if (!list.get(i).equals(list.get(list.size() - i - 1))) {
                return false;
            }
        }
        return true;
    }
}