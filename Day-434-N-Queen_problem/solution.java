class Solution {
    ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

    public boolean isSafe(int row, int col, int[][] board, int n) {
        int temprow = row;
        int tempcol = col;

        // checking left in the row
        while (tempcol >= 0) {
            if (board[temprow][tempcol] == 1) {
                return false;
            }
            tempcol--;
        }

        // checking top-left diagonal
        tempcol = col;
        while (tempcol >= 0 && temprow >= 0) {
            if (board[temprow][tempcol] == 1) {
                return false;
            }
            temprow--;
            tempcol--;
        }

        // checking bottom-left diagonal
        temprow = row;
        tempcol = col;
        while (temprow < n && tempcol >= 0) {
            if (board[temprow][tempcol] == 1) {
                return false;
            }
            temprow++;
            tempcol--;
        }

        return true;
    }

    public void recursion(int col, int[][] board, ArrayList<Integer> sol, int n) {
        if (col == n) {
            // ans.add(sol);
            ans.add(new ArrayList<>(sol));
            return;
        }

        for (int row = 0; row < n; row++) {
            if (isSafe(row, col, board, n)) {
                board[row][col] = 1;
                sol.add(row + 1);
                recursion(col + 1, board, sol, n);
                board[row][col] = 0;
                sol.remove(sol.size() - 1);
            }
        }
    }

    public ArrayList<ArrayList<Integer>> nQueen(int n) {
        // code here
        int[][] board = new int[n][n];
        ArrayList<Integer> sol = new ArrayList<>();

        recursion(0, board, sol, n);
        // recursion(0, board, new ArrayList<Integer>(), n);

        return ans;
    }
}