class Solution {
    long floorSqrt(long n) {
        // Your code here
        long low = 0;
        long high = n;
        while (low <= high) {
            long mid = (high - low) / 2 + low;
            if (mid * mid == n) {
                return mid;
            } else if (mid * mid < n) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return high;
    }
}