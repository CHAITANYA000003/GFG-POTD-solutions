class Solution {
    public static void recursion(Node root, Stack<Integer> s, ArrayList<ArrayList<Integer>> ans)  {
        if(root == null)
        {
            return;
        }
        
        s.push(root.data);
        if(root.left == null && root.right == null)
        {
            ans.add(new ArrayList<Integer>(s));
        }
        
        recursion(root.left, s, ans);
        recursion(root.right, s, ans);
        s.pop();
    }
    
    public static ArrayList<ArrayList<Integer>> Paths(Node root) {
        // code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        recursion(root, s, ans);
        
        return ans;
    }
}