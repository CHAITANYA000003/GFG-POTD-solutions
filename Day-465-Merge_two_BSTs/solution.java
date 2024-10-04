class Solution {
    public void inorder(Node root, ArrayList<Integer> a) {
        if (root == null) {
            return;
        }

        inorder(root.left, a);
        a.add(root.data);
        inorder(root.right, a);
    }

    // Function to return a list of integers denoting the node
    // values of both the BST in a sorted order.
    public List<Integer> merge(Node root1, Node root2) {
        // Write your code here
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();
        // finding the inorder traversals which would give us sorted arrays
        inorder(root1, a1);
        inorder(root2, a2);

        // merging the above arrays
        List<Integer> ans = new ArrayList<>();
        int n = a1.size();
        int m = a2.size();
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (a1.get(i) < a2.get(j)) {
                ans.add(a1.get(i));
                i++;
            } else {
                ans.add(a2.get(j));
                j++;
            }
        }

        while (i < n) {
            ans.add(a1.get(i));
            i++;
        }
        while (j < m) {
            ans.add(a2.get(j));
            j++;
        }

        return ans;
    }
}