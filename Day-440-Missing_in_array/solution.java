class Solution {

    // Note that the size of the array is n-1
    int missingNumber(int n, int arr[]) {
        // Your Code Here
        int expected_sum = (n * (n + 1)) / 2;
        int actual_sum = 0;
        for (int x : arr) {
            actual_sum += x;
        }

        return expected_sum - actual_sum;
    }
}