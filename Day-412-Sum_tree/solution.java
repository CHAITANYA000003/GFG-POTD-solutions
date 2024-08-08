class Solution {
    int recursion(Node root) {
        if (root == null) {
            // to handle the case where a node may have one child but the other one is
            // absent
            return 0;
        }
        if (root.left == null && root.right == null) {
            // if the node is a leaf node
            return root.data;
        }

        int left = recursion(root.left);
        int right = recursion(root.right);

        if (left == -1 || right == -1) {
            // it means there is a node in the corresponding tree which fails the condition
            return -1;
        }

        if (left + right == root.data) {
            // the value to be propagated to the parent node
            return 2 * root.data;
        } else {
            // if for any node in the tree the value of left subtree is not equal to the
            // right subtree, -1 propagates
            return -1;
        }

    }

    boolean isSumTree(Node root) {
        // Your code here
        if (root == null) {
            return true;
        }
        return recursion(root) == -1 ? false : true;
    }
}