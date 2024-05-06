class Tree
{
    ArrayList<Integer> noSibling(Node node)
    {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        
        while(!q.isEmpty())
        {
            Node temp = q.poll();
            if(temp.left == null && temp.right != null)
            {
                ans.add(temp.right.data);
            }
            else if(temp.left != null && temp.right == null)
            {
                ans.add(temp.left.data);
            }
            
            if(temp.left != null)
            {
                q.add(temp.left);
            }
            if(temp.right != null)
            {
                q.add(temp.right);
            }
        }
        
        if(ans.size() == 0)
        {
            ans.add(-1);
        }
        
        Collections.sort(ans);
        
        return ans;
    }
}