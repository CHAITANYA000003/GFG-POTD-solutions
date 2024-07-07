class Solution {
    ArrayList<Integer> ans = new ArrayList<>();

    public boolean preorder(Node root, Node parent, int target) {
        if (root == null)
            return false;

        if (root.data == target)
            return true;

        if (preorder(root.left, root, target)) {
            ans.add(root.data);
            return true;
        }
        if (preorder(root.right, root, target)) {
            ans.add(root.data);
            return true;
        }

        return false;
    }

    public ArrayList<Integer> Ancestors(Node root, int target) {
        // add your code here
        preorder(root, null, target);

        return ans;
    }
}