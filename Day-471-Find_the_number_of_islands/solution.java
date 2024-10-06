class Solution {
    public void dfs(char[][] grid, int i, int j, int n, int m, boolean[][] visited) {
        int[] dx = { -1, -1, -1, 0, 1, 1, 1, 0 };
        int[] dy = { -1, 0, 1, 1, 1, 0, -1, -1 };
        Stack<int[]> s = new Stack<>();
        s.add(new int[] { i, j });

        while (!s.isEmpty()) {
            int[] temp = s.pop();
            int x = temp[0];
            int y = temp[1];
            if (!visited[x][y]) {
                visited[x][y] = true;
                for (int k = 0; k < 8; k++) {
                    int new_x = x + dx[k];
                    int new_y = y + dy[k];

                    if (new_x >= 0 && new_x < n && new_y >= 0 && new_y < m) {
                        if (grid[new_x][new_y] == '1') {
                            s.add(new int[] { new_x, new_y });
                        }
                    }
                }
            }
        }
    }

    // Function to find the number of islands.
    public int numIslands(char[][] grid) {
        // Code here
        int count = 0;
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    // visited[i][j] = true;
                    dfs(grid, i, j, n, m, visited);
                    count++;
                }
            }
        }

        return count;
    }
}