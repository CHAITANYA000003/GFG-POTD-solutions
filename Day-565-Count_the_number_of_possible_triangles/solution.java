class Solution {
    // Function to count the number of possible triangles.
    static int countTriangles(int arr[]) {
        // code here
        int n = arr.length;
        Arrays.sort(arr);
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }

        int count = 0;
        for (int i = 0; i < n - 2; i++) {
            int greater = arr[i];
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                if (arr[left] + arr[right] > greater) {
                    count += right - left;
                    left++;
                } else {
                    right--;
                }
            }
        }

        return count;
    }
}