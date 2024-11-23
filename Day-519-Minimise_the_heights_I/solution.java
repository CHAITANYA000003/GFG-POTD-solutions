class Solution {
    public int getMinDiff(int k, int[] arr) {
        // code here
        Arrays.sort(arr);
        int n = arr.length;
        int ans = arr[n - 1] - arr[0];
        for (int i = 1; i < n; i++) {
            int tempMin = Math.min(arr[0] + k, arr[i] - k);
            int tempMax = Math.max(arr[n - 1] - k, arr[i - 1] + k);
            ans = Math.min(ans, tempMax - tempMin);
        }

        return ans;
    }
}