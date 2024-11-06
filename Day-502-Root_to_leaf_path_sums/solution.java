class Solution {
    public static int preorder(Node root, int curr) {
        if(root == null) {
            return 0;
        }
        if(root.left==null && root.right==null) {
            return curr*10+root.data;
        }
        curr = curr*10 + root.data;
        return preorder(root.left, curr) + preorder(root.right, curr);
    }
    
    public static int treePathsSum(Node root) {
        // add code here.
        return preorder(root, 0);
    }
}