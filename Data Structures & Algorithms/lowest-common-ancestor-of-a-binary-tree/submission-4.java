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
    private int canReach(TreeNode root, int val1, int val2){
        if (root == null) return 0;

        int res = 0;
        if (root.val == val1 || root.val == val2) res = 1;

        return res + canReach(root.left, val1, val2) + canReach(root.right, val1, val2);
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;

        Queue<TreeNode> st = new ArrayDeque<>();
        st.offer(root);
        TreeNode res = root;

        while (!st.isEmpty()){
            root = st.poll();
            int caseReach = canReach(root, p.val, q.val);
            if (caseReach == 2) {
                res = root;
                st.clear();
            }
            else continue;
            if (root.left != null) st.offer(root.left);
            if (root.right != null) st.offer(root.right);
        }

        return res;
    }
}