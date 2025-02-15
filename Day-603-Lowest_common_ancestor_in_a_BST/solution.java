class Solution {
    Node recursion(Node root, int n1, int n2) {
        if (root == null) {
            return null;
        }

        if (root.data == n1 || root.data == n2 || (root.data > n1 && root.data < n2)) {
            return root;
        }
        if (root.data > n1) {
            return recursion(root.left, n1, n2);
        } else {
            return recursion(root.right, n1, n2);
        }
    }

    Node LCA(Node root, Node n1, Node n2) {
        // your code here.
        return recursion(root, Math.min(n1.data, n2.data), Math.max(n1.data, n2.data));
    }
}