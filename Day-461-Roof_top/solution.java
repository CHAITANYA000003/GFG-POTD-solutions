class Solution {
    // Function to find maximum number of consecutive steps
    // to gain an increase in altitude with each step.
    public int maxStep(int arr[]) {
        // Your code here
        int ans = 0;
        int curr = 0;
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                curr++;
            } else {
                ans = Math.max(ans, curr);
                curr = 0;
            }
        }
        ans = Math.max(ans, curr);
        curr = 0;

        return ans;
    }
}