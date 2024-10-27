class Solution {
    public boolean findTriplet(int[] arr) {
        int n = arr.length;
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < n; i++) {
            hs.add(arr[i]);
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (hs.contains(arr[i] + arr[j])) {
                    return true;
                }
            }
        }

        return false;
    }
}