class Solution {
    HashSet<Integer> hs = new HashSet<>();

    boolean inorder(Node root, int target) {
        if (root == null) {
            return false;
        }
        boolean left = inorder(root.left, target);
        if (hs.contains(target - root.data)) {
            return true;
        } else {
            hs.add(root.data);
        }
        boolean right = inorder(root.right, target);

        return left || right;
    }

    boolean findTarget(Node root, int target) {
        // Write your code here
        return inorder(root, target);
    }
}