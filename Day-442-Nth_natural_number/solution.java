class Solution {
    long findNth(long n) {

        long ans = 0;
        long multiplier = 1;

        while (n > 0) {
            ans += (n % 9) * multiplier;
            n /= 9;
            multiplier *= 10;
        }

        return ans;
    }
}