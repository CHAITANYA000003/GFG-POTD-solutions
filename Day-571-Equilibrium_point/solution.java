class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
        // code here
        int n = arr.length;
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
        }

        int leftSum = 0;
        int rightSum = totalSum;
        for (int i = 0; i < n; i++) {
            leftSum = totalSum - rightSum;
            rightSum -= arr[i];
            if (leftSum == rightSum) {
                return i;
            }
        }

        return -1;
    }
}