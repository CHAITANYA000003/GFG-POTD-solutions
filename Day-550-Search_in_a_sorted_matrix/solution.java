class Solution {
    // Function to search a given number in row-column sorted matrix.
    public boolean searchMatrix(int[][] mat, int x) {
        // code here
        int n = mat.length;
        int m = mat[0].length;
        int low = 0;
        int high = n * m - 1;
        while (low <= high) {
            int mid = (low + high) >> 1;
            int i = mid / m;
            int j = mid % m;
            if (mat[i][j] == x) {
                return true;
            } else if (mat[i][j] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;
    }
}