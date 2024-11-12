class Solution {
    static boolean canAttend(int[][] arr) {
        // Your code here
        Arrays.sort(arr, (a, b) -> {
            if (a[1] != b[1]) {
                return a[1] - b[1];
            } else {
                return a[0] - b[0];
            }
        });

        int n = arr.length;
        for (int i = 1; i < n; i++) {
            if (arr[i][0] < arr[i - 1][1]) {
                return false;
            }
        }

        return true;
    }
}