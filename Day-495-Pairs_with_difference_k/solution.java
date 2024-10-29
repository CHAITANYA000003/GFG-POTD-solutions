class Solution {
    int countPairsWithDiffK(int[] arr, int k) {
        // code here
        int ans = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int x : arr) {
            hm.put(x, hm.getOrDefault(x, 0) + 1);
        }

        if (k == 0) {
            for (int x : arr) {
                ans += hm.get(x) - 1;
            }
        } else {
            for (int x : arr) {
                ans += hm.getOrDefault(x + k, 0);
                ans += hm.getOrDefault(x - k, 0);
            }
        }

        return ans / 2;
    }
}