class Solution {
    public boolean binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) >> 1;
            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;
    }

    // Function to search a given number in row-column sorted matrix.
    public boolean searchRowMatrix(int[][] mat, int x) {
        int n = mat.length;
        int m = mat[0].length;
        for (int i = 0; i < n; i++) {
            boolean ans = false;
            if (x >= mat[i][0] && x <= mat[i][m - 1]) {
                ans = binarySearch(mat[i], x);
            }
            if (ans) {
                return ans;
            }
        }

        return false;
    }
}