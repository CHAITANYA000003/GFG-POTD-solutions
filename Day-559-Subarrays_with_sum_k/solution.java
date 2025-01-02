class Solution {
    public int countSubarrays(int arr[], int k) {
        // code here
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 1);
        int curr = 0;
        int ans = 0;
        for (int x : arr) {
            curr += x;
            if (hm.containsKey(curr - k)) {
                ans += hm.get(curr - k);
            }
            hm.put(curr, hm.getOrDefault(curr, 0) + 1);
        }

        return ans;
    }
}