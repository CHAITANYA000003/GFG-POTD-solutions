class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int x : arr) {
            hm.put(x, hm.getOrDefault(x, 0) + 1);
        }

        for (int x : arr) {
            if (x == target - x) {
                if (hm.get(x) >= 2) {
                    return true;
                }
            } else if (hm.containsKey(target - x)) {
                return true;
            }
        }

        return false;
    }
}