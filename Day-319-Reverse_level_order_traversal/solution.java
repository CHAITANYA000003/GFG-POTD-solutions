class Tree
{
    public ArrayList<Integer> reverseLevelOrder(Node node) 
    {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        
        while(!q.isEmpty())
        {
            Node temp = q.poll();
            ans.add(temp.data);
            
            if(temp.right != null)
            {
                q.add(temp.right);
            }
            if(temp.left != null)
            {
                q.add(temp.left);
            }
        }
        
        Collections.reverse(ans);
        
        return ans;
    }
}