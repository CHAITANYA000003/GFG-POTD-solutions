class Solution {
    public int minIncrements(int[] arr) {
        // Code here
        Arrays.sort(arr);
        int ans = 0;
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            if (arr[i] <= arr[i - 1]) {
                ans += arr[i - 1] - arr[i] + 1;
                arr[i] = arr[i - 1] + 1;
            }
        }

        return ans;
    }
}