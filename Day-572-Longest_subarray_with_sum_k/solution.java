class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        int n = arr.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, -1);
        int maxLen = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (hm.containsKey(sum - k)) {
                maxLen = Math.max(maxLen, i - hm.get(sum - k));
            }
            if (!hm.containsKey(sum)) {
                hm.put(sum, i);
            }
        }

        return maxLen;
    }
}