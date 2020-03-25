//  653. Two Sum IV - Input is a BST

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class TwoSum {

    Set<Integer> set = new HashSet<>();
    public boolean findTarget(TreeNode root, int k) {
        if(root == null) return false;
        if(set.contains(root.val)) {
            return true;
        }
        set.add(k - root.val);
        return findTarget(root.left, k) || findTarget(root.right, k);
    }
}