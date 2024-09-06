class Solution {
    // arr: input array
    // Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int[] arr) {
        // Your code here
        int i = 0;
        int j = 0;
        int n = arr.length;
        long ans = Long.MIN_VALUE;
        long sum = 0l;
        while (j < n) {
            sum += arr[j];
            ans = Math.max(ans, sum);
            if (sum < 0) {
                sum = 0l;
                i = j;
            }
            j++;
        }

        return ans;
    }
}