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
    private boolean isSameTree(TreeNode tree1, TreeNode tree2){
        if (tree1 == null && tree2 == null) return true;
        else if (tree1 == null || tree2 == null) return false;
        if (tree1.val != tree2.val) return false;
        return isSameTree(tree1.left, tree2.left) && isSameTree(tree1.right, tree2.right);
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode cur = stack.pop();
            if (isSameTree(cur, subRoot)) return true;

            if (cur.left != null) stack.push(cur.left);
            if (cur.right != null) stack.push(cur.right);
        }

        return false;
    }
}
