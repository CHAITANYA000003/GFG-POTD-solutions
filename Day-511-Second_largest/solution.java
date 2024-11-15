class Solution {
    public int getSecondLargest(int[] arr) {
        //Code Here
        int maxi = Integer.MIN_VALUE;
        int second_maxi = Integer.MIN_VALUE;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] > maxi) {
                second_maxi = maxi;
                maxi = arr[i];
            } else if (arr[i] > second_maxi && arr[i] != maxi) {
                second_maxi = arr[i];
            }
        }

        if (second_maxi == Integer.MIN_VALUE) {
            return -1;
        }
        return second_maxi;
    }
}