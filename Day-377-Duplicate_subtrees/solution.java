class Solution {
    List<Node> ans = new ArrayList<>();
    HashMap<String, Integer> hm = new HashMap<>();

    public List<Node> printAllDups(Node root) {
        // code here
        inorder(root);

        return ans;
    }

    public String inorder(Node root) {
        if (root == null) {
            return "";
        }
        String l = inorder(root.left);
        String r = inorder(root.right);
        String str = l + " # " + root.data + " # " + r;
        hm.put(str, hm.getOrDefault(str, 0) + 1);
        if (hm.get(str) == 2) {
            ans.add(root);
        }
        return str;
    }
}