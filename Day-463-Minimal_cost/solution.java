class Solution {
    public int minimizeCost(int k, int arr[]) {
        // code here
        int n = arr.length;
        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        
        for(int i=1; i<n; i++) {
            for(int j = 1; j<=k; j++) {
                if((i-j) >= 0) {
                    dp[i] = Math.min(dp[i], (dp[i-j] + Math.abs(arr[i]-arr[i-j])));
                }
            }
        }
        
        return dp[n-1];
    }
}