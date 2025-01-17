class Solution {
    public static int[] productExceptSelf(int arr[]) {
        // code here
        int n = arr.length;
        int pro = 1;
        int zero_count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                pro *= arr[i];
            } else {
                zero_count++;
            }
        }

        int[] ans = new int[n];
        if (zero_count > 1) {
            return ans;
        }
        if (zero_count == 1) {
            for (int i = 0; i < n; i++) {
                if (arr[i] == 0) {
                    ans[i] = pro;
                    return ans;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            ans[i] = pro / arr[i];
        }
        return ans;
    }
}
