class Solution {
    public static int MinimumEffort(int rows, int columns, int[][] heights) {
        // code here
        int dx[] = {-1, 0, 1, 0};
        int dy[] = {0, 1, 0, -1};
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[2] - b[2]); // {x, y, effort}
        boolean[][] visited = new boolean[rows][columns];
        
        pq.add(new int[]{0, 0, 0});
        while(!pq.isEmpty())
        {
            int[] temp = pq.poll();
            int x = temp[0];
            int y = temp[1];
            int effort = temp[2];
            visited[x][y] = true;
            
            if(x == rows-1 && y == columns-1)
            {
                return effort;
            }
            
            for(int i=0; i<4; i++)
            {
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                if(nx>=0 && nx<rows && ny>=0 && ny<columns && !visited[nx][ny])
                {
                    int diff = Math.abs(heights[x][y] - heights[nx][ny]);
                    int maxDiff = Math.max(diff, effort);
                    
                    pq.add(new int[]{nx, ny, maxDiff});
                }
            }
        }
        
        return -1;
    }
}