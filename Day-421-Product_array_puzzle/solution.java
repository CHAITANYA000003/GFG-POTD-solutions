class Solution {
    public static long[] productExceptSelf(int nums[]) {
        // code here
        int n = nums.length;
        long[] ans = new long[n];
        long product = 1;
        int zero_count = 0;
        for (int x : nums) {
            if (x == 0) {
                zero_count++;
            } else {
                product *= x;
            }
        }
        if (zero_count > 1) {
            Arrays.fill(ans, 0);
            return ans;
        }

        if (zero_count == 1) {
            for (int i = 0; i < n; i++) {
                ans[i] = nums[i] == 0 ? product : 0;
            }
        } else {
            for (int i = 0; i < n; i++) {
                ans[i] = product / nums[i];
            }
        }

        return ans;
    }
}