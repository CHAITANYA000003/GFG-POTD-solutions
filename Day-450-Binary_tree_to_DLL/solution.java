class Solution {
    // Function to convert binary tree to doubly linked list and return it.
    Node prev = null;

    void recursion(Node root) {
        if (root == null) {
            return;
        }

        recursion(root.left);
        root.left = prev;
        if (prev != null) {
            prev.right = root;
        }
        prev = root;
        recursion(root.right);
    }

    Node bToDLL(Node root) {
        // Your code here
        if (root == null) {
            return null;
        }

        recursion(root);

        Node head = root;
        while (head.left != null) {
            head = head.left;
        }

        return head;
    }
}