class Solution {
    private ArrayList<Integer> ans = new ArrayList<>();

    private void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        ans.add(root.data);
        inorder(root.right);
    }

    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
        // Code
        inorder(root);

        return ans;
    }
}