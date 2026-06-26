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
    private int findHeight(TreeNode root){
        if (root == null) return 0;

        int heightRight = findHeight(root.right);
        int heightLeft = findHeight(root.left);
        return 1 + Math.max(heightLeft, heightRight);
    }
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;

        if (Math.abs(findHeight(root.left) - findHeight(root.right)) > 1) return false;

        return (isBalanced(root.left) && isBalanced(root.right)) ? true : false;
    }
}
