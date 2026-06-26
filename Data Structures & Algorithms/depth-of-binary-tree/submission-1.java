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
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int maxDepth = 0;
        Stack<TreeNode> st = new Stack<>();
        Stack<Integer> stDepth = new Stack<>();
        st.push(root);
        stDepth.push(1);

        while (!st.isEmpty()){
            TreeNode cur = st.pop();
            int curDepth = stDepth.pop();
            maxDepth = Math.max(curDepth, maxDepth);

            if (cur.right != null) {
                st.push(cur.right);
                stDepth.push(curDepth + 1);
            }
            if (cur.left != null) {
                st.push(cur.left);
                stDepth.push(curDepth + 1);
            }
        }

        return maxDepth;
    }
}
