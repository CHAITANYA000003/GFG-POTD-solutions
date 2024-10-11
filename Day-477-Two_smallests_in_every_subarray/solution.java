class Solution {
    public int pairWithMaxSum(int[] arr) {
        // code here
        int n = arr.length;
        if (n <= 1) {
            return -1;
        }

        int maxSum = 0;
        for (int i = 0; i < n - 1; i++) {
            maxSum = Math.max(maxSum, arr[i] + arr[i + 1]);
        }

        return maxSum;
    }
}