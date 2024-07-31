class Solution {
    ArrayList<String> paths = new ArrayList<>();

    // USING EXTRA SPACE FOR VISITED ARRAY
    // public void recursion(int[][] mat, boolean[][] visited, int i, int j, String
    // curr) {
    // int n = mat.length;
    // if(i<0 || i>=n || j<0 || j>=n || mat[i][j]==0 || visited[i][j]) {
    // return;
    // }
    // if(i==(n-1) && j==(n-1)) {
    // paths.add(curr);
    // return;
    // }

    // visited[i][j] = true;
    // recursion(mat, visited, i+1, j, curr+"D");
    // recursion(mat, visited, i-1, j, curr+"U");
    // recursion(mat, visited, i, j+1, curr+"R");
    // recursion(mat, visited, i, j-1, curr+"L");
    // visited[i][j] = false;
    // }
    // public ArrayList<String> findPath(int[][] mat) {
    // // Your code here
    // boolean[][] visited = new boolean[mat.length][mat[0].length];
    // recursion(mat, visited, 0, 0, "");

    // return paths;
    // }

    // WITHOUT USING VISITED ARRAY
    public void recursion(int[][] mat, int i, int j, String curr) {
        int n = mat.length;
        if (i < 0 || i >= n || j < 0 || j >= n || mat[i][j] == 0) {
            return;
        }
        if (i == (n - 1) && j == (n - 1)) {
            paths.add(curr);
            return;
        }

        mat[i][j] = 0;
        recursion(mat, i + 1, j, curr + "D");
        recursion(mat, i - 1, j, curr + "U");
        recursion(mat, i, j + 1, curr + "R");
        recursion(mat, i, j - 1, curr + "L");
        mat[i][j] = 1;
    }

    public ArrayList<String> findPath(int[][] mat) {
        // Your code here
        recursion(mat, 0, 0, "");

        return paths;
    }
}