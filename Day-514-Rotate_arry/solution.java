class Solution {
    static void reverse(int[] arr, int start, int end) {
        for (int i = 0; i < (end - start) / 2; i++) {
            int temp = arr[start + i];
            arr[start + i] = arr[end - i - 1];
            arr[end - i - 1] = temp;
        }
    }

    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        // add your code here
        int n = arr.length;
        d = d % n;

        reverse(arr, 0, d);
        reverse(arr, d, n);
        reverse(arr, 0, n);
    }
}