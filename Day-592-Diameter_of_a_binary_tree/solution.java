class Solution {
    private int ans = 0;

    private int depth(Node root) {
        if (root == null) {
            return 0;
        }
        int left = depth(root.left);
        int right = depth(root.right);
        ans = Math.max(ans, left + right);

        return 1 + Math.max(left, right);
    }

    int diameter(Node root) {
        // Your code here
        depth(root);
        return ans;
    }
}