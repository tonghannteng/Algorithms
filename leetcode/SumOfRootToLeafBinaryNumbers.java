//  1022. Sum Of Root To Leaf Binary Numbers

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class SumOfRootToLeafBinaryNumbers {
    int result = 0;
    public int sumRootToLeaf(TreeNode root) {
        if (root == null) return 0;
        return helperInorder(root, "");
    }
    private int helperInorder(TreeNode root, String sum) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) {
            result+=Integer.parseInt(sum+""+root.val,2);
        }
        helperInorder(root.left, sum+""+root.val);
        helperInorder(root.right, sum+""+root.val);
        return result;
    }
}