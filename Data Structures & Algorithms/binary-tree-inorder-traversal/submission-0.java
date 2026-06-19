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
    private void traversal(List<Integer> res, TreeNode root){
        if (root == null) return;
        traversal(res, root.left);
        res.add(root.val);
        traversal(res, root.right);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        //L I R
        List<Integer> res = new ArrayList<>();
        traversal(res, root);
        return res;
    }
}