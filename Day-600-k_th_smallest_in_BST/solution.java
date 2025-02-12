class Solution {
    private int ans = -1;
    private int count = 0;

    private void inorder(Node root, int k) {
        if (root == null) {
            return;
        }
        inorder(root.left, k);
        count++;
        if (count == k) {
            ans = root.data;
            return;
        }
        inorder(root.right, k);
    }

    // Return the Kth smallest element in the given BST
    public int kthSmallest(Node root, int k) {
        // Write your code here
        inorder(root, k);
        return ans;
    }
}