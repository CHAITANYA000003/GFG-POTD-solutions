class Solution {
    boolean inorder(Node root, int mini, int maxi) {
        if (root == null) {
            return true;
        }

        if (root.data > mini && root.data < maxi) {
            return inorder(root.left, mini, root.data) && inorder(root.right, root.data, maxi);
        }

        return false;
    }

    // Function to check whether a Binary Tree is BST or not.
    boolean isBST(Node root) {
        // code here.
        return inorder(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
}