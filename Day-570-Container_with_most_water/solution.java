class Solution {

    public int maxWater(int arr[]) {
        // Code Here
        int left = 0;
        int right = arr.length - 1;
        int maxi = 0;
        while (left < right) {
            maxi = Math.max(maxi, Math.min(arr[left], arr[right]) * (right - left));
            if (arr[left] <= arr[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxi;
    }
}