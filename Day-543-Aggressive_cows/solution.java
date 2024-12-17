class Solution {
    public static boolean isPossible(int[] stalls, int k, int mid) {
        int placed = 1; // we'll always place the first cow at the first index
        int n = stalls.length;
        int last = stalls[0];
        for (int i = 0; i < n; i++) {
            if (stalls[i] - last >= mid) {
                placed++;
                last = stalls[i];
            }
            if (placed >= k) {
                return true;
            }
        }

        return false;
    }

    public static int aggressiveCows(int[] stalls, int k) {
        if (k == 1) {
            return Integer.MAX_VALUE;
        }
        Arrays.sort(stalls);
        // int ans = -1;
        int low = 1; // since given that all elements are unique
        int high = stalls[stalls.length - 1] - stalls[0];
        while (low <= high) {
            int mid = (low + high) >> 1;
            if (isPossible(stalls, k, mid)) {
                // ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        // return ans;
        return high;
    }
}