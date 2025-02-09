class Solution {
    private int maxi = Integer.MIN_VALUE;

    int recursion(Node node) {
        if (node == null) {
            return 0;
        }
        int leftSum = Math.max(0, recursion(node.left));
        int rightSum = Math.max(0, recursion(node.right));
        maxi = Math.max(maxi, node.data + leftSum + rightSum);
        return node.data + Math.max(leftSum, rightSum);
    }

    // Function to return maximum path sum from any node in a tree.
    int findMaxSum(Node node) {
        // your code goes here
        recursion(node);
        return maxi;
    }
}