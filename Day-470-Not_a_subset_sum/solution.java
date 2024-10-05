class Solution {
    public long findSmallest(int[] arr) {
        // Your code goes here
        long num = 1;
        for (int x : arr) {
            if (num < x) {
                return num;
            }
            num += x;
        }

        return num;
    }
}