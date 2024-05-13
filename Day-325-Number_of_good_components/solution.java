class Solution {
    public static void toAdjacencyList(int[][] edges, int v,  ArrayList<ArrayList<Integer>> adjList)
    {
        for(int i=0; i<=v; i++)
        {
            adjList.add(new ArrayList<Integer>());
        }
        
        for(int[] x: edges)
        {
            adjList.get(x[0]).add(x[1]);
            adjList.get(x[1]).add(x[0]);
        }
    }
    
    public static int dfs(int i,  ArrayList<ArrayList<Integer>> adjList, boolean[] visited)
    {
        int vertices = 1;
        int edges = 0;
        Stack<Integer> s = new Stack<>();
        visited[i] = true;
        s.push(i);
        while(!s.isEmpty())
        {
            int temp = s.pop();
            edges += adjList.get(temp).size();
            for(Integer x: adjList.get(temp))
            {
                if(!visited[x])
                {
                    vertices++;
                    visited[x] = true;
                    s.push(x);
                }
            }
        }
        
        if((vertices*(vertices-1)) == edges)
        {
            return 1;
        }
        return 0;
    }
    
    public static int findNumberOfGoodComponent(int e, int v, int[][] edges) {
        // code here
        int ans = 0;
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        boolean[] visited = new boolean[v+1];
        toAdjacencyList(edges, v, adjList);
        for(int i=1; i<=v; i++)
        {
            if(!visited[i])
            {
                ans += dfs(i, adjList, visited);
            }
        }
        
        return ans;
    }
}