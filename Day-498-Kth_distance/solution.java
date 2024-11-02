class Solution {
    public boolean checkDuplicatesWithinK(int[] arr, int k) {
        // your code
        int n = arr.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (hm.getOrDefault(arr[i], -1) == -1) {
                hm.put(arr[i], i);
            } else {
                if (i - hm.get(arr[i]) > k) {
                    hm.put(arr[i], i);
                } else {
                    return true;
                }
            }
        }

        return false;
    }
}