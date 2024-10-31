class Solution {
    public long maxSum(Long[] arr) {
        // code here
        long ans = 0;
        Arrays.sort(arr);
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        int turn = 0;
        while (i < j) {
            ans += Math.abs(arr[i] - arr[j]);
            if ((turn & 1) == 0) {
                i++;
                turn = 1;
            } else {
                j--;
                turn = 0;
            }
        }
        ans += arr[n / 2] - arr[0];

        return ans;
    }
}