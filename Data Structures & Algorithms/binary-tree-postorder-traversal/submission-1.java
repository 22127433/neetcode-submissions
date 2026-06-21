/**
 * Definition for a binary tree TreeNode.
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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();

        while (root != null || !st.isEmpty()) {
            if (root != null) {
                st.push(root);
                root = root.left;
            } else {
                TreeNode top = st.peek(); // TreeNode trên đỉnh stack
                if (top.right != null) {
                    root = top.right; // chuyển sang cây con phải
                } else {
                    // Xử lý TreeNode top (không có con phải)
                    TreeNode processed = st.pop();
                    res.add(processed.val);

                    // Kiểm tra TreeNode vừa xử lý có phải là con phải của TreeNode cha không
                    while (!st.isEmpty() && processed == st.peek().right) {
                        processed = st.pop();
                        res.add(processed.val);
                    }

                    root = null; // quan trọng: không xử lý lại TreeNode đã duyệt
                }
            }
        }
        return res;
    }
}