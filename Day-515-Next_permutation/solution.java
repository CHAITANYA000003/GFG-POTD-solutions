class Solution {
    void reverse(int[] arr, int start, int end) {
        for (int i = start; i < (start + end) / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[start + end - 1 - i];
            arr[start + end - 1 - i] = temp;
        }
    }

    void nextPermutation(int[] arr) {
        // code here
        int ind = -1;
        int n = arr.length;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                ind = i;
                break;
            }
        }
        if (ind == -1) {
            // it means that the array is in descending order,i.e. largest permutation
            // return the smallest possible permutation => reverse of the array
            reverse(arr, 0, n);
            return;
        }

        // we need to find the element that is just greater than the ind element
        for (int i = n - 1; i > ind; i--) {
            if (arr[i] > arr[ind]) {
                int temp = arr[ind];
                arr[ind] = arr[i];
                arr[i] = temp;
                break;
            }
        }
        reverse(arr, ind + 1, n);
        return;
    }
}