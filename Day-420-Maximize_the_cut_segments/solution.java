class Solution {
    // MEMOIZATION APPROACH
    // public int recursion(int n, int x, int y, int z, int[] memo) {
    // if (n == 0) {
    // return 0;
    // }
    // if (memo[n] != -1) {
    // return memo[n];
    // }
    // int n1, n2, n3;
    // n1 = n2 = n3 = Integer.MIN_VALUE;
    // if (n >= x)
    // n1 = recursion(n - x, x, y, z, memo);
    // if (n >= y)
    // n2 = recursion(n - y, x, y, z, memo);
    // if (n >= z)
    // n3 = recursion(n - z, x, y, z, memo);

    // return memo[n] = 1 + Math.max(n1, Math.max(n2, n3));
    // }

    // public int maximizeCuts(int n, int x, int y, int z) {
    // // Your code here
    // int[] memo = new int[n + 1];
    // Arrays.fill(memo, -1);
    // int ans = recursion(n, x, y, z, memo);
    // return ans < 0 ? 0 : ans;
    // }

    // TABULATION APPROACH
    public int maximizeCuts(int n, int x, int y, int z) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        for (int i = 0; i <= n; i++) {
            if (dp[i] == -1) {
                continue;
            }

            if (i + x <= n) {
                dp[i + x] = Math.max(dp[i + x], dp[i] + 1);
            }
            if (i + y <= n) {
                dp[i + y] = Math.max(dp[i + y], dp[i] + 1);
            }
            if (i + z <= n) {
                dp[i + z] = Math.max(dp[i + z], dp[i] + 1);
            }
        }

        return dp[n] == -1 ? 0 : dp[n];
    }
}