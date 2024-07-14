class Solution {
    void segregate0and1(int[] arr) {
        // code here
        int ones = 0;
        int zeros = 0;
        for (int x : arr) {
            if (x == 1)
                ones++;
            else
                zeros++;
        }
        int i;
        i = 0;
        while (zeros > 0) {
            arr[i++] = 0;
            zeros--;
        }
        while (ones > 0) {
            arr[i++] = 1;
            ones--;
        }
    }
}