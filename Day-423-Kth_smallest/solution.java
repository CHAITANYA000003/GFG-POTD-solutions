class Solution {
    public static int kthSmallest(int[] arr, int k) {
        // Your code here
        int n = arr.length;
        int max_element = arr[0];
        for (int i = 1; i < n; i++) {
            max_element = arr[i] > max_element ? arr[i] : max_element;
        }

        boolean[] storage = new boolean[max_element + 1];
        for (int i = 0; i < n; i++) {
            storage[arr[i]] = true;
        }

        int count = 0;
        int i = 0;
        for (; i <= max_element; i++) {
            if (!storage[i]) {
                continue;
            } else {
                count++;
                if (count == k) {
                    break;
                }
            }
        }

        return i;
    }
}