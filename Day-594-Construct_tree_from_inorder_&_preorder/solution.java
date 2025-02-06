class Solution {
    public static Node buildTree(int inorder[], int preorder[]) {
        // code here
        HashMap<Integer, Integer> inMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inMap.put(inorder[i], i);
        }

        return buildTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1, inMap);
    }

    public static Node buildTree(int[] pre, int preStart, int preEnd, int[] in, int inStart, int inEnd,
            HashMap<Integer, Integer> inMap) {
        if (preStart > preEnd || inStart > inEnd) {
            return null;
        }

        Node root = new Node(pre[preStart]);
        int inRoot = inMap.get(root.data);
        int numsLeft = inRoot - inStart;

        root.left = buildTree(pre, preStart + 1, preStart + numsLeft, in, inStart, inEnd - 1, inMap);
        root.right = buildTree(pre, preStart + 1 + numsLeft, preEnd, in, inRoot + 1, inEnd, inMap);

        return root;
    }
}