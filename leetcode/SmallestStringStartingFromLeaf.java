//  988. Smallest String Starting From Leaf
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class SmallestStringStartingFromLeaf {

    private List<String> leaf = new ArrayList<>();
    private int count = 0;
    public String smallestFromLeaf(TreeNode root) {
        if (root == null) return "";
        DFS1(root, "");
        return leaf.get(0);
    }

    private String reserve(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    private void DFS1(TreeNode root, String s) {
        if (root == null) return;
        s+=((char) (root.val + 97));
        if (root.left == null && root.right == null) {
            if (count == 0) {
                leaf.add(reserve(s));
            } else {
                if (leaf.get(0).compareTo(reserve(s)) > 0) {
                    leaf.clear();
                    leaf.add(reserve(s));
                }
            }
            count++;
        }
        if (root.left != null) {
            DFS1(root.left, s);
        }
        if (root.right != null) {
            DFS1(root.right, s);
        }
    }
}