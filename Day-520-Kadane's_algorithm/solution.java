class Solution {
    // arr: input array
    // Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int[] arr) {
        // Your code here
        int n = arr.length;
        int maxi = Integer.MIN_VALUE;
        int curr = 0;
        for (int i = 0; i < n; i++) {
            curr += arr[i];
            maxi = Math.max(maxi, curr);
            if (curr < 0) {
                curr = 0;
            }
        }

        return maxi;
    }
}