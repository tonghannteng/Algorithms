//  993. Cousins in Binary Tree

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class CousinInBinaryTree {
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> queue = new LinkedList<>();
        if (root.left == null || root.right == null) return false;
        int rootVal = root.val;
        int parentX = rootVal, parentY = rootVal;
        int level = 0;
        int levelX = 0, levelY = 0;
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            level++;
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.remove();
                if (node.left != null) {
                    if (node.left.val == x) {
                        parentX = node.val;
                        levelX = level;
                    }
                    if (node.left.val == y) {
                        parentY = node.val;
                        levelY = level;
                    }
                    queue.add(node.left);
                }
                if (node.right != null) {
                    if (node.right.val == x) {
                        parentX = node.val;
                        levelX = level;
                    }
                    if (node.right.val == y) {
                        parentY = node.val;
                        levelY = level;
                    }
                    queue.add(node.right);
                }
            }
        }
        if (parentX == rootVal || parentY == rootVal) return false;
        return levelX == levelY && parentX != parentY;
    }
}