//  297. Serialize and Deserialize Binary Tree

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class SerializeDeserializeBinaryTree {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) return null;
        StringBuilder result = new StringBuilder();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        result.append(root.val).append(" ");
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll();
                if (current.left != null) {
                    queue.add(current.left);
                    result.append(current.left.val).append(" ");
                } else {
                    result.append("null ");
                }
                if (current.right != null) {
                    queue.add(current.right);
                    result.append(current.right.val).append(" ");
                } else {
                    result.append("null ");
                }
            }
        }
        return result.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data == null || data.isEmpty()) return null;
        String [] d = data.split(" ");
        TreeNode root = new TreeNode(Integer.parseInt(d[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int index = 1;
        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            if ("null".equals(d[index])) {
                current.left = null;
            } else {
                current.left = new TreeNode(Integer.parseInt(d[index]));
                queue.add(current.left);
            }
            index++;
            if ("null".equals(d[index])) {
                current.right = null;
            } else {
                current.right = new TreeNode(Integer.parseInt(d[index]));
                queue.add(current.right);
            }
            index++;
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));
