class Solution {

    public static int binPow(int x, int p) {
        int mod = 1000000007;
        int ans = 1;

        while (p > 0) {
            if ((p & 1) == 1) {
                ans = ans * x % mod;
            }
            x = x * x % mod;
            p = p >> 1;
        }

        return ans;
    }

    public static int countgroup(int arr[]) {
        // Complete the function
        int n = arr.length;

        int cum_xor = 0;
        for (int i = 0; i < n; i++) {
            cum_xor ^= arr[i];
        }
        if (cum_xor != 0) {
            return 0;
        }

        return binPow(2, n - 1) - 1;
    }
}