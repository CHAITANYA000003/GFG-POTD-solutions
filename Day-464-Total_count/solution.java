class Solution {
    int totalCount(int k, int[] arr) {
        // code here
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                count++;
                continue;
            }
            count += arr[i] / k;
            count += arr[i] % k == 0 ? 0 : 1;
        }

        return count;
    }
}