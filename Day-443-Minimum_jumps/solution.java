class Solution {
    static int minJumps(int[] arr) {
        // your code here
        if (arr[0] == 0) {
            return -1;
        }

        int ans = 1;
        int jumps_remaining = arr[0];
        int maxi = 0;

        for (int i = 1; i < arr.length; i++) {
            maxi--;
            jumps_remaining--;
            maxi = Math.max(maxi, arr[i]);
            if (jumps_remaining == 0 && i != arr.length - 1) {
                if (maxi <= 0) {
                    return -1;
                }
                jumps_remaining = maxi;
                maxi = 0;
                ans++;
            }
        }

        return ans;
    }
}