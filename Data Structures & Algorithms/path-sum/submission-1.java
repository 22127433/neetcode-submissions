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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        Map<TreeNode, Integer> map = new HashMap<>();
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        map.put(root, root.val);
        while (!st.isEmpty()){
            TreeNode cur = st.pop();
            int tmp = map.getOrDefault(cur, cur.val);
            if (cur.left == null && cur.right == null && tmp == targetSum) return true;

            if (cur.right != null) {
                st.push(cur.right);
                map.put(cur.right, cur.right.val + tmp);
            }
            if (cur.left != null) {
                st.push(cur.left);
                map.put(cur.left, cur.left.val + tmp);
            }
        }
        return false;
    }
}