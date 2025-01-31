class Solution {
    private static boolean isValid(int[][] mat, int row, int col, int val) {
        for (int i = 0; i < 9; i++) {
            if (mat[row][i] == val) {
                return false;
            }

            if (mat[i][col] == val) {
                return false;
            }

            if (mat[3 * (row / 3) + (i / 3)][3 * (col / 3) + (i % 3)] == val) {
                return false;
            }
        }

        return true;
    }

    private static boolean recursion(int[][] mat) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (mat[i][j] == 0) {
                    for (int val = 1; val <= 9; val++) {
                        if (isValid(mat, i, j, val)) {
                            mat[i][j] = val;
                            if (recursion(mat)) {
                                return true;
                            } else {
                                mat[i][j] = 0;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    // Function to find a solved Sudoku.
    static void solveSudoku(int[][] mat) {
        // code here
        recursion(mat);
    }
}