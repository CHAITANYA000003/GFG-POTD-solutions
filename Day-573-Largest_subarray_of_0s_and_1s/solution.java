class Solution {
    public int maxLen(int[] arr) {
        // Your code here
        int n = arr.length;

        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, -1);
        int sum = 0;
        int maxi = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i] == 0 ? -1 : 1;
            if (hm.containsKey(sum)) {
                maxi = Math.max(maxi, i - hm.get(sum));
            }
            if (!hm.containsKey(sum)) {
                hm.put(sum, i);
            }
        }

        return maxi;
    }
}