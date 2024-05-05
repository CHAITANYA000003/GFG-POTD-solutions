class Solution{
    TreeMap<Integer, Integer> tm = new TreeMap<>();
    
    public void preorder(Node root, int level)
    {
        if(root == null)
        {
            return;
        }
        
        tm.put(level, tm.getOrDefault(level, 0) + root.data);
        preorder(root.left, level-1);
        preorder(root.right, level+1);
    }
    
    public ArrayList <Integer> verticalSum(Node root) {
        // add your code here
        ArrayList<Integer> ans =  new ArrayList<>();
        preorder(root, 0);
        for(Map.Entry<Integer, Integer> entry: tm.entrySet())
        {
            ans.add(entry.getValue());
        }
        
        return ans;
    }
}