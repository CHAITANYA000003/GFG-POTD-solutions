class Solution {
    public Node inorder(Node root, Node next) {
        if (root == null) {
            return next;
        }

        root.next = inorder(root.right, next);
        return inorder(root.left, root);

    }

    public void populateNext(Node root) {
        // code here
        inorder(root, null);
    }
}