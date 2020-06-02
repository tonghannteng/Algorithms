//  226. Invert Binary Tree

class InvertBinaryTree {

    /**
     * Example:
     * var ti = TreeNode(5)
     * var v = ti.`val`
     * Definition for a binary tree node.
     * class TreeNode(var `val`: Int) {
     *     var left: TreeNode? = null
     *     var right: TreeNode? = null
     * }
     */
    fun invertTree(root: TreeNode?): TreeNode? {
        if (root == null) {
            return null;
        }
        val queue = LinkedList<TreeNode>()
        queue.add(root)
        while (!queue.isEmpty()) {
            val treeNode = queue.poll()
            val temp = treeNode.left
            treeNode.left = treeNode.right
            treeNode.right = temp
            if (treeNode.left != null) {
                queue.add(treeNode.left)
            }
            if (treeNode.right != null) {
                queue.add(treeNode.right)
            }
        }
        return root
    }
}