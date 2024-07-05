class Solution {
    int left, right;

    public void preorder(Node root, int movement) {
        if (root == null) {
            return;
        }
        preorder(root.left, movement - 1);
        left = Math.min(left, movement);
        preorder(root.right, movement + 1);
        right = Math.max(right, movement);
    }

    // Function to find the vertical width of a Binary Tree.
    public int verticalWidth(Node root) {
        // code here.
        if (root == null) {
            return 0;
        }
        left = right = 0;
        preorder(root, 0);
        return right - left + 1;
    }
}