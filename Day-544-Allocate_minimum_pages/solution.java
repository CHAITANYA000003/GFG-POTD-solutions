class Solution {
    public static int helper(int[] arr, int mid) {
        // returns how many students can be possible with given no. of pages
        int stud = 1;
        int pages = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (pages + arr[i] <= mid) {
                pages += arr[i];
            } else {
                stud++;
                pages = arr[i];
            }
        }

        return stud;
    }

    public static int findPages(int[] arr, int k) {
        // code here
        if (k > arr.length) {
            return -1;
        }
        int low = Integer.MIN_VALUE; // we'll store the maximum element in this
        int high = 0; // to store the sum of the array elements
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            high += arr[i];
            low = Math.max(low, arr[i]);
        }

        while (low <= high) {
            int mid = (low + high) >> 1;
            if (helper(arr, mid) > k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }
}