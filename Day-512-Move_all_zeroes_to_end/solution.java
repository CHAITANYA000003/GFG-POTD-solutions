class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int n = arr.length;
        int ind = 0;
        int i = 0;
        while (i < n) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[ind];
                arr[ind] = temp;
                ind++;
            }
            i++;
        }
    }
}