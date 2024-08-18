class Solution {
    public boolean canSplit(int arr[]) {
        // code here
        long sum = 0;
        int n = arr.length;
        for (int x : arr) {
            sum += x;
        }
        if ((sum & 1) == 1) {
            return false;
        }
        sum = sum / 2;
        long curr = 0;
        for (int i = 0; i < n; i++) {
            if (curr == sum) {
                return true;
            }
            if (curr > sum) {
                return false;
            }
            curr += arr[i];
        }

        return false;
    }
}