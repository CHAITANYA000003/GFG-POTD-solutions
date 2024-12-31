class Solution {
    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        HashSet<Integer> hs = new HashSet<>();
        for (int x : arr) {
            hs.add(x);
        }

        int n = arr.length;
        int maxi = 1;
        for (int i = 0; i < n; i++) {
            if (hs.contains(arr[i] - 1)) {
                continue;
            } else {
                int curr_len = 1;
                int num = arr[i];
                while (hs.contains(num + 1)) {
                    curr_len++;
                    num++;
                }
                maxi = Math.max(maxi, curr_len);
            }
        }

        return maxi;
    }
}