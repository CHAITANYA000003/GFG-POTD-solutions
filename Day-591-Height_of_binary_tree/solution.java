class Solution {
    private int maxHeight(Node node) {
        if (node == null) {
            return 0;
        }

        int left = maxHeight(node.left);
        int right = maxHeight(node.right);

        return Math.max(left, right) + 1;
    }

    // Function to find the height of a binary tree.
    int height(Node node) {
        // code here
        return maxHeight(node) - 1;
    }
}