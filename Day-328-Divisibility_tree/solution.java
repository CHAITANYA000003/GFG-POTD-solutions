class Solution {
    
    int count = 0;
    
    public int dfs(ArrayList<ArrayList<Integer>> adjList, boolean[] visited, int start)
    {
        visited[start] = true;
        int size = 1; // including the current node
        
        // summation of the sizes of all the child subtrees for a root will give us its size.
        for(int i: adjList.get(start))
        {
            if(!visited[i])
            {
                int childSize = dfs(adjList, visited, i);
                size += childSize;
                if((childSize%2) == 0)
                {
                    count++;
                }
            }
        }
        return size;
    }
    
    public int minimumEdgeRemove(int n, int[][] edges) {
        // code here
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for(int i=0; i<n; i++)
        {
            adjList.add(new ArrayList<Integer>());
        }
        for(int[] i: edges)
        {
            // -1 to make everything(the vertices) 0-based indexing
            adjList.get(i[0]-1).add(i[1]-1);
            adjList.get(i[1]-1).add(i[0]-1);
        }
        boolean[] visited = new boolean[n];
        
        dfs(adjList, visited, 0);
        
        return count;
    }
}