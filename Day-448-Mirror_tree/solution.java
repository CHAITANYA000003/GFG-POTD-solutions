class Solution {
    // Function to convert a binary tree into its mirror tree.
    void recursion(Node root) {
        if (root == null) {
            return;
        }
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;

        recursion(root.left);
        recursion(root.right);
    }

    void mirror(Node node) {
        // Your code here
        recursion(node);
    }
}