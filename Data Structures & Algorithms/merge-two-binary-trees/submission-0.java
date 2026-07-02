/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) return null;
        TreeNode root, root1Left = null, root1Right = null, root2Left = null, root2Right = null;
        if (root1 == null) {
            root = root2;
            root2Left = root2.left;
            root2Right = root2.right;
        }
        else if (root2 == null) {
            root = root1;
            root1Left = root1.left;
            root1Right = root1.right;
        }
        else {
            root = new TreeNode(root1.val + root2.val);
            root1Left = root1.left;
            root1Right = root1.right;
            root2Left = root2.left;
            root2Right = root2.right;         
        }
        root.left = mergeTrees(root1Left, root2Left);
        root.right = mergeTrees(root1Right, root2Right);
        return root;
    }
}