class Solution {
    // Function to return a list of integers denoting the node values of both the
    // BST in a sorted order.

    public void inorder(Node root, ArrayList<Integer> a) {
        if (root == null) {
            return;
        }

        inorder(root.left, a);
        a.add(root.data);
        inorder(root.right, a);
    }

    public List<Integer> merge(Node root1, Node root2) {
        // Write your code here
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        inorder(root1, a1);
        inorder(root2, a2);
        int i = 0;
        int j = 0;
        int n1 = a1.size();
        int n2 = a2.size();
        while (i < n1 && j < n2) {
            if (a1.get(i) < a2.get(j)) {
                ans.add(a1.get(i));
                i++;
            } else {
                ans.add(a2.get(j));
                j++;
            }
        }

        while (i < n1) {
            ans.add(a1.get(i++));
        }
        while (j < n2) {
            ans.add(a2.get(j++));
        }

        return ans;
    }
}