class Solution {
    static private boolean dfs(char[][] mat, boolean[][] visited, String word, int row, int col, int ind) {
        if (ind == word.length()) {
            return true;
        }
        if (row < 0 || row >= mat.length || col < 0 || col >= mat[0].length || visited[row][col]) {
            return false;
        }
        if (word.charAt(ind) != mat[row][col]) {
            return false;
        }

        visited[row][col] = true;
        int[] dx = { -1, 0, 1, 0 };
        int[] dy = { 0, 1, 0, -1 };
        boolean ans = false;
        for (int i = 0; i < 4; i++) {
            int nx = row + dx[i];
            int ny = col + dy[i];
            ans = ans | dfs(mat, visited, word, nx, ny, ind + 1);
        }
        visited[row][col] = false;
        return ans;
    }

    static public boolean isWordExist(char[][] mat, String word) {
        // Code here
        int n = mat.length;
        int m = mat[0].length;
        boolean[][] visited = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (dfs(mat, visited, word, i, j, 0)) {
                    return true;
                }
            }
        }

        return false;
    }
}