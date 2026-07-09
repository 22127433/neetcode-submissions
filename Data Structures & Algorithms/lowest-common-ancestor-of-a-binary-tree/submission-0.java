/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    private boolean canReach(TreeNode root, int val){
        if (root == null) return false;

        if (root.val == val) return true;

        return canReach(root.left, val) || canReach(root.right, val);
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;

        Queue<TreeNode> st = new ArrayDeque<>();
        st.offer(root);
        TreeNode res = root;

        while (!st.isEmpty()){
            root = st.poll();
            if (canReach(root, p.val) && canReach(root, q.val)) {
                res = root;
            }
            if (root.left != null) st.offer(root.left);
            if (root.right != null) st.offer(root.right);
        }

        return res;
    }
}