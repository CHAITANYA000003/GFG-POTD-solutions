class Solution {
    int countPairs(int arr[], int target) {
        // Your code here
        int ans = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int x : arr) {
            hm.put(x, hm.getOrDefault(x, 0) + 1);
        }

        for (int x : arr) {
            if (target - x == x) {
                ans += hm.get(x) - 1;
            } else if (hm.containsKey(target - x)) {
                ans += hm.get(target - x);
            }
        }

        return ans / 2;
    }
}