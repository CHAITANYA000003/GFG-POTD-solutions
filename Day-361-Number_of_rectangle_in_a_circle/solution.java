class Solution {
    int rectanglesInCircle(int r) {
        // code here
        int ans = 0;
        for(int i=1; i<2*r; i++)
        {
            ans += Math.floor(Math.sqrt(4*r*r - i*i));
        }
        return ans;
    }
};